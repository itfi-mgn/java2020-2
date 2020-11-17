package lesson8;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class StringTest {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// TODO Auto-generated method stub
		String	s = "vassya";	// char[]	s
		
		s += "123";	// "vassya123";
		
		System.err.println("Length: "+s.length());
		
		System.err.println("CharAt: "+s.charAt(0));	// s[0]
		System.err.println("CodePOint at: "+(char)s.codePointAt(0));	// s[0]
		
		System.err.println("Equals: "+s.equals("vassya"));
		System.err.println("Equals: "+(s == "vassya"));
		
		System.err.println("Equals Ignore: "+s.equalsIgnoreCase("vassya123"));
		System.err.println("Equals Ignore: "+s.equalsIgnoreCase("VaSsYa123"));
		
		System.err.println("Equals Ignore: "+"vassya123".equalsIgnoreCase(s));

		System.err.println("Compare: "+s.compareTo("a"));
		System.err.println("Compare: "+s.compareTo("z"));
		System.err.println("Compare Ignore: "+s.compareToIgnoreCase("Z"));
		
		System.err.println("INdex: "+s.indexOf('a'));
		System.err.println("Last INdex: "+s.lastIndexOf('a'));

		System.err.println("2-nd INdex: "+s.indexOf('a',s.indexOf('a')+1));
		System.err.println("3-rd INdex: "+s.indexOf('a',s.indexOf('a',s.indexOf('a')+1)+1));

		System.err.println("string INdex: "+s.indexOf("as"));
	
		System.err.println("Starts: "+s.startsWith("v"));
		System.err.println("Ends: "+s.endsWith("3"));
		System.err.println("Contains: "+s.contains("as"));
		
		System.err.println("Substring: "+s.substring(3));
		System.err.println("Substring: "+s.substring(3,4));
		System.err.println("Substring: ["+s.substring(3,3)+"]");
		
		System.err.println("Replace: "+s.replace('a', 'A'));
		System.err.println("Replace (del): "+s.replace("a", ""));
	
		System.err.println("ReplaceAll: "+s.replaceAll("\\d*",""));

		System.err.println("Split: "+Arrays.toString(s.split("a")));
		System.err.println("Upper case: "+s.toUpperCase());
		System.err.println("Lower case: "+s.toLowerCase());
	
		char[]	content = s.toCharArray();
		System.err.println("Content="+Arrays.toString(content));
		System.err.println("Revert Content="+new String(content));
		
		byte[]	byteContent = s.getBytes("UTF-8");
		System.err.println("Byte Content="+Arrays.toString(byteContent));
		System.err.println("Revert Byte Content="+new String(byteContent,"UTF-8"));
	
		int	x = Integer.valueOf("1235");
		System.err.println("X="+x);
		String xS = String.valueOf(x);
		System.err.println("xS="+xS);	// new StringBuidler().append("xS=).append(xS).toString()
		
		StringBuilder	sb = new StringBuilder();
		
		System.err.println(	// 99%
			sb.append("abcde").append(s,3,8).append(2222).append(-3.5).append(true).toString()
		);

		System.err.println("is digit? "+Character.isDigit('1'));
		System.err.println("is letter? "+Character.isLetter('A'));

		System.err.println("Lower case: "+Character.toLowerCase('A'));
		System.err.println("Upper case: "+Character.toUpperCase('z'));
		
		switch (s) {	// switch (s.hashCode()) {
			case "vassya123" :	// case "vassya123".hashCode() :
				// if ("vassya123".equals(s)) {
				System.err.println("YESSSSS!!!!");
				// } else {
				//     goto default;
				// }
			default :
		}
	}

}
