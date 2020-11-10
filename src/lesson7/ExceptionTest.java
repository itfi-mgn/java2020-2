package lesson7;

import java.io.IOException;

public class ExceptionTest {
	static void error(int code) throws RuntimeException, Exception, Throwable {
		switch (code) {
			case 0 	: throw new RuntimeException("simulate runtime exception!");
			case 1 	: throw new Exception("simulate exception!");
			case 2 	: throw new Throwable("simulate throwable!");
			default : return;
		}
	}

	static void nestedError(int code) throws Throwable {
		try{
			error(code);
//			System.err.println("Nested finally");
		} catch (Exception e) {
			System.err.println("Nested catch: "+e.getMessage());
//			System.err.println("Nested finally");
		} finally {
			System.err.println("Nested finally");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// - Throwable (checked)
		// -- Exception (checked)
		// --- ......
		// --- RuntimeException (unchecked)
		// ---- .......
		// -- Error (unckecked)
		// --- 

		for (int index = 0; index <= 3; index++) {
			try {
				nestedError(index);
				System.err.println("Success");
			} catch (RuntimeException e) {
				System.err.println("RUntime catch: "+e.getMessage());
			} catch (Exception e) {
				System.err.println("Exception catch: "+e.getMessage());
			} catch (Throwable e) {
				System.err.println("Throwable catch: "+e.getMessage());
				e.printStackTrace();
			} finally {
				System.err.println("Finally");
			}
		}
	}

}
