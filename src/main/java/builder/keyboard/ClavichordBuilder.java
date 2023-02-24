package builder.keyboard;

import builder.KeyboardInstrumentBuilder;
import instruments.keyboard.acoustic.dynamic.Clavichord;

import java.util.Scanner;

public class ClavichordBuilder extends KeyboardInstrumentBuilder {
    private String title;
    private int productionYear;
    private String productionCountry;
    private String color;
    private double price;
    private String keyMaterial;
    private String soundGenerationMethod;
    private String hammerMaterial;
    private String shape;
    private boolean withTableLegs;

    private final Scanner sc;

    public ClavichordBuilder(Scanner sc) {
        this.sc = sc;
    }


    public ClavichordBuilder withTitle() {
        System.out.println("Enter title: ");
        this.title = sc.next();
        return this;
    }

    public ClavichordBuilder withProductionYear() {
        System.out.println("Enter production year: ");
        this.productionYear = sc.nextInt();
        return this;
    }

    public ClavichordBuilder withProductionCountry() {
        System.out.println("Enter production country: ");
        this.productionCountry = sc.next();
        return this;
    }

    public ClavichordBuilder withColor() {
        System.out.println("Enter color: ");
        this.color = sc.next();
        return this;
    }

    public ClavichordBuilder withPrice() {
        System.out.println("Enter price: ");
        this.price = sc.nextInt();
        return this;
    }

    public ClavichordBuilder withKeyMaterial(String keyMaterial) {
        System.out.println("Enter key material: ");
        this.keyMaterial = sc.next();
        return this;
    }

    public ClavichordBuilder withSoundGenerationMethod() {
        System.out.println("Enter sound generation method: ");
        this.soundGenerationMethod = sc.next();
        return this;
    }

    public ClavichordBuilder withHammerMaterial() {
        System.out.println("Enter hammer material: ");
        this.hammerMaterial = sc.next();
        return this;
    }

    public ClavichordBuilder withShape() {
        System.out.println("Enter shape: ");
        this.shape = sc.next();
        return this;
    }

    public ClavichordBuilder withTableLegs() {
        System.out.println("Enter 1 if true: ");
        this.withTableLegs = sc.nextInt() == 1;
        return this;
    }

    public Clavichord build() {
        Clavichord clavichord = new Clavichord(title, productionYear, productionCountry, color, price, keyMaterial, soundGenerationMethod, hammerMaterial, shape, withTableLegs);
        return clavichord;
    }

}
