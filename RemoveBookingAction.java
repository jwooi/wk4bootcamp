public class RemoveBookingAction implements Action {
    private User user;

    private Booking tbremoved;

    public RemoveBookingAction(User user, Booking tbremoved){
        this.user = user;
        this.tbremoved = tbremoved;
    }

    @Override
    public void execute(){
        user.removeBooking(tbremoved);
    }
}