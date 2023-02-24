package shop.menus;

import database.InstrumentsDB;
import instruments.Instrument;

import java.lang.reflect.InvocationTargetException;
import java.util.*;

public class Menu {
    private final String name;
    private final Scanner sc;
    private final List<String> options;

    private static final InstrumentsDB db = new InstrumentsDB();
    private static final Map<String, Class> instrumentClasses = InstrumentsDB.instrumentClasses;
    private static List<Instrument> instruments = db.findAll();
    private static int command;
    private static Integer yearFilter;
    private static String countryFilter;

    public Menu(String name, Scanner sc, List<String> options) {
        this.name = name;
        this.sc = sc;
        this.options = options;
    }

    public static List<Instrument> getAllInstruments() {
        return db.findAll();
    }

    public static String getCountryFilter() {
        return countryFilter;
    }

    public static void setCountryFilter(String countryFilter) {
        Menu.countryFilter = countryFilter;
    }

    public static Integer getYearFilter() {
        return yearFilter;
    }

    public static void setYearFilter(Integer yearFilter) {
        Menu.yearFilter = yearFilter;
    }

    public InstrumentsDB getDb() {
        return db;
    }
    public void setInstruments(List<Instrument> instruments) {
        Menu.instruments = instruments;
    }

    public List<Instrument> getInstruments() {
        return instruments;
    }

    public List<String> getOptions() {
        return options;
    }
    public Map<String, Class> getInstrumentClasses() {
        return instrumentClasses;
    }
    public Scanner getSc() {
        return sc;
    }
    public int getCommand() {
        return command;
    }
    public void setCommand(int command) {
        Menu.command = command;
    }

    public <T> List<T> chooseOption() {
        return null;
    }
    public String getName() {
        return name;
    };

    public void showInstruments() {
        List<Instrument> instruments = applyFilter("year", getAllInstruments());
        instruments = applyFilter("country", instruments);
        setInstruments(instruments);
        if (instruments.size() == 0) {
            System.out.println("Instruments not found");
        } else {
            int currentPage = 0;
            double pageSize = 5.0;
            int totalPages = (int) Math.ceil(instruments.size() / pageSize);
            while (true) {
                paginationPage((int) pageSize, currentPage, instruments);
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

    private List<Instrument> applyFilter(String type, List<Instrument> instruments) {
        List<Instrument> filtered = new ArrayList<>();

        switch (type) {
            case "year" -> {
                if (getYearFilter() != null) {
                    for(Instrument ins: instruments) {
                        if(Objects.equals(ins.productionYear, getYearFilter())) {
                            filtered.add(ins);
                        }
                    }
                } else {
                    filtered = instruments;
                }
            }
            case "country" -> {
                if (getCountryFilter() != null) {
                    for(Instrument ins: instruments) {
                        if(Objects.equals(ins.productionCountry, getCountryFilter())) {
                            filtered.add(ins);
                        }
                    }
                } else {
                    filtered = instruments;
                }
            }
        }
        return filtered;
    }

    private void paginationPage(int pageSize, int currentPage, List<Instrument> arr) {
        int startIndex = pageSize*currentPage;
        int lastIndex = Math.min(startIndex + pageSize, arr.size());
        List<Instrument> subArr = arr.subList(startIndex, lastIndex);
        for(int i = 0; i < subArr.size(); i++) {
            System.out.println("\n" + (startIndex+i) + ".\n" + subArr.get(i));
        }
    }
}
