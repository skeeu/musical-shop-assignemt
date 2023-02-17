package instruments.keyboard.digital.electronic;

import jakarta.persistence.Entity;

@Entity
public class Synthesizer extends ElectronicDigitalInstrument {
    public int polyphony;

    public Synthesizer(String title, int productionYear, String productionCountry, String color, double price, String keyMaterial, String recordingCapabilities, String connectivityOptions, int polyphony) {
        super(title, productionYear, productionCountry, color, price, keyMaterial, recordingCapabilities, connectivityOptions);
        this.polyphony = polyphony;
    }

    public Synthesizer() {

    }

    @Override
    public void makeSound() {
        System.out.println("Woooooosh! (electronic, modulated sound)");
    }

    @Override
    public String toString() {
        return "Synthesizer\n"
                + "Title: " + title +
                "\nProduced: " + productionCountry + ", " + productionYear +
                "\nColor: " + color +
                "\nPrice: " + getPrice() + "$\n"
                + "Key material: " + getKeyMaterial() +
                "\nRecording capabilities: " + getRecordingCapabilities() +
                "\nConnectivity options: " + getConnectivityOptions() +
                "\nPolyphone: " + polyphony;
    }
}
