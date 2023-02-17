package instruments.keyboard.acoustic.dynamic;

import jakarta.persistence.Entity;

@Entity
public class Clavichord extends DynamicKeyboardInstrument {
    public boolean withTableLegs;

    public Clavichord(String title, int productionYear, String productionCountry, String color, double price, String keyMaterial, String soundGenerationMethod, String hammerMaterial, String shape, boolean withTableLegs) {
        super(title, productionYear, productionCountry, color, price, keyMaterial, soundGenerationMethod, hammerMaterial, shape);
        this.withTableLegs = withTableLegs;
    }

    public Clavichord() {

    }

    @Override
    public void makeSound() {
        System.out.println("Plink-Plonk! (soft, gentle sound with each key press)");
    }

    @Override
    public String toString() {
        return "Clavichord\n"
                + "Title: " + title +
                "\nProduced: " + productionCountry + ", " + productionYear +
                "\nColor: " + color +
                "\nPrice: " + getPrice() + "$\n"
                + "Key material: " + getKeyMaterial() +
                "\nHammer material: " + getHammerMaterial() +
                "\nHave table legs: " + withTableLegs;
    }
}
