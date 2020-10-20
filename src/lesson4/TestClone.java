package lesson4;

public class TestClone /* extends Object */ implements Cloneable {
	int x = 10;
	
	TestClone() {
	}

	@Override
	public TestClone clone() throws CloneNotSupportedException {
		return (TestClone) super.clone();
	}
	
	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		TestClone	tc1 = new TestClone(), tc2 = tc1.clone(), tc3 = tc1.clone(), tc4 = tc2.clone();

		
	}
}
