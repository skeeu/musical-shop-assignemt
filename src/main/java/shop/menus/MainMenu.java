package shop.menus;

import builder.Factory;
import instruments.Instrument;

import java.lang.reflect.InvocationTargetException;
import java.util.*;

public class MainMenu extends Menu {
    private Factory factory;

    public MainMenu(Scanner sc, String name) {
        super(name, sc, Arrays.asList("Show all instruments", "Show types of instruments",
                "Show instruments of type", "Filters", "Create and save new instrument"));
        this.factory = new Factory(sc);
    }

    @Override
    public <T> List<T> chooseOption() {
        System.out.println("\n\nChoose an option");
        showOptions();
        setCommand(getSc().nextInt());
        return handleOption();
    }

    private void showOptions() {
        for(int i = 1; i <= getOptions().size(); i++) {
            System.out.println(i + ") " + getOptions().get(i-1));
        }
    }

    private <T> List<T> handleOption() {
        switch (getCommand()) {
            case 1 -> {
                showInstruments();
                return null;
            }
            case 2 -> {
                showTypes();
                return null;
            }
            case 3 -> {
                String type = selecteType();
                if (type != null) {
                    setInstruments(applyTypeFilter(type));
                    showInstruments();
                }
                return null;
            }
            case 4 -> {
                return (List<T>) Arrays.asList("switchMenu", "filter");
            }
            case 5 -> {
                String type = selecteType();
                if (type != null) {
                    factory.createAndSaveInstrument(type);
                    setInstruments(getAllInstruments());
                }
                return null;
            }
            default -> {
                System.out.println("Invalid command. Try again");
                return null;
            }
        }
    }

    public String selecteType () {
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

            setCommand(getSc().nextInt());
            if (getCommand() < 0 || getCommand() > (instances.size()-1)) {
                System.out.println("Invalid option");
                return null;
            } else {
                return (String) instances.keySet().toArray()[getCommand()];
            }
        }
    }

    private void showTypes() {
        System.out.println("_".repeat(5));
        for(String type: getInstrumentClasses().keySet()) {
            System.out.println(type);
        }
        System.out.println("_".repeat(5));
    }

    public Map<String, Integer> calculateInstances () {
        Map<String, Integer> types = new HashMap<>();
        for(Instrument ins: getAllInstruments()) {
            types.put(ins.getClass().getSimpleName(), types.getOrDefault(ins.getClass().getSimpleName(), 0) + 1);
        }
        System.out.println(types);
        return types;
    }

    public List<Instrument> applyYearFilter(List<Instrument> instruments, Integer yearFilter) {
        List<Instrument> filtered = new ArrayList<>();
        for(Instrument ins: instruments) {
            if(Objects.equals(ins.productionYear, yearFilter)) {
                filtered.add(ins);
            }
        }
        return filtered;
    }

    public List<Instrument> applyCountryFilter(List<Instrument> instruments, String countryFilter) {
        List<Instrument> filtered = new ArrayList<>();
        for(Instrument ins: instruments) {
            if(Objects.equals(ins.productionCountry, countryFilter)) {
                filtered.add(ins);
            }
        }
        return filtered;
    }

    public List<Instrument> applyTypeFilter(String type) {
        return getDb().findIntrumentsByType(type);
    }
}
