public class Client implements User {
    private String name;
    private MobilFare myFare;

    public Client(String name, MobilFare fare) {
        this.name = name;
        this.myFare = fare;
    }

    @Override
    public void handleInfo(int newMonthPay) {
        System.out.println("Dear " + name + " your month payment has changed\n Payment : " + newMonthPay);
    }
}
