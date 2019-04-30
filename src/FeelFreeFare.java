import java.util.LinkedList;
import java.util.List;

public class FeelFreeFare implements MobilFare {
    private int monthPay;
    private List<User> clients;

    public FeelFreeFare(int monthPay) {
        this.monthPay = monthPay;
        clients = new LinkedList<>();
    }

    public void changeMonthPay(int newMonthPay) {
        this.monthPay = newMonthPay;
        notifyAllObservers();
    }

    @Override
    public void addObserver(User client) {
        clients.add(client);
    }

    @Override
    public void removeObserver(User client) {
        clients.remove(client);
    }

    @Override
    public void notifyAllObservers() {
        for (User k : clients) {
            k.handleInfo(monthPay);
        }
    }
}
