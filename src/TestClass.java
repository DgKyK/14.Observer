public class TestClass {
    public static void main(String[] args) {
        FeelFreeFare feelFreeFare = new FeelFreeFare(150);
        User user1 = new Client("Ben");
        User user2 = new Client("Will");
        User user3 = new Client("John");

        feelFreeFare.addObserver(user1);
        feelFreeFare.addObserver(user2);
        feelFreeFare.addObserver(user3);

        feelFreeFare.changeMonthPay(200);
    }
}
