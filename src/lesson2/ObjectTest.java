package lesson2;

public class ObjectTest {
	static String		prefix = "sd";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object		obj = new Object();
		
		Class<? extends Object> cl = obj.getClass();
		System.err.println("Obj="+obj.toString());
		String		s = "sdsdsd", s1 = prefix+"sdsd";
		
		System.err.println("Eq: "+s.equals(s1));
	
		
		java.lang.Number	n;	// 
		java.lang.Byte		b;	// byte
		java.lang.Short		sh;	// short
		java.lang.Integer	i;	// int
		java.lang.Long		L;	// long
		java.lang.Float		f;	// float
		java.lang.Double	d;	// double
		
		java.lang.Boolean	z;	// boolean
		java.lang.Character	c;	// char
		
		obj = 10;	// obj = Integer.valueOf(10);
		
		Integer		i1 = 10, i2 = 20, i3 = Integer.valueOf("10");
		// Integer	i1 = Integer.vauleOf(10), i2 = Integer.valueOf(20),
		//  i3 = Integer.valueOf(i1.intValue()+i2.intValue());
		
	}

}
