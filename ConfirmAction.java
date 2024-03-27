public class ConfirmAction implements Action {
    private User user;

    public ConfirmAction(User user){
        this.user = user;
    }

    @Override
    public void execute(){
        for (Booking booking : user.getBookingList)
    }
}