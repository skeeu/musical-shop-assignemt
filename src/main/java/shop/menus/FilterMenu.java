package shop.menus;

import database.InstrumentsDB;
import instruments.Instrument;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

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
            default -> {
                return null;
            }
        }
//        switch (command) {
//            case 1 -> {
//                showInstruments();
//                return null;
//            }
//            case 2 -> {
//                showTypes();
//                return null;
//            }
//            case 3 -> {
//                selecteType();
//                showInstruments();
//                return null;
//            }
//            case 4 -> {
//                return (List<T>) Arrays.asList("switchMenu", "filter");
//            }
//            default -> {
//                System.out.println("Invalid command. Try again");
//                return null;
//            }
//        }
    }
}
