public class SUV extends Vehicle{

    public SUV(String brand, int year, String price, int seats, String EngineType){
        super(brand, year, price);
        this.seats = seats;
        this.EngineType = EngineType;
    }

    public int seats;
    public String EngineType;

    @Override
    public String toString() {
        return "Brand: " + brand + '\n' +
                "Year: " + year + '\n' +
                "Price: " + "$" + price + " per day" + '\n' +
                "Number of Seats: " + seats + '\n' +
                "Engine Type: " + EngineType + '\n';
    }
}