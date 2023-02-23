package shop.menus;

import database.InstrumentsDB;
import instruments.Instrument;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Menu {
    private final String name;
    private final Scanner sc;
    private final List<String> options;

    private static final InstrumentsDB db = new InstrumentsDB();
    private static final Map<String, Class> instrumentClasses = InstrumentsDB.instrumentClasses;
    private static final List<Instrument> allInstruments = db.findAll();
    private List<Instrument> instruments = allInstruments;
    private int command;

    public Menu(String name, Scanner sc, List<String> options) {
        this.name = name;
        this.sc = sc;
        this.options = options;
    }

    public static List<Instrument> getAllInstruments() {
        return allInstruments;
    }

    public InstrumentsDB getDb() {
        return db;
    }
    public void setInstruments(List<Instrument> instruments) {
        this.instruments = instruments;
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
        this.command = command;
    }

    private void showOptions() {

    }
    public <T> List<T> chooseOption() {
        return null;
    }
    private <T> List<T> handleOption(){
        return null;
    }
    public String getName() {
        return name;
    };

    public void showInstruments() {
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

    private void paginationPage(int pageSize, int currentPage, List<Instrument> arr) {
        int startIndex = pageSize*currentPage;
        int lastIndex = Math.min(startIndex + pageSize, arr.size());
        List<Instrument> subArr = arr.subList(startIndex, lastIndex);
        for(int i = 0; i < subArr.size(); i++) {
            System.out.println("\n" + (startIndex+i) + ".\n" + subArr.get(i));
        }
    }
}
