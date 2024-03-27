public class DisplayBookingAction implements Action {
    private User user;

    public DisplayBookingAction(User user){
        this.user = user;
    }

    @Override
    public void execute(){
        user.displayBookedVehicles();
    }
}