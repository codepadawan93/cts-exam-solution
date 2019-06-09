package S4.G1078.KOVACS_ERIK_ROBERT.observer;

public interface Subject {
	public void subscribe(Observer o);
	public void unsubscribe(Observer o);
	public void notifyObservers(String event);
}
