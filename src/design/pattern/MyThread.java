package design.pattern;

import design.pattern.singleton.Employee;

public class MyThread extends Thread{

	public void run() {
		Employee employee3 = Employee.getInstance();
		System.out.println("employee3 from thread class" + employee3);
	}
}
