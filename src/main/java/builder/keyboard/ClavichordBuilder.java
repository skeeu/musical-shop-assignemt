package builder.keyboard;

import builder.KeyboardInstrumentBuilder;
import instruments.keyboard.acoustic.dynamic.Clavichord;

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

    public ClavichordBuilder withTitle(String title) {
        this.title = title;
        return this;
    }

    public ClavichordBuilder withProductionYear(int productionYear) {
        this.productionYear = productionYear;
        return this;
    }

    public ClavichordBuilder withProductionCountry(String productionCountry) {
        this.productionCountry = productionCountry;
        return this;
    }

    public ClavichordBuilder withColor(String color) {
        this.color = color;
        return this;
    }

    public ClavichordBuilder withPrice(double price) {
        this.price = price;
        return this;
    }

    public ClavichordBuilder withKeyMaterial(String keyMaterial) {
        this.keyMaterial = keyMaterial;
        return this;
    }

    public ClavichordBuilder withSoundGenerationMethod(String soundGenerationMethod) {
        this.soundGenerationMethod = soundGenerationMethod;
        return this;
    }

    public ClavichordBuilder withHammerMaterial(String hammerMaterial) {
        this.hammerMaterial = hammerMaterial;
        return this;
    }

    public ClavichordBuilder withShape(String shape) {
        this.shape = shape;
        return this;
    }

    public ClavichordBuilder withTableLegs(boolean withTableLegs) {
        this.withTableLegs = withTableLegs;
        return this;
    }

    public Clavichord build() {
        Clavichord clavichord = new Clavichord(title, productionYear, productionCountry, color, price, keyMaterial, soundGenerationMethod, hammerMaterial, shape, withTableLegs);
        return clavichord;
    }

}
