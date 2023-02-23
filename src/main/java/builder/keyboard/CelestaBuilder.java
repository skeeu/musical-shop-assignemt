package builder.keyboard;

import builder.KeyboardInstrumentBuilder;
import instruments.keyboard.acoustic.dynamic.Celesta;

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

    public CelestaBuilder withTitle(String title) {
        this.title = title;
        return this;
    }

    public CelestaBuilder withProductionYear(int productionYear) {
        this.productionYear = productionYear;
        return this;
    }

    public CelestaBuilder withProductionCountry(String productionCountry) {
        this.productionCountry = productionCountry;
        return this;
    }

    public CelestaBuilder withColor(String color) {
        this.color = color;
        return this;
    }

    public CelestaBuilder withPrice(double price) {
        this.price = price;
        return this;
    }

    public CelestaBuilder withKeyMaterial(String keyMaterial) {
        this.keyMaterial = keyMaterial;
        return this;
    }

    public CelestaBuilder withSoundGenerationMethod(String soundGenerationMethod) {
        this.soundGenerationMethod = soundGenerationMethod;
        return this;
    }

    public CelestaBuilder withHammerMaterial(String hammerMaterial) {
        this.hammerMaterial = hammerMaterial;
        return this;
    }

    public CelestaBuilder withShape(String shape) {
        this.shape = shape;
        return this;
    }

    public CelestaBuilder withOctaveType(String octaveType) {
        this.octaveType = octaveType;
        return this;
    }

    public Celesta build() {
        Celesta celesta = new Celesta(title, productionYear, productionCountry, color, price, keyMaterial, soundGenerationMethod, hammerMaterial, shape, octaveType);
        return celesta;
    }

}
