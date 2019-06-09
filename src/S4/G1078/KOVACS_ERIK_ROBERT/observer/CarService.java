package S4.G1078.KOVACS_ERIK_ROBERT.observer;

import java.util.ArrayList;

public class CarService implements Subject {
	// Track subscribers in this array list
	private ArrayList<Observer> subscribers = new ArrayList<>();

	@Override
	public void subscribe(Observer o) {
		subscribers.add(o);
	}

	@Override
	public void unsubscribe(Observer o) {
		subscribers.remove(o);
	}

	@Override
	public void notifyObservers(String event) {
		for(Observer o : subscribers) {
			o.update(event);
		}
	}
	
	
}
