package builder.keyboard;

import builder.KeyboardInstrumentBuilder;
import instruments.keyboard.acoustic.statik.reed.PumpOrgan;

import java.util.Scanner;

public class PumpOrganBuilder extends KeyboardInstrumentBuilder {
    private String title;
    private int productionYear;
    private String productionCountry;
    private String color;
    private double price;
    private String keyMaterial;
    private String soundGenerationMethod;
    private String soundProductionMethod;
    private String airPressureRequirements;

    private final Scanner sc;

    public PumpOrganBuilder(Scanner sc) {
        this.sc = sc;
    }

    public PumpOrganBuilder withTitle() {
        System.out.println("Enter title: ");
        this.title = sc.next();
        return this;
    }

    public PumpOrganBuilder withProductionYear() {
        System.out.println("Enter production year: ");
        this.productionYear = sc.nextInt();
        return this;
    }

    public PumpOrganBuilder withProductionCountry() {
        System.out.println("Enter production country: ");
        this.productionCountry = sc.next();
        return this;
    }

    public PumpOrganBuilder withColor() {
        System.out.println("Enter color: ");
        this.color = sc.next();
        return this;
    }

    public PumpOrganBuilder withPrice() {
        System.out.println("Enter price: ");
        this.price = sc.nextInt();
        return this;
    }

    public PumpOrganBuilder withKeyMaterial() {
        System.out.println("Enter key material: ");
        this.keyMaterial = sc.next();
        return this;
    }

    public PumpOrganBuilder withSoundGenerationMethod() {
        System.out.println("Enter sound generation method: ");
        this.soundGenerationMethod = sc.next();
        return this;
    }

    public PumpOrganBuilder withSoundProductionMethod() {
        System.out.println("Enter sound production method: ");
        this.soundProductionMethod = sc.next();
        return this;
    }

    public PumpOrganBuilder withAirPressureRequirements() {
        System.out.println("Enter air pressure requirements: ");
        this.airPressureRequirements = sc.next();
        return this;
    }

    public PumpOrgan build() {
        return new PumpOrgan(title, productionYear, productionCountry, color, price, keyMaterial, soundGenerationMethod, soundProductionMethod, airPressureRequirements);
    }
}
