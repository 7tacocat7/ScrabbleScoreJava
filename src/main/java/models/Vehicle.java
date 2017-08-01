package models;

/**
 * Created by Guest on 8/1/17.
 */
public class Vehicle {

    public int year;
    public String brand;
    public String model;
    public int miles;
    public int price;
    public boolean forSale;

    public Vehicle(int year, String brand, String model, int miles, int price) {
        this.year = year;
        this.brand = brand;
        this.model = model;
        this.miles = miles;
        this.price = price;
        this.forSale = true;
    }

    public boolean worthBuying(int maxPrice){
        return (this.price < maxPrice);
    }

}