package builder.keyboard;

import builder.KeyboardInstrumentBuilder;
import instruments.keyboard.digital.electro_mechanic.DigitalPiano;

import java.util.Scanner;

public class DigitalPianoBuilder extends KeyboardInstrumentBuilder {
    private String title;
    private int productionYear;
    private String productionCountry;
    private String color;
    private double price;
    private String keyMaterial;
    private String recordingCapabilities;
    private String pedalsAmount;
    private String keysType;

    private final Scanner sc;

    public DigitalPianoBuilder(Scanner sc) {
        this.sc = sc;
    }

    public DigitalPianoBuilder withTitle() {
        System.out.println("Enter title: ");
        this.title = sc.next();
        return this;
    }

    public DigitalPianoBuilder withProductionYear() {
        System.out.println("Enter production year: ");
        this.productionYear = sc.nextInt();
        return this;
    }

    public DigitalPianoBuilder withProductionCountry() {
        System.out.println("Enter production country: ");
        this.productionCountry = sc.next();
        return this;
    }

    public DigitalPianoBuilder withColor() {
        System.out.println("Enter color: ");
        this.color = sc.next();
        return this;
    }

    public DigitalPianoBuilder withPrice() {
        System.out.println("Enter price: ");
        this.price = sc.nextInt();
        return this;
    }

    public DigitalPianoBuilder withKeyMaterial() {
        System.out.println("Enter key material: ");
        this.keyMaterial = sc.next();
        return this;
    }

    public DigitalPianoBuilder withRecordingCapabilities() {
        System.out.println("Enter recording capabilities: ");
        this.recordingCapabilities = sc.next();
        return this;
    }

    public DigitalPianoBuilder withPedalsAmount() {
        System.out.println("Enter pedals amount: ");
        this.pedalsAmount = sc.next();
        return this;
    }

    public DigitalPianoBuilder withKeysType() {
        System.out.println("Enter keys type: ");
        this.keysType = sc.next();
        return this;
    }

    public DigitalPiano build() {
        DigitalPiano piano = new DigitalPiano(title, productionYear, productionCountry, color, price, keyMaterial, recordingCapabilities, pedalsAmount, keysType);
        return piano;
    }
}
