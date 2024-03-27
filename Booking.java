public class Booking {
    public Vehicle vehicle;

    public Booking(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public String toString(){
        String detail = "";

        if (vehicle instanceof Truck){
            detail = "Loading: " + ((Truck) vehicle).loading + '\n';
        }
        else if (vehicle instanceof SUV){
            detail = "Number of Seats: " + ((SUV) vehicle).seats + '\n' +
                    "Engine Type: " + (((SUV) vehicle).EngineType + '\n');
        }
        else
            detail = "Range: " + ((Sedan) vehicle).range + '\n'+
                    "Engine Type: " + (((Sedan) vehicle).EngineType + '\n');
        return "Vehicle detail: " + '\n' +
                "Brand: " + vehicle.brand + '\n' +
                "Year: " + vehicle.year + '\n' +
                "Price: " + "$" + vehicle.price + " per day" + '\n' +
                detail;
    }

}
