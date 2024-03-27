public class AddBookingAction extends Action {
    private Booking myBooking;

    public AddBookingAction(Booking myBooking){
        this.myBooking = myBooking;
    }

    @Override
    public String execute(BookingSystem bookingSystem) {
        User.addBookings(myBooking);
        return myBooking + " is successfully added to the Booking System!";
    }
    @Override
    public String menuDescription() {
        return "Add the following vehicle to the Booking System:\n" + myBooking;
    }
}
