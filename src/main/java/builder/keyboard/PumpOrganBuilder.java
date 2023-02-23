package builder.keyboard;

import builder.KeyboardInstrumentBuilder;
import instruments.keyboard.acoustic.statik.reed.PumpOrgan;

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

    public PumpOrganBuilder withTitle(String title) {
        this.title = title;
        return this;
    }

    public PumpOrganBuilder withProductionYear(int productionYear) {
        this.productionYear = productionYear;
        return this;
    }

    public PumpOrganBuilder withProductionCountry(String productionCountry) {
        this.productionCountry = productionCountry;
        return this;
    }

    public PumpOrganBuilder withColor(String color) {
        this.color = color;
        return this;
    }

    public PumpOrganBuilder withPrice(double price) {
        this.price = price;
        return this;
    }

    public PumpOrganBuilder withKeyMaterial(String keyMaterial) {
        this.keyMaterial = keyMaterial;
        return this;
    }

    public PumpOrganBuilder withSoundGenerationMethod(String soundGenerationMethod) {
        this.soundGenerationMethod = soundGenerationMethod;
        return this;
    }

    public PumpOrganBuilder withSoundProductionMethod(String soundProductionMethod) {
        this.soundProductionMethod = soundProductionMethod;
        return this;
    }

    public PumpOrganBuilder withAirPressureRequirements(String airPressureRequirements) {
        this.airPressureRequirements = airPressureRequirements;
        return this;
    }

    public PumpOrgan build() {
        return new PumpOrgan(title, productionYear, productionCountry, color, price, keyMaterial, soundGenerationMethod, soundProductionMethod, airPressureRequirements);
    }
}
