package lesson5;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class ClassTest /*extends java.lang.Object*/ implements Cloneable {
	private static int x = 10;

	void print(int y) {
		System.err.println("sdjkfjksdjkljsdklfj "+y);
	}

	void print(double y) {
		System.err.println("sdjkfjksdjkljsdklfj "+y);
	}
	
	// public ClassTest(){}
	
	
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException {
		// TODO Auto-generated method stub
		ClassTest	ct = new ClassTest();
		Class		cl = ct.getClass();
		Class		abcde = void.class;

		System.err.println("Name: "+cl.getName());
		System.err.println("Canonical name: "+cl.getCanonicalName());
		System.err.println("Simple name: "+cl.getSimpleName());
		
		System.err.println("Fields: "+Arrays.toString(cl.getDeclaredFields()));
		System.err.println("Superclass: "+cl.getSuperclass());
		
		Field	f = cl.getDeclaredField("x");
		
		System.err.println("Field name: "+f.getName());
		System.err.println("Field type: "+f.getType());
		System.err.println("Field value: "+f.getInt(ct));
		f.setInt(ct,20);	// x = 20;
//		System.err.println("New value: "+x);
		
		System.err.println("Methods: "+Arrays.toString(cl.getDeclaredMethods()));
		
		Method	m = cl.getDeclaredMethod("print", int.class);
		
		System.err.println("Method name: "+m.getName());
		System.err.println("Returned type: "+m.getReturnType());
		System.err.println("Parameters: "+Arrays.toString(m.getParameters()));
		
		m.invoke(ct,12345);

		System.err.println("Constructors: "+Arrays.toString(cl.getDeclaredConstructors()));
		
		Constructor	c = cl.getDeclaredConstructor();
		
		ClassTest	ctNew = (ClassTest)c.newInstance();

		System.err.println("New x: "+ctNew.x);
		
		System.err.println("Modifiers: "+Modifier.isStatic(f.getModifiers()));
		System.err.println("Interfaces: "+Arrays.toString(cl.getInterfaces()));
		
		System.err.println("Is array: "+cl.isArray());
		System.err.println("Is primitive: "+cl.isPrimitive());
		System.err.println("Is primitive: "+abcde.isPrimitive());
		System.err.println("Is instance: "+cl.isInstance(ct));	// ct instanceof ClassTest
		
	}
}
