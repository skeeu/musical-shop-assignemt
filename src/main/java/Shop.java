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

    private void clearFilters() {
        yearFilter = null;
        countryFilter = null;
    }
}
