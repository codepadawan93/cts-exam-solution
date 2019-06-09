package S4.G1078.KOVACS_ERIK_ROBERT.composite;

import java.util.ArrayList;

public class Engineer extends Employee {
		
		private String name;
		private ArrayList<Employee> subordinates = new ArrayList<>();
		
		public Engineer(String name) {
			super();
			this.name = name;
		}

		@Override
		public void add(Employee e) {
			subordinates.add(e);
		}

		@Override
		public void remove(Employee e) {
			subordinates.remove(e);
		}

		@Override
		public void display() {
			System.out.println(String.format("Engineer named `%s`", name));
			if(subordinates.size() > 0) {
				System.out.println("Subordinates:");
			}
			for(Employee employee : subordinates) {
				employee.display();
			}
		}

	}
