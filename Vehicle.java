public class Vehicle {

    public Vehicle(String brand, int year, String price){
        this.brand = brand;
        this.year = year;
        this.price = price;
    }
    public String brand;
    public int year;
    public String price;

    @Override
    public String toString() {
        return "Brand: " + brand + '\n' +
                "Year: " + year + '\n' +
                "Price: " + "$" + price + " per day";
    }

}
