package instruments.keyboard.digital.electro_mechanic;

import jakarta.persistence.Entity;

@Entity
public class DigitalPiano extends ElectroMechanicalDigitalInstrument {
    public String keysType;

    public DigitalPiano(String title, int productionYear, String productionCountry, String color, double price, String keyMaterial, String recordingCapabilities, String pedalsAmount, String keysType) {
        super(title, productionYear, productionCountry, color, price, keyMaterial, recordingCapabilities, pedalsAmount);
        this.keysType = keysType;
    }

    public DigitalPiano() {

    }

    @Override
    public void makeSound() {
        System.out.println("Plink! (high-pitched, clean and clear sound)");
    }

    @Override
    public String toString() {
        return "Digital Piano\n"
                + "Title: " + title +
                "\nProduced: " + productionCountry + ", " + productionYear +
                "\nColor: " + color +
                "\nPrice: " + getPrice() + "$\n"
                + "Key material: " + getKeyMaterial() +
                "\nRecording capabilities: " + getRecordingCapabilities() +
                "\nAmount of pedals: " + pedalsAmount +
                "\nKeys type: " + keysType;
    }
}
