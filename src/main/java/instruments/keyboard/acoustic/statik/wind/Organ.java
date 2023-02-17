package instruments.keyboard.acoustic.statik.wind;

import jakarta.persistence.Entity;

@Entity
public class Organ extends WindStaticInstrument {
    public String specialisation;

    public Organ(String title, int productionYear, String productionCountry, String color, double price, String keyMaterial, String soundGenerationMethod, String soundProductionMethod, String airProductionMechanism, String specialisation) {
        super(title, productionYear, productionCountry, color, price, keyMaterial, soundGenerationMethod, soundProductionMethod, airProductionMechanism);
        this.specialisation = specialisation;
    }

    public Organ() {

    }

    @Override
    public void makeSound() {
        System.out.println("Wooooooom! (deep, resonant and powerful sound)");
    }

    @Override
    public String toString() {
        return "Organ\n"
                + "Title: " + title +
                "\nProduced: " + productionCountry + ", " + productionYear +
                "\nColor: " + color +
                "\nPrice: " + getPrice() + "$\n"
                + "Key material: " + getKeyMaterial() +
                "\nSoung generation method: " + getSoundGenerationMethod() +
                "\nSound production method: " + getSoundProductionMethod() +
                "\nAir production mechanism: " + getAirProductionMechanism() +
                "\nSpecialisation: " + specialisation;
    }
}
