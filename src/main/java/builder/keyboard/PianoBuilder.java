package builder.keyboard;

import builder.KeyboardInstrumentBuilder;
import instruments.keyboard.acoustic.dynamic.Piano;

import java.util.Scanner;

public class PianoBuilder extends KeyboardInstrumentBuilder {
    private String title;
    private int productionYear;
    private String productionCountry;
    private String color;
    private double price;
    private String keyMaterial;
    private String soundGenerationMethod;
    private String hammerMaterial;
    private String shape;
    private double height;

    private final Scanner sc;

    public PianoBuilder(Scanner sc) {
        this.sc = sc;
    }

    public PianoBuilder withTitle() {
        System.out.println("Enter title: ");
        this.title = sc.next();
        return this;
    }

    public PianoBuilder withProductionYear() {
        System.out.println("Enter production year: ");
        this.productionYear = sc.nextInt();
        return this;
    }

    public PianoBuilder withProductionCountry() {
        System.out.println("Enter production country: ");
        this.productionCountry = sc.next();
        return this;
    }

    public PianoBuilder withColor() {
        System.out.println("Enter color: ");
        this.color = sc.next();
        return this;
    }

    public PianoBuilder withPrice() {
        System.out.println("Enter price: ");
        this.price = sc.nextInt();
        return this;
    }

    public PianoBuilder withKeyMaterial() {
        System.out.println("Enter key material: ");
        this.keyMaterial = sc.next();
        return this;
    }

    public PianoBuilder withSoundGenerationMethod() {
        System.out.println("Enter sound generation method: ");
        this.soundGenerationMethod = sc.next();
        return this;
    }

    public PianoBuilder withHammerMaterial() {
        System.out.println("Enter hammer material: ");
        this.hammerMaterial = sc.next();
        return this;
    }

    public PianoBuilder withShape() {
        System.out.println("Enter shape: ");
        this.shape = sc.next();
        return this;
    }

    public PianoBuilder withHeight() {
        System.out.println("Enter height: ");
        this.height = sc.nextInt();
        return this;
    }

    public Piano build() {
        return new Piano(title, productionYear, productionCountry, color, price, keyMaterial,
                soundGenerationMethod, hammerMaterial, shape, height);
    }
}
