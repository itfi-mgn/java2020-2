package lesson6;

import java.util.Arrays;

public class SpecialClassesTest {
	static int	x = 10;
	int			y = 20;

	void abcde(/*this*/) {
		MyInterface mi2 = new MyInterface() {
			@Override
			public void process() {
				System.err.println("Process "+/*this.*/y);
			}
		};
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class	cl = InnerClass.class;
		
		System.err.println("Name="+cl.getName());
		System.err.println("Constructors="+Arrays.toString(cl.getDeclaredConstructors()));
		System.err.println("Fields="+Arrays.toString(cl.getDeclaredFields()));
		
		SpecialClassesTest	parent = new SpecialClassesTest();
		InnerClass			ic = parent.new InnerClass();	// new InnerClass(parent); 
		InnerClass.Inner2	ic2 = ic.new Inner2();	// new InnerClass(parent);
		
		/*final*/int	r = 10 + x;
		MyInterface			mi = new MyInterface(/*r*/) {
								static final int eee = 20;	// 'ConstValue'
								int		www = 10;
//								static {
//									
//								}
								// final int val$r;
								// SpecialClassesTest$2(int val) {
								//		val$r = val;
								// }
								{
									System.err.println("Constructor");
								}
								
								@Override
								public void process() {
									System.err.println("Process "+x+", r="+/*val$r*/r);
								}
							};
		mi.process();
		
		Class				miClass = mi.getClass();
		
		System.err.println("MI Name="+miClass.getName());
		System.err.println("MI Constructors="+Arrays.toString(miClass.getDeclaredConstructors()));
		System.err.println("MI Fields="+Arrays.toString(miClass.getDeclaredFields()));
	}

	private class InnerClass {
		public static final int a = 10;		// 'ConstValue'
//		public static int w = 10;
		
		public int q = 12 + x;
		
		public int y = 111;
		// final SpecialClassesTest this$0;
		// private InnerClass(SpecialClassesTest zzzzz) {
		//		this$0 = zzzzz;
		// }
//		static {
//			
//		}
		
		void print() {
			System.err.println("x="+x+",y="+/*this$0.*/y);
			/*this$0.*/abcde();
		}
		
		class Inner2 {
			void print() {
				System.err.println("x="+x+",y="+/*this$0.*/SpecialClassesTest.this.y);
				/*this$0.*/abcde();
			}
		}
	}
}

interface MyInterface {
	void process();
}

//class MyImplementation implements MyInterface {
//	@Override
//	public void process() {
//		System.err.println("Process");
//	}
//}
