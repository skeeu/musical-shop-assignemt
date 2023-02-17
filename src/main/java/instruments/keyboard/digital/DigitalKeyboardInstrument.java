package instruments.keyboard.digital;

import instruments.keyboard.KeyboardInstrument;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class DigitalKeyboardInstrument extends KeyboardInstrument {
    private String recordingCapabilities;

    public DigitalKeyboardInstrument(String title, int productionYear, String productionCountry, String color, double price, String keyMaterial, String recordingCapabilities) {
        super(title, productionYear, productionCountry, color, price, keyMaterial);
        this.recordingCapabilities = recordingCapabilities;
    }

    public DigitalKeyboardInstrument() {

    }

    public String getRecordingCapabilities() {
        return recordingCapabilities;
    }
}
