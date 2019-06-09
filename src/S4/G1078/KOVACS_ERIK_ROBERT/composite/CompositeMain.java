package S4.G1078.KOVACS_ERIK_ROBERT.composite;

public class CompositeMain {
	public static void main(String[] args) {
		System.out.println("\nShift #1");
		
		// Maestru' Misu runs the shop with his two aides
		Engineer headEngineer = new Engineer("Maestrul Mishu");
		headEngineer.add(new Engineer("Mishu's aide #1"));
		headEngineer.add(new Engineer("Mishu's aide #2"));
		headEngineer.display();
		
		System.out.println("\nShift #2");
		
		// The other shift is led by Mr Romulus and consists of 
		// two men coincidentally named Doru
		Mechanic dorel1 = new Mechanic("Dorel #1");
		Mechanic dorel2 = new Mechanic("Dorel #2");
		Engineer headEngineerOtherShift = new Engineer("Unchiul Romica");
		headEngineerOtherShift.add(dorel1);
		headEngineerOtherShift.add(dorel2);
		headEngineerOtherShift.display();
		
		System.out.println("\nDorel #1 asks to be transferred to the other shift...");
		
		// Dorel #1 wants to work on the other shift now...
		headEngineerOtherShift.remove(dorel1);
		headEngineer.add(dorel1);
		headEngineer.display();
		System.out.println();
		headEngineerOtherShift.display();
	}
}
