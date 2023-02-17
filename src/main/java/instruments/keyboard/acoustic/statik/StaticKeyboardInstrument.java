package instruments.keyboard.acoustic.statik;

import instruments.keyboard.acoustic.AcousticKeyboardInstrument;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class StaticKeyboardInstrument extends AcousticKeyboardInstrument {
    private String soundProductionMethod;

    public StaticKeyboardInstrument(String title, int productionYear, String productionCountry, String color, double price, String keyMaterial, String soundGenerationMethod, String soundProductionMethod) {
        super(title, productionYear, productionCountry, color, price, keyMaterial, soundGenerationMethod);
        this.soundProductionMethod = soundProductionMethod;
    }

    public StaticKeyboardInstrument() {

    }

    public String getSoundProductionMethod() {
        return soundProductionMethod;
    }
}
