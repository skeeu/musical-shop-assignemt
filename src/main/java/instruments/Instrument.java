package instruments;

import jakarta.persistence.*;

@MappedSuperclass
public class Instrument {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    public String title;
    public Integer productionYear;
    public String productionCountry;
    public String color;
    private double price;

    public Instrument(String title, Integer productionYear, String productionCountry, String color, double price) {
        this.title = title;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
        this.color = color;
        this.price = price;
    }

    public Instrument() {

    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void makeSound() {
        System.out.println("*made sound*");
    }

    @Override
    public String toString() {
        return "Title: " + title + "\nProduced in " + productionCountry + " in " + productionYear + ".\nColor: " + color + "\nPrice: " + price;
    }
}
