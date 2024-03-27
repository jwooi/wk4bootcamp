public class Sedan extends Vehicle{

    public Sedan(String brand, int year, String price, String range, String EngineType){
        super(brand, year, price);
        this.range = range;
        this.EngineType = EngineType;
    }

    public String range;
    public String EngineType;

    @Override
    public String toString() {
        return "Brand: " + brand + '\n' +
                "Year: " + year + '\n' +
                "Price: " + "$" + price + " per day" + '\n' +
                "Range: " + range + '\n' +
                "Engine Type: " + EngineType + '\n';
    }
}