package lesson1;

import lesson1.abcde.AAAAAA;
//import java.lang.*;
//import lesson1;

public class HelloWorld extends Object {
// public
// protected
// -------
// private 
	
	int x;
// - (primitive)
// -- integers
// --- byte   -128..+127   		(signed char)
// --- short  -32768..+32767	(signed short)
// --- int	  -2^31..+2^31		(signed int)
// --- long	  -2^63..+2^63		(signed long)
// --- char	  0..65536          (unsigned short)
// -- reals
// --- float  1e-38..1e+38 ~6 digits
// --- double 1e-306..1e+306 ~15 digits
// -- boolean	true / false
// - (referenced)	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.err.println("Hello world!");
		AAAAAA x;
		
		byte	b1 = 10, b2 = 20, b3 = (byte)(b1 + b2);
		
		System.err.println("b1+b2="+(b1+b2));
		System.err.println("b1-b2="+(b1-b2));
		System.err.println("b1*b2="+(b1*b2));
		System.err.println("b1/b2="+(b1/b2));
		System.err.println("b1%b2="+(b1%b2));

		System.err.println("b1|b2="+(b1|b2));
		System.err.println("b1&b2="+(b1&b2));
		System.err.println("b1^b2="+(b1^b2));
		System.err.println("~b1="+(~b1));
		
		System.err.println("b1 << 2="+(b1 << 2));
		System.err.println("b1 >> 2="+((-b1) >> 2));
		System.err.println("b1 >>> 2="+((-b1) >>> 2));
		
		System.err.println("b1<b2="+(b1<b2));
		System.err.println("b1<=b2="+(b1<=b2));
		System.err.println("b1>b2="+(b1>b2));
		System.err.println("b1>=b2="+(b1>=b2));
		System.err.println("b1==b2="+(b1==b2));
		System.err.println("b1!=b2="+(b1!=b2));
		
		double	d1 = 10, d2 = 20, d3 = b1 + b2;	// IEEE745
		
		System.err.println("d1+d2="+(d1+d2));
		System.err.println("d1-d2="+(d1-d2));
		System.err.println("d1*d2="+(d1*d2));
		System.err.println("d1/d2="+(d1/d2));
		System.err.println("d1%d2="+(d1%d2));
		
		System.err.println("d1<d2="+(d1<d2));
		System.err.println("d1<=d2="+(d1<=d2));
		System.err.println("d1>d2="+(d1>d2));
		System.err.println("d1>=d2="+(d1>=d2));
		System.err.println("d1==d2="+(d1==d2));
		System.err.println("d1!=d2="+(d1!=d2));
		
		int		i1 = 0, i2 = 0xFFDA, i3 = 0b011001, i4 = 1_000_000, i5 = 077;
		long	long1 = 0, long2 = 1234567889012345L;
		float	f1 = 10.5f, f2 = -3.5e-4f;
		char	c1 = '*', c2 = 10, c3 ='\r', c4 = '\u2400', c5 = '\077';
		boolean	bool1 = true, bool2 = false; 
	}
}
