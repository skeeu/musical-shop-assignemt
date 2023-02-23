package builder.keyboard;

import builder.KeyboardInstrumentBuilder;
import instruments.keyboard.acoustic.statik.wind.Organ;

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

    public OrganBuilder withTitle(String title) {
        this.title = title;
        return this;
    }

    public OrganBuilder withProductionYear(int productionYear) {
        this.productionYear = productionYear;
        return this;
    }

    public OrganBuilder withProductionCountry(String productionCountry) {
        this.productionCountry = productionCountry;
        return this;
    }

    public OrganBuilder withColor(String color) {
        this.color = color;
        return this;
    }

    public OrganBuilder withPrice(double price) {
        this.price = price;
        return this;
    }

    public OrganBuilder withKeyMaterial(String keyMaterial) {
        this.keyMaterial = keyMaterial;
        return this;
    }

    public OrganBuilder withSoundGenerationMethod(String soundGenerationMethod) {
        this.soundGenerationMethod = soundGenerationMethod;
        return this;
    }

    public OrganBuilder withSoundProductionMethod(String soundProductionMethod) {
        this.soundProductionMethod = soundProductionMethod;
        return this;
    }

    public OrganBuilder withAirProductionMechanism(String airProductionMechanism) {
        this.airProductionMechanism = airProductionMechanism;
        return this;
    }

    public OrganBuilder withSpecialisation(String specialisation) {
        this.specialisation = specialisation;
        return this;
    }

    public Organ build() {
        Organ organ = new Organ(title, productionYear, productionCountry, color, price, keyMaterial, soundGenerationMethod, soundProductionMethod, airProductionMechanism, specialisation);
        return organ;
    }
}
