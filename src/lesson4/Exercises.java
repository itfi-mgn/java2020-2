package lesson4;

public class Exercises {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Fan - 
		LifeCycleInterface	lc = null;// ????
		
		lc.start();
		System.err.println("Started");
		lc.suspend();
		System.err.println("Suspended");
		lc.resume();
		System.err.println("Resumed");
		lc.stop();
		System.err.println("Stopped");
	}
}
