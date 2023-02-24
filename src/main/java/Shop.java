import shop.menus.FilterMenu;
import shop.menus.MainMenu;
import shop.menus.Menu;

import java.util.*;

public class Shop {
    private static Shop shop = null;
    private static final Scanner sc = new Scanner(System.in);
    private String activeMenu;
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
            printFilters();
            List<T> switchTo = menus.get(activeMenu).chooseOption();
            if (switchTo != null && switchTo.get(0) == "switchMenu") {
                activeMenu = (String) switchTo.get(1);
            }
        }
    }

    private void printFilters() {
        if(Menu.getYearFilter() != null || Menu.getCountryFilter() != null) {
            System.out.println("\n\n|-----------------------|");
        }
        if (Menu.getYearFilter() != null) {
            System.out.println("Active filter by year: " + Menu.getYearFilter());
        }
        if (Menu.getCountryFilter() != null) {
            System.out.println("Active filter by country: " + Menu.getCountryFilter());
        }
        if(Menu.getYearFilter() != null || Menu.getCountryFilter() != null) {
            System.out.println("|-----------------------|");
        }
    }
}
