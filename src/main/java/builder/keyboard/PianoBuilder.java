package builder.keyboard;

import builder.KeyboardInstrumentBuilder;
import instruments.keyboard.acoustic.dynamic.Piano;

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

    public PianoBuilder withTitle(String title) {
        this.title = title;
        return this;
    }

    public PianoBuilder withProductionYear(int productionYear) {
        this.productionYear = productionYear;
        return this;
    }

    public PianoBuilder withProductionCountry(String productionCountry) {
        this.productionCountry = productionCountry;
        return this;
    }

    public PianoBuilder withColor(String color) {
        this.color = color;
        return this;
    }

    public PianoBuilder withPrice(double price) {
        this.price = price;
        return this;
    }

    public PianoBuilder withKeyMaterial(String keyMaterial) {
        this.keyMaterial = keyMaterial;
        return this;
    }

    public PianoBuilder withSoundGenerationMethod(String soundGenerationMethod) {
        this.soundGenerationMethod = soundGenerationMethod;
        return this;
    }

    public PianoBuilder withHammerMaterial(String hammerMaterial) {
        this.hammerMaterial = hammerMaterial;
        return this;
    }

    public PianoBuilder withShape(String shape) {
        this.shape = shape;
        return this;
    }

    public PianoBuilder withHeight(double height) {
        this.height = height;
        return this;
    }

    public Piano build() {
        return new Piano(title, productionYear, productionCountry, color, price, keyMaterial,
                soundGenerationMethod, hammerMaterial, shape, height);
    }
}
