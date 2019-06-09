package S4.G1078.KOVACS_ERIK_ROBERT.composite;

public class Mechanic extends Employee {
	
	private String name;
	
	public Mechanic(String name) {
		super();
		this.name = name;
	}

	@Override
	public void add(Employee e) {
		super.add(e);
	}

	@Override
	public void remove(Employee e) {
		super.remove(e);
	}

	@Override
	public void display() {
		System.out.println(String.format("Mechanic named `%s`", name));
	}

}
