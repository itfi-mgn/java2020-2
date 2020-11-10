package lesson7;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]	x = new int[10], y = new int[] {1,2,3,4,5};
		
		System.err.println("LEngth: "+x.length);	// arraylength
		int[]	z = x.clone();
		
		System.err.println("X[0]: "+x[0]);
		z[0] = 10;
		System.err.println("X[0]: "+x[0]);
		
		int[][]	xx = new int[][] {new int[] {1,2,}, null, new int[] {3,4,5,6}};

		Class cl = x.getClass();
		
		System.err.println("Name="+cl.getCanonicalName());
		System.err.println("isArray "+cl.isArray());
		System.err.println("COntent: "+cl.getComponentType());
		
		System.err.println("LEngth: "+Array.getLength(x));
		System.err.println("Get: "+Array.getInt(x,0));
		Array.setInt(x,0,12345);
		System.err.println("Get: "+Array.getInt(x,0));
		
		int[]	abcde = (int[])Array.newInstance(int.class,10);
		
		System.err.println("abcde length: "+abcde.length);
		
		int[]	result = (int[])concat(new int[] {1,2,3}, new int[] {4,5,6});
		
		System.err.println("REsult="+Arrays.toString(result));

		char[]	result1 = (char[])concat(new char[] {'a','b','c'}, new char[] {'d','e','f'});
		
		// new char[] {'a','b','c','d','e','f'}
		
		System.err.println("REsult="+Arrays.toString(result1));
	}
	
	static Object concat(Object... arrays) {	// (Object[] arrays)
		int	count = 0;
		
		for (Object item : arrays) {
			count += Array.getLength(item);
		}
		Object	result = Array.newInstance(arrays[0].getClass().getComponentType(), count);
		int		displ = 0;
		
		for (Object item : arrays) {
			final int len = Array.getLength(item);
			
			System.arraycopy(item, 0, result, displ, len);
			displ += len;
		}
		return result;
	}
	
}
