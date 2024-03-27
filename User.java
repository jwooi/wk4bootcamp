import java.util.ArrayList;

public class User {
    private float balance;
    public boolean isUserDone = false;
    private static final ArrayList<Booking> booking_list = new ArrayList<>();

    public static void addBookings(Booking myBooking){
        booking_list.add(myBooking);
    }

    public static void displayBookedVehicles(){
        for (Booking booking : booking_list){
            String detail = "";
            if (booking.vehicle instanceof Truck){
                detail = "Loading: " + ((Truck) booking.vehicle).loading + " | ";
            }
            else if (booking.vehicle instanceof SUV){
                detail = "Number of Seats: " + ((SUV) booking.vehicle).seats + " | " +
                        "Engine Type: " + (((SUV) booking.vehicle).EngineType + " | ");
            }
            else
                detail = "Range: " + ((Sedan) booking.vehicle).range + " | " +
                        "Engine Type: " + (((Sedan) booking.vehicle).EngineType + " | ");
            System.out.println("Booking detail: " +
                    "Brand: " + booking.vehicle.brand + " | " +
                    "Year: " + booking.vehicle.year + " | " +
                    "Price: " + "$" + booking.vehicle.price + " per day" + " | " +
                    detail);
        }
    }
    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public void setUserDone(boolean userDone) {
        isUserDone = userDone;
    }

    public boolean isUserDone() {
        return isUserDone;
    }


}
