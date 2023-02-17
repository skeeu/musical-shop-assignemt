package instruments.keyboard.digital.electro_mechanic;

import instruments.keyboard.digital.DigitalKeyboardInstrument;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class ElectroMechanicalDigitalInstrument extends DigitalKeyboardInstrument {
    public String pedalsAmount;

    public ElectroMechanicalDigitalInstrument(String title, int productionYear, String productionCountry, String color, double price, String keyMaterial, String recordingCapabilities, String pedalsAmount) {
        super(title, productionYear, productionCountry, color, price, keyMaterial, recordingCapabilities);
        this.pedalsAmount = pedalsAmount;
    }

    public ElectroMechanicalDigitalInstrument() {

    }
}
