public interface MobilFare {
    void addObserver(User client);
    void removeObserver(User client);
    void notifyAllObservers();
}
