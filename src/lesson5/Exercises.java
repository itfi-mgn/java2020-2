package lesson5;

public class Exercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.err.println("Sum="+sum(new MyClass()));
		System.err.println("Sum="+sum(new MyClass2()));
	}

	static int sum(Object obj) {
		// TODO: find all fields in the obj and calculate it's sum
	}
}


class MyClass {
	static int x = 10;
	
	public int y = 20;
	
	private int z = 30;
}

class MyClass2 {
	static int x = 100;
	
	public int y = 200;
	
	private int z = 300;
}