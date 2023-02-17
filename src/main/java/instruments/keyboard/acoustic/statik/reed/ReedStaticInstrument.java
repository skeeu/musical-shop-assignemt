package instruments.keyboard.acoustic.statik.reed;

import instruments.keyboard.acoustic.statik.StaticKeyboardInstrument;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class ReedStaticInstrument extends StaticKeyboardInstrument {
    private String airPressureRequirements;

    public ReedStaticInstrument(String title, int productionYear, String productionCountry, String color, double price, String keyMaterial, String soundGenerationMethod, String soundProductionMethod, String airPressureRequirements) {
        super(title, productionYear, productionCountry, color, price, keyMaterial, soundGenerationMethod, soundProductionMethod);
        this.airPressureRequirements = airPressureRequirements;
    }

    public ReedStaticInstrument() {

    }

    public String getAirPressureRequirements() {
        return airPressureRequirements;
    }
}
