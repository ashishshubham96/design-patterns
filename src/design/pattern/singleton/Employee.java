package design.pattern.singleton;

public class Employee {

	private static Employee instance = null;
	
	
	private Employee() {
		
	}
	
	public static Employee getInstance() {
		synchronized (Employee.class) {
			if(instance == null) {
				instance = new Employee();
			}
		}
		return instance;
	}
	
	
}
