public class ViewBalanceAction implements User {
    private User user;

    public static void ViewBalanceAction(){
        double balance = user.getBalance();
        System.out.println("You have a balance of $" + balance);
        
    }

}