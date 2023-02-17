package instruments.keyboard;

import instruments.Instrument;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class KeyboardInstrument extends Instrument {
//    plactic, wood, ivory
    private String keyMaterial;

    public KeyboardInstrument(String title, int productionYear, String productionCountry, String color, double price, String keyMaterial) {
        super(title, productionYear, productionCountry, color, price);
        this.keyMaterial = keyMaterial;
    }

    public KeyboardInstrument() {

    }

    public String getKeyMaterial() {
        return keyMaterial;
    }
}
