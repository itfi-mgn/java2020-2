package lesson3;

public class LifeCycleTest /* extends java.lang.Object */ {
	public static final int		x = 10;				// "ConstValue" 
	public static final double	y = Math.random();	// "Code"
	
	// static void <clinit>(){
	//		y = Math.random();
	//		--------------------------
	//		System.err.println("Static init");
	//		System.err.println("Static init 2");
	// }
	
	static {
		System.err.println("Static init");
	}
	
	int	z = 100;
	double yy = Math.random();
	
	public LifeCycleTest(int zzz) {
		this(1.0*zzz);
		System.err.println("Instance init zzz="+zzz);
			instancePrint();
	}

	public LifeCycleTest(double zzz) {
		this();
		System.err.println("Instance init zzz="+zzz);
			instancePrint();
	}
	
	public LifeCycleTest() {
//		super();
//		z = 100;
//			System.err.println("Instance init");		 
//		---------------
		System.err.println("Instance init zzz");
		instancePrint();
	}
	
//	{
//		System.err.println("Instance init");
//	}
	
	static void staticPrint() {
		System.err.println("Life static print "+x);
	}
	
	void instancePrint(/*this*/) {
		System.err.println("Life instance print "+/*this.*/z);
	}
	
	public static void main(String[] args) {
		System.err.println("Hello world");
		
		LifeCycleTest	item = new LifeCycleTest(1223), item1 = item;	// invokespecial noVMT, this
		
		item.staticPrint();		// LifeCycleTest.staticPrint();	// invokestatic  noVMT, noThis
		item.instancePrint(/*item*/);							// invokevirtual VMT, this
		
		// required (2)
		item = null;
		// required (1)
		item1 = new LifeCycleTest();
		// free
	}

	static {
		System.err.println("Static init 2");
	}
}
