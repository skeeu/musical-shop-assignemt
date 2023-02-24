package builder.keyboard;

import builder.KeyboardInstrumentBuilder;
import instruments.keyboard.digital.electronic.Synthesizer;

import java.util.Scanner;

public class SynthesizerBuilder extends KeyboardInstrumentBuilder {
    private String title;
    private int productionYear;
    private String productionCountry;
    private String color;
    private double price;
    private String keyMaterial;
    private String recordingCapabilities;
    private String connectivityOptions;
    private int polyphony;

    private final Scanner sc;

    public SynthesizerBuilder(Scanner sc) {
        this.sc = sc;
    }

    public SynthesizerBuilder withTitle() {
        System.out.println("Enter title: ");
        this.title = sc.next();
        return this;
    }

    public SynthesizerBuilder withProductionYear() {
        System.out.println("Enter production year: ");
        this.productionYear = sc.nextInt();
        return this;
    }

    public SynthesizerBuilder withProductionCountry() {
        System.out.println("Enter production country: ");
        this.productionCountry = sc.next();
        return this;
    }

    public SynthesizerBuilder withColor() {
        System.out.println("Enter color: ");
        this.color = sc.next();
        return this;
    }

    public SynthesizerBuilder withPrice() {
        System.out.println("Enter price: ");
        this.price = sc.nextInt();
        return this;
    }

    public SynthesizerBuilder withKeyMaterial() {
        System.out.println("Enter key material: ");
        this.keyMaterial = sc.next();
        return this;
    }

    public SynthesizerBuilder withRecordingCapabilities() {
        System.out.println("Enter recording capabilities: ");
        this.recordingCapabilities = sc.next();
        return this;
    }

    public SynthesizerBuilder withConnectivityOptions() {
        System.out.println("Enter connectivity options: ");
        this.connectivityOptions = sc.next();
        return this;
    }

    public SynthesizerBuilder withPolyphony() {
        System.out.println("Enter polyphony: ");
        this.polyphony = sc.nextInt();
        return this;
    }

    public Synthesizer build() {
        return new Synthesizer(title, productionYear, productionCountry, color, price, keyMaterial,
                recordingCapabilities, connectivityOptions, polyphony);
    }
}
