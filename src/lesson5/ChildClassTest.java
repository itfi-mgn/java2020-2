package lesson5;

import java.lang.reflect.Field;
import java.util.Arrays;

public class ChildClassTest extends ClassTest {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		ClassTest	ct = new ChildClassTest();
		Class		cl = ct.getClass();

		System.err.println("Name: "+cl.getName());
		System.err.println("Canonical name: "+cl.getCanonicalName());
		System.err.println("Simple name: "+cl.getSimpleName());
		
		System.err.println("Fields: "+Arrays.toString(cl.getDeclaredFields()));
		System.err.println("Superclass: "+cl.getSuperclass());
		
		Field	f = cl.getSuperclass().getDeclaredField("x");
		
		System.err.println("Field name: "+f.getName());
		System.err.println("Field type: "+f.getType());
		f.setAccessible(true);
		System.err.println("Field value: "+f.getInt(ct));
		f.setInt(ct,20);	// x = 20;
//		System.err.println("New value: "+x);
	}
}
