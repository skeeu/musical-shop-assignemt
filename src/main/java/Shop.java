import shop.menus.FilterMenu;
import shop.menus.MainMenu;
import shop.menus.Menu;

import java.util.*;

public class Shop {
    private static Shop shop = null;
    private static final Scanner sc = new Scanner(System.in);
    private String activeMenu;
    private Integer yearFilter;
    private String countryFilter;
    public String selectedType;
    private final Map<String, Menu> menus = new HashMap<String, Menu>();

    private Shop() {
        Menu mainMenu = new MainMenu(sc, "main");
        Menu filterMenu = new FilterMenu(sc, "filter");

        menus.put(mainMenu.getName(), mainMenu);
        menus.put(filterMenu.getName(), filterMenu);

        activeMenu = mainMenu.getName();
    }

    public static Shop getShop() {
        if (shop == null) {
            shop = new Shop();
        }
        return shop;
    }

    public <T> void startShop() {
        while (true) {
            List<T> switchTo = menus.get(activeMenu).chooseOption();
            if (switchTo != null && switchTo.get(0) == "switchMenu") {
                activeMenu = (String) switchTo.get(1);
            }
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

//    private void defineCommand(int command) {
//        if (menu.equals("main")) {
//            switch (command) {
//                case 1 -> showInstruments("all");
//                case 2 -> showTypes();
//                case 3 -> {
//                    selecteType();
//                    showInstruments("type");
//                }
//                case 4 -> {
//                    menu = "filter";
//                    filtersMenu();
//                }
//                default -> System.out.println("Invalid command. Try again");
//            }
//        } else if (menu.equals("filter")) {
//            switch (command) {
//                case 1 -> selecteYear();
//                case 2 -> selecteCountry();
//                case 3 -> clearFilters();
//                default -> System.out.println("Invalid command. Try again");
//            }
//        }
//    }

    private void clearFilters() {
        yearFilter = null;
        countryFilter = null;
    }

//    public void filtersMenu() {
//        while (true) {
//            printFilters();
//
//            System.out.println("1) Filter by year");
//            System.out.println("2) Filter by production country");
//            System.out.println("3) Clear filters");
//
//            System.out.println("0) Back");
//
//            command = sc.nextInt();
//            if (command == 0) {
//                menu = "main";
//                break;
//            }
//            defineCommand(command);
//        }
//    }

//    public void selecteYear() {
//        Map<Integer, Integer> years = new HashMap<>();
//        for(Instrument in: allInstruments) {
//            years.put(in.productionYear, years.getOrDefault(in.productionYear, 0) + 1);
//        }
//
//        int i = 0;
//        for(Map.Entry<Integer, Integer> entry: years.entrySet()) {
//            System.out.println(i + ") " + entry.getKey() + " (" + entry.getValue() + ")");
//            i++;
//        }
//        System.out.println("Choose year ");
//
//        while (true) {
//            yearFilter = sc.nextInt();
//            if (yearFilter > (years.size()-1) || yearFilter < 0) {
//                System.out.println("\n\nNot correct year");
//                break;
//            }
//            yearFilter = (Integer) years.keySet().toArray()[yearFilter];
//            showInstruments("all");
//            break;
//        }
//    }
//
//    public void selecteCountry() {
//        Map<String, Integer> countries = new HashMap<>();
//        for(Instrument in: allInstruments) {
//            countries.put(in.productionCountry, countries.getOrDefault(in.productionCountry, 0) + 1);
//        }
//
//        int i = 0;
//        for(Map.Entry<String, Integer> entry: countries.entrySet()) {
//            System.out.println(i + ") " + entry.getKey() + " (" + entry.getValue() + ")");
//            i++;
//        }
//        System.out.println("Choose country ");
//
//        while (true) {
//            int cmd = sc.nextInt();
//            if (cmd > (countries.size()-1) || cmd < 0) {
//                System.out.println("\n\nNot correct country");
//                break;
//            }
//            countryFilter = (String) countries.keySet().toArray()[cmd];
//            showInstruments("all");
//            break;
//        }
//    }
}
