package instruments.keyboard.acoustic.dynamic;

import jakarta.persistence.Entity;

@Entity
public class Celesta extends DynamicKeyboardInstrument {
    public String octaveType;

    public Celesta(String title, int productionYear, String productionCountry, String color, double price, String keyMaterial, String soundGenerationMethod, String hammerMaterial, String shape, String octaveType) {
        super(title, productionYear, productionCountry, color, price, keyMaterial, soundGenerationMethod, hammerMaterial, shape);
        this.octaveType = octaveType;
    }

    public Celesta() {

    }

    @Override
    public void makeSound() {
        System.out.println("Tinkle! (light, delicate sound)");
    }

    @Override
    public String toString() {
        return "Celesta\n"
                + "Title: " + title +
                "\nProduced: " + productionCountry + ", " + productionYear +
                "\nColor: " + color +
                "\nPrice: " + getPrice() + "$\n"
                + "Key material: " + getKeyMaterial() +
                "\nHammer material: " + getHammerMaterial() +
                "\nOctave type: " + octaveType;
    }
}
