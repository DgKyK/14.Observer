public class Client implements User {
    private String name;

    public Client(String name) {
        this.name = name;
    }

    @Override
    public void handleInfo(int newMonthPay) {
        System.out.println("Dear " + name + " your month payment has changed\n Payment : " + newMonthPay);
    }
}
