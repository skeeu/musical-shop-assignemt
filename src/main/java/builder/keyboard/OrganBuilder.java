package builder.keyboard;

import builder.KeyboardInstrumentBuilder;
import instruments.keyboard.acoustic.statik.wind.Organ;

import java.util.Scanner;

public class OrganBuilder extends KeyboardInstrumentBuilder {
    private String title;
    private int productionYear;
    private String productionCountry;
    private String color;
    private double price;
    private String keyMaterial;
    private String soundGenerationMethod;
    private String soundProductionMethod;
    private String airProductionMechanism;
    private String specialisation;

    private final Scanner sc;

    public OrganBuilder(Scanner sc) {
        this.sc = sc;
    }

    public OrganBuilder withTitle() {
        System.out.println("Enter title: ");
        this.title = sc.next();
        return this;
    }

    public OrganBuilder withProductionYear() {
        System.out.println("Enter production year: ");
        this.productionYear = sc.nextInt();
        return this;
    }

    public OrganBuilder withProductionCountry() {
        System.out.println("Enter production country: ");
        this.productionCountry = sc.next();
        return this;
    }

    public OrganBuilder withColor() {
        System.out.println("Enter color: ");
        this.color = sc.next();
        return this;
    }

    public OrganBuilder withPrice() {
        System.out.println("Enter price: ");
        this.price = sc.nextInt();
        return this;
    }

    public OrganBuilder withKeyMaterial() {
        System.out.println("Enter key material: ");
        this.keyMaterial = sc.next();
        return this;
    }

    public OrganBuilder withSoundGenerationMethod() {
        System.out.println("Enter sound generation method: ");
        this.soundGenerationMethod = sc.next();
        return this;
    }

    public OrganBuilder withSoundProductionMethod() {
        System.out.println("Enter sound production method: ");
        this.soundProductionMethod = sc.next();
        return this;
    }

    public OrganBuilder withAirProductionMechanism() {
        System.out.println("Enter air production mechanism: ");
        this.airProductionMechanism = sc.next();
        return this;
    }

    public OrganBuilder withSpecialisation() {
        System.out.println("Enter specialisation: ");
        this.specialisation = sc.next();
        return this;
    }

    public Organ build() {
        Organ organ = new Organ(title, productionYear, productionCountry, color, price, keyMaterial, soundGenerationMethod, soundProductionMethod, airProductionMechanism, specialisation);
        return organ;
    }
}
