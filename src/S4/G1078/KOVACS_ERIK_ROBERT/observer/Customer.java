package S4.G1078.KOVACS_ERIK_ROBERT.observer;

public class Customer implements Observer {
	
	@Override
	public void update(String event) {
		System.out.println(String.format("Customer notified of event `%s`", event));
	}
	
}
