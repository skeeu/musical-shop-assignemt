package builder.keyboard;

import builder.KeyboardInstrumentBuilder;
import instruments.keyboard.digital.electronic.MidiKeyboard;

import java.util.Scanner;

public class MidiKeyboardBuilder extends KeyboardInstrumentBuilder {
    private String title;
    private int productionYear;
    private String productionCountry;
    private String color;
    private double price;
    private String keyMaterial;
    private String recordingCapabilities;
    private String connectivityOptions;
    private String keyAmount;

    private final Scanner sc;

    public MidiKeyboardBuilder(Scanner sc) {
        this.sc = sc;
    }

    public MidiKeyboardBuilder withTitle() {
        System.out.println("Enter title: ");
        this.title = sc.next();
        return this;
    }

    public MidiKeyboardBuilder withProductionYear() {
        System.out.println("Enter production year: ");
        this.productionYear = sc.nextInt();
        return this;
    }

    public MidiKeyboardBuilder withProductionCountry() {
        System.out.println("Enter production country: ");
        this.productionCountry = sc.next();
        return this;
    }

    public MidiKeyboardBuilder withColor() {
        System.out.println("Enter color: ");
        this.color = sc.next();
        return this;
    }

    public MidiKeyboardBuilder withPrice() {
        System.out.println("Enter price: ");
        this.price = sc.nextInt();
        return this;
    }

    public MidiKeyboardBuilder withKeyMaterial() {
        System.out.println("Enter key material: ");
        this.keyMaterial = sc.next();
        return this;
    }

    public MidiKeyboardBuilder withRecordingCapabilities() {
        System.out.println("Enter recording capabilities: ");
        this.recordingCapabilities = sc.next();
        return this;
    }

    public MidiKeyboardBuilder withConnectivityOptions() {
        System.out.println("Enter connectivity options: ");
        this.connectivityOptions = sc.next();
        return this;
    }

    public MidiKeyboardBuilder withKeyAmount() {
        System.out.println("Enter key amount: ");
        this.keyAmount = sc.next();
        return this;
    }

    public MidiKeyboard build() {
        return new MidiKeyboard(title, productionYear, productionCountry,
                color, price, keyMaterial, recordingCapabilities,
                connectivityOptions, keyAmount);
    }
}
