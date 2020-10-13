package lesson3;

public class ChildLifeTest extends LifeCycleTest {
	public static final int		x = 40;				// "ConstValue" 
	public static final double	y = Math.random();	// "Code"

	static {
		System.err.println("Child static iinit");
	}
	
	int	z = 12345678;
	
	public ChildLifeTest() {
		super(12345);
		// z = 12345678;
		System.err.println("sdkskdlk");
	}

	static void staticPrint() {
		System.err.println("Life child static print "+x);
	}
	
	@Override
	void instancePrint(/*this*/) {
		super.instancePrint();
		System.err.println("Life child instance print "+/*this.*/z);
	}
	
	public static void main(String[] args) {
		System.err.println("Hello world");
		
		LifeCycleTest	item = new ChildLifeTest();

		item.staticPrint();		// LifeCycleTest.staticPrint();
		item.instancePrint(/*item*/);
		
		item = null;	// item = new ChildLifeTest();
	}

}
