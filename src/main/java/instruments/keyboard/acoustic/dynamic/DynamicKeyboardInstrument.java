package instruments.keyboard.acoustic.dynamic;

import instruments.keyboard.acoustic.AcousticKeyboardInstrument;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class DynamicKeyboardInstrument extends AcousticKeyboardInstrument {
    private String hammerMaterial;
    private String shape;

    public DynamicKeyboardInstrument(String title, int productionYear, String productionCountry, String color, double price, String keyMaterial, String soundGenerationMethod, String hammerMaterial, String shape) {
        super(title, productionYear, productionCountry, color, price, keyMaterial, soundGenerationMethod);
        this.hammerMaterial = hammerMaterial;
        this.shape = shape;
    }

    public DynamicKeyboardInstrument() {

    }

    public String getHammerMaterial() {
        return hammerMaterial;
    }

    public String getShape() {
        return shape;
    }
}
