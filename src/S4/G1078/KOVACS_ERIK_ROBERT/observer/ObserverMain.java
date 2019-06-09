package S4.G1078.KOVACS_ERIK_ROBERT.observer;

public class ObserverMain {

	public static void main(String[] args) {
		// Create car service
		CarService carService = new CarService();
		
		// Add subscribed clients
		Customer cust1 = new Customer(); 
		carService.subscribe(cust1);
		carService.subscribe(new Customer());
		carService.subscribe(new Customer());
		
		// Trigger 2 different events
		final String event1 = "Commercial communication";
		final String event2 = "Update on car repair status";
		carService.notifyObservers(event1);
		carService.notifyObservers(event2);
		
		// We can also unsubscribe observers
		carService.unsubscribe(cust1);
		carService.notifyObservers("Another commercial communication");
	}

}
