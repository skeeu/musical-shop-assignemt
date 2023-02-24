package shop.menus;

import database.InstrumentsDB;
import instruments.Instrument;

import java.util.*;

public class FilterMenu extends Menu{
    public FilterMenu(Scanner sc, String name) {
        super(name, sc, Arrays.asList("Filter by year", "Filter by country",
                "Clear Filters"));
    }

    private void showOptions() {
        for(int i = 1; i <= getOptions().size(); i++) {
            System.out.println(i + ") " + getOptions().get(i-1));
        }
        System.out.println("\n0) Back");
    }

    @Override
    public <T> List<T> chooseOption() {
        System.out.println("\n\nChoose an option");
        showOptions();
        setCommand(getSc().nextInt());
        return handleOption();
    }

    private <T> List<T> handleOption() {
        switch (getCommand()) {
            case 0 -> {
                return (List<T>) Arrays.asList("switchMenu", "main");
            }
            case 1 -> {
                chooseYearFilter();
                return null;
            }
            case 2 -> {
                chooseCountryFilter();
                return null;
            }
            case 3 -> {
                clearFilters();
                return null;
            }
            default -> {
                System.out.println("Invalid command. Try again");
                return null;
            }
        }
    }

    private void clearFilters(){
        setCountryFilter(null);
        setYearFilter(null);
        System.out.println("You cleared all filters");
    }

    private void chooseYearFilter() {
        List<Instrument> instruments = getAllInstruments();
        Map<Integer, Integer> years = new HashMap<>();
        for(Instrument in: instruments) {
            years.put(in.productionYear, years.getOrDefault(in.productionYear, 0) + 1);
        }

        int i = 0;
        for(Map.Entry<Integer, Integer> entry: years.entrySet()) {
            System.out.println(i + ") " + entry.getKey() + " (" + entry.getValue() + ")");
            i++;
        }
        System.out.println("Choose year ");

        while (true) {
            Integer yearFilter = getSc().nextInt();
            if (yearFilter > (years.size()-1) || yearFilter < 0) {
                System.out.println("\n\nNot correct year");
            } else {
                setYearFilter((Integer) years.keySet().toArray()[yearFilter]);
                break;
            }
        }
    }

    private void chooseCountryFilter() {
        List<Instrument> instruments = getAllInstruments();
        Map<String, Integer> countries = new HashMap<>();
        for(Instrument in: instruments) {
            countries.put(in.productionCountry, countries.getOrDefault(in.productionCountry, 0) + 1);
        }

        int i = 0;
        for(Map.Entry<String, Integer> entry: countries.entrySet()) {
            System.out.println(i + ") " + entry.getKey() + " (" + entry.getValue() + ")");
            i++;
        }
        System.out.println("Choose country ");

        while (true) {
            int cmd = getSc().nextInt();
            if (cmd > (countries.size()-1) || cmd < 0) {
                System.out.println("\n\nNot correct country");
            } else {
                setCountryFilter((String) countries.keySet().toArray()[cmd]);
                break;
            }
        }
    }
}
