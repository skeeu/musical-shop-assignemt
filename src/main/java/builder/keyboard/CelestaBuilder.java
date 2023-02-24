package builder.keyboard;

import builder.KeyboardInstrumentBuilder;
import instruments.keyboard.acoustic.dynamic.Celesta;
import java.util.Scanner;

public class CelestaBuilder extends KeyboardInstrumentBuilder {
    private String title;
    private int productionYear;
    private String productionCountry;
    private String color;
    private double price;
    private String keyMaterial;
    private String soundGenerationMethod;
    private String hammerMaterial;
    private String shape;
    private String octaveType;

    private final Scanner sc;

    public CelestaBuilder(Scanner sc) {
        this.sc = sc;
    }

    public CelestaBuilder withTitle() {
        System.out.println("Enter title: ");
        this.title = sc.next();
        return this;
    }

    public CelestaBuilder withProductionYear() {
        System.out.println("Enter Production Year: ");
        this.productionYear = sc.nextInt();
        return this;
    }

    public CelestaBuilder withProductionCountry() {
        System.out.println("Enter Production Country: ");
        this.productionCountry = sc.next();
        return this;
    }

    public CelestaBuilder withColor() {
        System.out.println("Enter Color: ");
        this.color = sc.next();
        return this;
    }

    public CelestaBuilder withPrice() {
        System.out.println("Enter price: ");
        this.price = sc.nextDouble();
        return this;
    }

    public CelestaBuilder withKeyMaterial() {
        System.out.println("Enter key material: ");
        this.keyMaterial = sc.next();
        return this;
    }

    public CelestaBuilder withSoundGenerationMethod() {
        System.out.println("Enter sound generation method: ");
        this.soundGenerationMethod = sc.next();
        return this;
    }

    public CelestaBuilder withHammerMaterial() {
        System.out.println("Enter hammer material: ");
        this.hammerMaterial = sc.next();
        return this;
    }

    public CelestaBuilder withShape() {
        System.out.println("Enter shape: ");
        this.shape = sc.next();
        return this;
    }

    public CelestaBuilder withOctaveType() {
        System.out.println("Enter octave type: ");
        this.octaveType = sc.next();
        return this;
    }

    public Celesta build() {
        Celesta celesta = new Celesta(title, productionYear, productionCountry, color, price, keyMaterial, soundGenerationMethod, hammerMaterial, shape, octaveType);
        return celesta;
    }
}
