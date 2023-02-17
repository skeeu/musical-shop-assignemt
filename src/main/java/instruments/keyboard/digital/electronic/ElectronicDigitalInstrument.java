package instruments.keyboard.digital.electronic;

import instruments.keyboard.digital.DigitalKeyboardInstrument;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class ElectronicDigitalInstrument extends DigitalKeyboardInstrument {
    private String connectivityOptions;

    public ElectronicDigitalInstrument(String title, int productionYear, String productionCountry, String color, double price, String keyMaterial, String recordingCapabilities, String connectivityOptions) {
        super(title, productionYear, productionCountry, color, price, keyMaterial, recordingCapabilities);
        this.connectivityOptions = connectivityOptions;
    }

    public ElectronicDigitalInstrument() {

    }

    public String getConnectivityOptions() {
        return connectivityOptions;
    }
}
