public class Truck extends Vehicle{

    public Truck(String brand, int year, String price, float loading){
        super(brand, year, price);
        this.loading = loading;
    }

    public float loading;

    @Override
    public String toString() {
        return "Brand: " + brand + '\n' +
                "Year: " + year + '\n' +
                "Price: " + "$" + price + " per day" + '\n' +
                "Loading: " + loading + '\n'
                + '\n';
    }
}
