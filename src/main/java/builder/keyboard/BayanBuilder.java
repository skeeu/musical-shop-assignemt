package builder.keyboard;

import builder.KeyboardInstrumentBuilder;
import instruments.keyboard.acoustic.statik.reed.Bayan;

import java.util.Scanner;

public class BayanBuilder extends KeyboardInstrumentBuilder {
    private String title;
    private int productionYear;
    private String productionCountry;
    private String color;
    private double price;
    private String keyMaterial;
    private String soundGenerationMethod;
    private String soundProductionMethod;
    private String airPressureRequirements;
    private int rowsNumber;

    private final Scanner sc;

    public BayanBuilder(Scanner sc){
        this.sc = sc;
    }

    public BayanBuilder withTitle() {
        System.out.println("Enter title: ");
        this.title = sc.next();
        return this;
    }

    public BayanBuilder withProductionYear() {
        System.out.println("Enter Production Year: ");
        this.productionYear = sc.nextInt();
        return this;
    }

    public BayanBuilder withProductionCountry() {
        System.out.println("Enter Production Country: ");
        this.productionCountry = sc.next();
        return this;
    }

    public BayanBuilder withColor() {
        System.out.println("Enter Color: ");
        this.color = sc.next();
        return this;
    }

    public BayanBuilder withPrice() {
        System.out.println("Enter price: ");
        this.price = sc.nextInt();
        return this;
    }

    public BayanBuilder withKeyMaterial() {
        System.out.println("Enter key material: ");
        this.keyMaterial = sc.next();
        return this;
    }

    public BayanBuilder withSoundGenerationMethod() {
        System.out.println("Enter sound generation method: ");
        this.soundGenerationMethod = sc.next();
        return this;
    }

    public BayanBuilder withSoundProductionMethod() {
        System.out.println("Enter sound production method: ");
        this.soundProductionMethod = sc.next();
        return this;
    }

    public BayanBuilder withAirPressureRequirements() {
        System.out.println("Enter air pressure requirements: ");
        this.airPressureRequirements = sc.next();
        return this;
    }

    public BayanBuilder withRowsNumber() {
        System.out.println("Enter rows number: ");
        this.rowsNumber = sc.nextInt();
        return this;
    }

    public Bayan build() {
        Bayan bayan = new Bayan(title, productionYear, productionCountry, color, price,
                keyMaterial, soundGenerationMethod, soundProductionMethod, airPressureRequirements, rowsNumber);
        return bayan;
    }
}
