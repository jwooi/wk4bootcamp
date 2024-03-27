import java.util.ArrayList;
import java.util.List;

public class BookingSystem {
    private static final Vehicle[] vehicle_array = new Vehicle[6];
    private static final ArrayList<Booking> booking_list = new ArrayList<>();

    public void printStatus() {
        System.out.println("Welcome to FIT2099 Booking System" + '\n');
        createVehicles();
        addBookingForVehicle();
        System.out.println("Thank you for visiting FIT2099 Booking System!");
    }

    private void addBookingForVehicle() {
        List<Action> actions = new ArrayList<>();
        //TODO: create add booking actions by looping through all available vehicles here, see hint message above.
        for (Vehicle vehicle: vehicle_array) {
            Booking i = new Booking(vehicle);
            booking_list.add(i);
        }
        for (Booking booking: booking_list){
            actions.add(new AddBookingAction(booking));
        }

        System.out.println("#########################################");
        Action action = Menu.showMenu(actions);
        System.out.println(action.execute(this));
    }

    public void createVehicles(){
        BookingSystem.vehicle_array[0] = new Sedan("Lexus", 2023, "200.00", "500 km", "ELECTRIC");
        BookingSystem.vehicle_array[1] = new Sedan("BMW", 2022, "150.00", "600 km", "PETROL");
        BookingSystem.vehicle_array[2] = new SUV("Tesla", 2023, "300.00", 5, "ELECTRIC");
        BookingSystem.vehicle_array[3] = new SUV("Mercedes", 2020, "500.00", 7, "DIESEL");
        BookingSystem.vehicle_array[4] = new Truck("Ford", 2019, "400.00",  1.0f);
        BookingSystem.vehicle_array[5] = new Truck("Volkswagen", 2020, "450.00",  1.2f);

    }
    public static void displayVehicles(){
        int booking_num = 1;
        for (Vehicle vehicle : vehicle_array){
            System.out.println("Booking Item " + "(" + booking_num + ")" + '\n');
            System.out.println(vehicle);
            booking_num += 1;
        }
    }


}