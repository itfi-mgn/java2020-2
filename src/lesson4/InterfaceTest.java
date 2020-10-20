package lesson4;

public abstract class InterfaceTest implements Total, Empty {
	abstract void print();

	public void myMethod2() {
		
	}
	
	void test() {
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceTest	it = new ChildInterfaceTest();
		MyInterface		mi = new ZZZ1(), mi1 = it;
		
		
		System.err.println(it.s);
		System.err.println(MyInterface2.s);
		Empty 			e = new ChildInterfaceTest();
	}
}	

/* abstract*/ interface MyInterface {
	/*public abstract*/ void myMethod();
	void a();
}

/* abstract*/ interface MyInterface2 {
	/*static final */ String	s = "10";
	/*static final */ double	r = Math.random();
	
	static void abcde() {	// 1.8
		System.err.println("sdfkdjfkdjf");
	}
	
//	private void aaa() {	// 9
//		
//	}
	
	/*public abstract*/ void myMethod2();
	void a();
}

interface Total extends MyInterface, MyInterface2 {
}

interface Empty {
}


class ChildInterfaceTest extends InterfaceTest {

	@Override
	void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void myMethod() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void a() {
		// TODO Auto-generated method stub
		
	}
}


class ZZZ {
	public void myMethod() {}
	public void a() {}
	
	public void hdfhjsdg() {
		
	}
}

class ZZZ1 extends ZZZ implements MyInterface {
	
}
