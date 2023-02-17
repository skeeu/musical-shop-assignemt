package instruments.keyboard.acoustic.statik.reed;

import jakarta.persistence.Entity;
import org.hibernate.annotations.Table;

@Entity
//@Table(appliesTo = "bayan")
public class Bayan extends ReedStaticInstrument {
    public int rowsNumber;

    public Bayan(String title, int productionYear, String productionCountry, String color, double price, String keyMaterial, String soundGenerationMethod, String soundProductionMethod, String airPressureRequirements, int rowsNumber) {
        super(title, productionYear, productionCountry, color, price, keyMaterial, soundGenerationMethod, soundProductionMethod, airPressureRequirements);
        this.rowsNumber = rowsNumber;
    }

    public Bayan() {

    }

    @Override
    public void makeSound() {
        System.out.println("Plonk! (low-pitched, deep and rich sound)");
    }

    @Override
    public String toString() {
        return "Bayan\n"
                + "Title: " + title +
                "\nProduced: " + productionCountry + ", " + productionYear +
                "\nColor: " + color +
                "\nPrice: " + getPrice() + "$\n"
                + "Key material: " + getKeyMaterial() +
                "\nSound generation method: " + getSoundGenerationMethod() +
                "\nSound production method: " + getSoundProductionMethod() +
                "\nAir pressure requirements: " + getAirPressureRequirements() +
                "\nRows number: " + rowsNumber;
    }
}
