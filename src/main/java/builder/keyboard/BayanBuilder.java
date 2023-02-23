package builder.keyboard;

import builder.KeyboardInstrumentBuilder;
import instruments.keyboard.acoustic.statik.reed.Bayan;

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

    public BayanBuilder withTitle(String title) {
        this.title = title;
        return this;
    }

    public BayanBuilder withProductionYear(int productionYear) {
        this.productionYear = productionYear;
        return this;
    }

    public BayanBuilder withProductionCountry(String productionCountry) {
        this.productionCountry = productionCountry;
        return this;
    }

    public BayanBuilder withColor(String color) {
        this.color = color;
        return this;
    }

    public BayanBuilder withPrice(double price) {
        this.price = price;
        return this;
    }

    public BayanBuilder withKeyMaterial(String keyMaterial) {
        this.keyMaterial = keyMaterial;
        return this;
    }

    public BayanBuilder withSoundGenerationMethod(String soundGenerationMethod) {
        this.soundGenerationMethod = soundGenerationMethod;
        return this;
    }

    public BayanBuilder withSoundProductionMethod(String soundProductionMethod) {
        this.soundProductionMethod = soundProductionMethod;
        return this;
    }

    public BayanBuilder withAirPressureRequirements(String airPressureRequirements) {
        this.airPressureRequirements = airPressureRequirements;
        return this;
    }

    public BayanBuilder withRowsNumber(int rowsNumber) {
        this.rowsNumber = rowsNumber;
        return this;
    }

    public Bayan build() {
        Bayan bayan = new Bayan(title, productionYear, productionCountry, color, price,
                keyMaterial, soundGenerationMethod, soundProductionMethod, airPressureRequirements, rowsNumber);
        return bayan;
    }

}
