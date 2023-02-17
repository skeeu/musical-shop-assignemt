package instruments.keyboard.acoustic;

import instruments.keyboard.KeyboardInstrument;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class AcousticKeyboardInstrument extends KeyboardInstrument {
    private String soundGenerationMethod;

    public AcousticKeyboardInstrument(String title, int productionYear, String productionCountry, String color, double price, String keyMaterial, String soundGenerationMethod) {
        super(title, productionYear, productionCountry, color, price, keyMaterial);
        this.soundGenerationMethod = soundGenerationMethod;
    }

    public AcousticKeyboardInstrument () {

    }

    public String getSoundGenerationMethod() {
        return soundGenerationMethod;
    }
}
