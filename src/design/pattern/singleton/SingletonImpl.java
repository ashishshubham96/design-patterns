package design.pattern.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import design.pattern.MyThread;

public class SingletonImpl {

	public static void implementSingleton() throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		MyThread t = new MyThread();
		MyThread t2 = new MyThread();
		MyThread t3 = new MyThread();
		MyThread t4 = new MyThread();
		t.start();
		t2.start();
		t3.start();
		t4.start();
		Employee employee1 = Employee.getInstance();
		Employee employee2 = Employee.getInstance();
		
		System.out.println("employee1 from Main  class "+employee1);
		System.out.println("employee2 from Main  class "+employee2);
		
		//Breaking Singleton using Reflection API
		Constructor<Employee> constructor = Employee.class.getDeclaredConstructor();
		constructor.setAccessible(true);
		Employee employee4 = constructor.newInstance();
		System.out.println("employee4 from Main Break singleton "+employee4);
		
		/*
		 * There are 3 ways to break singleton
		 * 1. Using Constructor instance
		 * 2. Using serialization and deserialization
		 * 3. Using clone() method.
		 * 
		 */
		
//		Employee employee5 = Employee.getInstance();
//		System.out.println("employee5 from main break singleton using clone() " +employee5.clone());
	}
}
