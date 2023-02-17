package instruments.keyboard.acoustic.dynamic;

import jakarta.persistence.Entity;

@Entity
public class Piano extends DynamicKeyboardInstrument {
    public double height;

    public Piano(String title, int productionYear, String productionCountry, String color, double price, String keyMaterial, String soundGenerationMethod, String hammerMaterial, String shape, double height) {
        super(title, productionYear, productionCountry, color, price, keyMaterial, soundGenerationMethod, hammerMaterial, shape);
        this.height = height;
    }

    public Piano() {

    }

    @Override
    public void makeSound() {
        System.out.println("Plink! (high-pitched)\nPlonk! (low-pitched)");
    }

    @Override
    public String toString() {
        return "Piano\n"
                + "Title: " + title +
                "\nProduced: " + productionCountry + ", " + productionYear +
                "\nColor: " + color +
                "\nPrice: " + getPrice() + "$\n"
                + "Key material: " + getKeyMaterial() +
                "\nHammer material: " + getHammerMaterial() +
                "\nHeight: " + height + " mm.";
    }
}
