package instruments.keyboard.acoustic.statik.wind;

import instruments.keyboard.acoustic.statik.StaticKeyboardInstrument;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class WindStaticInstrument extends StaticKeyboardInstrument {
    private String airProductionMechanism;

    public WindStaticInstrument(String title, int productionYear, String productionCountry, String color, double price, String keyMaterial, String soundGenerationMethod, String soundProductionMethod, String airProductionMechanism) {
        super(title, productionYear, productionCountry, color, price, keyMaterial, soundGenerationMethod, soundProductionMethod);
        this.airProductionMechanism = airProductionMechanism;
    }

    public WindStaticInstrument() {

    }

    public String getAirProductionMechanism() {
        return airProductionMechanism;
    }
}
