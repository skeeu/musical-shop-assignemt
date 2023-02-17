package instruments.keyboard.acoustic.statik.reed;

import jakarta.persistence.Entity;

@Entity
public class PumpOrgan extends ReedStaticInstrument {

    public PumpOrgan(String title, int productionYear, String productionCountry, String color, double price, String keyMaterial, String soundGenerationMethod, String soundProductionMethod, String airPressureRequirements) {
        super(title, productionYear, productionCountry, color, price, keyMaterial, soundGenerationMethod, soundProductionMethod, airPressureRequirements);
    }

    public PumpOrgan() {

    }

    @Override
    public void makeSound () {
        System.out.println("Puff! Puff! (rhythmic, mechanical sound)");
    }

    @Override
    public String toString() {
        return "Pump Organ\n"
                + "Title: " + title +
                "\nProduced: " + productionCountry + ", " + productionYear +
                "\nColor: " + color +
                "\nPrice: " + getPrice() + "$\n"
                + "Key material: " + getKeyMaterial() +
                "\nSoung generation method: " + getSoundGenerationMethod() +
                "\nSound production method: " + getSoundProductionMethod() +
                "\nAir pressure requirements: " + getAirPressureRequirements();
    }
}
