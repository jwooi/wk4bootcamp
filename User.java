import java.util.ArrayList;

public class User implements ActionCapable{
    private float balance;
    public boolean isUserDone = false;
    private static final ArrayList<Booking> booking_list = new ArrayList<>();

    public static void addBookings(Booking myBooking){
        booking_list.add(myBooking);
    }

    public static void displayBookedVehicles() {
        for (Booking booking : booking_list) {
            Vehicle vehicle = booking.vehicle;
            String detail = "";

            if (vehicle instanceof Truck) {
                detail = "Loading: " + ((Truck) vehicle).loading;
            } else if (vehicle instanceof SUV) {
                detail = "Number of Seats: " + ((SUV) vehicle).seats +
                        " | Engine Type: " + ((SUV) vehicle).EngineType;
            } else if (vehicle instanceof Sedan) {
                detail = "Range: " + ((Sedan) vehicle).range +
                        " | Engine Type: " + ((Sedan) vehicle).EngineType;
            }

            System.out.println("Booking detail:\n" +
                    vehicle.toString() + " | " + detail);
        }
    }

    @Override
    public List<Action> allowableActions() {
    List<Action> actions = new ArrayList<>();
    Booking booking = new Booking(this);
    actions.add(new AddBookingAction(booking));
    return actions;
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
