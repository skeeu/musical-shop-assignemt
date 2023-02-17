package instruments.keyboard.digital.electronic;

import jakarta.persistence.Entity;

@Entity
public class MidiKeyboard extends ElectronicDigitalInstrument {
    public String keyAmount;

    public MidiKeyboard(String title, int productionYear, String productionCountry, String color, double price, String keyMaterial, String recordingCapabilities, String connectivityOptions, String keyAmount) {
        super(title, productionYear, productionCountry, color, price, keyMaterial, recordingCapabilities, connectivityOptions);
        this.keyAmount = keyAmount;
    }

    public MidiKeyboard() {

    }

    @Override
    public void makeSound() {
        System.out.println("Plink! (high-pitched, clean and precise sound)");
    }

    @Override
    public String toString() {
        return "Midi Keyboard\n"
                + "Title: " + title +
                "\nProduced: " + productionCountry + ", " + productionYear +
                "\nColor: " + color +
                "\nPrice: " + getPrice() + "$\n"
                + "Key material: " + getKeyMaterial() +
                "\nRecording capabilities: " + getRecordingCapabilities() +
                "\nConnectivity options: " + getConnectivityOptions() +
                "\nAmount of keys: " + keyAmount;
    }
}
