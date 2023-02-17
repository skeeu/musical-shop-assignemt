import database.DatabaseHandler;
import instruments.Instrument;

import java.util.*;

public class Shop {
    public String selectedType;
    private List<Instrument> allInstruments;
    private static final DatabaseHandler db = new DatabaseHandler();
    private Map<String, Class> instrumentClasses = db.getInstrumentClasses();;
    private static final Scanner sc = new Scanner(System.in);
    private int command;
    private String menu = "main";
    private Integer yearFilter;
    private String countryFilter;

    public Shop() {
        this.allInstruments = db.findAll();
    }

    public void startShop() {
        while (true) {
            System.out.println("\n\nChoose a command: ");
            printFilters();
            System.out.println("1) Show all instruments");
            System.out.println("2) Show types of instruments");
            System.out.println("3) Show instruments of type");
            System.out.println("4) Filters");

            command = sc.nextInt();
            defineCommand(command);
        }
    }

    private void printFilters() {
        if(yearFilter != null || countryFilter != null) {
            System.out.println("\n\n|-----------------------|");
        }
        if (yearFilter != null) {
            System.out.println("Active filter by year: " + yearFilter);
        }
        if (countryFilter != null) {
            System.out.println("Active filter by country: " + countryFilter);
        }
        if(yearFilter != null || countryFilter != null) {
            System.out.println("|-----------------------|\n\n");
        }
    }

    private void defineCommand(int command) {
        if (menu.equals("main")) {
            switch (command) {
                case 1 -> showInstruments("all");
                case 2 -> showTypes();
                case 3 -> {
                    selecteType();
                    showInstruments("type");
                }
                case 4 -> {
                    menu = "filter";
                    filtersMenu();
                }
                default -> System.out.println("Invalid command. Try again");
            }
        } else if (menu.equals("filter")) {
            switch (command) {
                case 1 -> selecteYear();
                case 2 -> selecteCountry();
                case 3 -> clearFilters();
                default -> System.out.println("Invalid command. Try again");
            }
        }
    }

    private void clearFilters() {
        yearFilter = null;
        countryFilter = null;
    }

    public List<Instrument> applyFilter(String filter, List<Instrument> nonFiltered) {
        List<Instrument> filtered = new ArrayList<>();

        switch (filter) {
            case "year":
                for(Instrument ins: nonFiltered) {
                    if(Objects.equals(ins.productionYear, yearFilter)) {
                        filtered.add(ins);
                    }
                }
                break;
            case "country":
                for(Instrument ins: nonFiltered) {
                    if(Objects.equals(ins.productionCountry, countryFilter)) {
                        filtered.add(ins);
                    }
                }
                break;
        }

        return filtered;
    }

    public void showInstruments(String mode) {
        List<Instrument> instruments = new ArrayList<>();

        if(Objects.equals(mode, "all")) {
            instruments = allInstruments;
        } else if (Objects.equals(mode, "type")) {
            instruments = db.findIntrumentsByType(selectedType);
        }

        if (yearFilter != null) {
            instruments = applyFilter("year", instruments);
        }

        if (countryFilter != null) {
            instruments = applyFilter("country", instruments);
        }

        if (instruments.size() == 0) {
            System.out.println("Instruments not found");
        } else {
            int currentPage = 0;
            int pageSize = 5;
            int totalPages = instruments.size() / pageSize;
            while (true) {
                paginationPage(pageSize, currentPage, instruments);
                System.out.println("\n1. Previous page \t\t\t 2.Next page");
                System.out.println("0. Leave");

                command = sc.nextInt();
                if (command == 1 && currentPage != 0) {
                    currentPage--;
                } else if (command == 2 && currentPage < (totalPages - 1)) {
                    currentPage++;
                } else if (command == 0) {
                    break;
                } else {
                    System.out.println("\nInvalid command. Try again\n");
                }
            }
        }
    }

    public void paginationPage(int pageSize, int currentPage, List<Instrument> arr) {
        int startIndex = pageSize*currentPage;
        int lastIndex = Math.min(startIndex + pageSize, arr.size());
        List<Instrument> subArr = arr.subList(startIndex, lastIndex);
        for(int i = 0; i < subArr.size(); i++) {
            System.out.println("\n" + (startIndex+i) + ".\n" + subArr.get(i));
        }
    }

    public void showTypes() {
        System.out.println("_".repeat(5));
        for(String type: instrumentClasses.keySet()) {
            System.out.println(type);
        }
        System.out.println("_".repeat(5));
    }

    public void selecteType () {
        Map<String, Integer> instances = calculateInstances();

        while (true) {
            System.out.println("_".repeat(5));
            System.out.println("Choose instrument type: ");
            int i = 0;
            for(Map.Entry<String, Integer> entry: instances.entrySet()) {
                System.out.println(i + ". " + entry.getKey() + " (" + entry.getValue() + ")");
                i++;
            }
            System.out.println("_".repeat(5));

            command = sc.nextInt();
            if (command < 0 || command > (instances.size()-1)) {
                System.out.println("Invalid option");
            } else {
                selectedType = (String) instances.keySet().toArray()[command];;
                break;
            }
        }
    }

    public Map<String, Integer> calculateInstances () {
        Map<String, Integer> types = new HashMap<>();
        for(Instrument ins: allInstruments) {
            types.put(ins.getClass().getSimpleName(), types.getOrDefault(ins.getClass().getSimpleName(), 0) + 1);
        }
        System.out.println(types);
        return types;
    }

    public void filtersMenu() {
        while (true) {
            printFilters();

            System.out.println("1) Filter by year");
            System.out.println("2) Filter by production country");
            System.out.println("3) Clear filters");

            System.out.println("0) Back");

            command = sc.nextInt();
            if (command == 0) {
                menu = "main";
                break;
            }
            defineCommand(command);
        }
    }

    public void selecteYear() {
        Map<Integer, Integer> years = new HashMap<>();
        for(Instrument in: allInstruments) {
            years.put(in.productionYear, years.getOrDefault(in.productionYear, 0) + 1);
        }

        int i = 0;
        for(Map.Entry<Integer, Integer> entry: years.entrySet()) {
            System.out.println(i + ") " + entry.getKey() + " (" + entry.getValue() + ")");
            i++;
        }
        System.out.println("Choose year ");

        while (true) {
            yearFilter = sc.nextInt();
            if (yearFilter > (years.size()-1) || yearFilter < 0) {
                System.out.println("\n\nNot correct year");
                break;
            }
            yearFilter = (Integer) years.keySet().toArray()[yearFilter];
            showInstruments("all");
            break;
        }
    }

    public void selecteCountry() {
        Map<String, Integer> countries = new HashMap<>();
        for(Instrument in: allInstruments) {
            countries.put(in.productionCountry, countries.getOrDefault(in.productionCountry, 0) + 1);
        }

        int i = 0;
        for(Map.Entry<String, Integer> entry: countries.entrySet()) {
            System.out.println(i + ") " + entry.getKey() + " (" + entry.getValue() + ")");
            i++;
        }
        System.out.println("Choose country ");

        while (true) {
            int cmd = sc.nextInt();
            if (cmd > (countries.size()-1) || cmd < 0) {
                System.out.println("\n\nNot correct country");
                break;
            }
            countryFilter = (String) countries.keySet().toArray()[cmd];
            showInstruments("all");
            break;
        }
    }
}
