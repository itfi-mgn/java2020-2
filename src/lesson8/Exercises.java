package lesson8;

public class Exercises {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 
		String s1 = "abcdefg";
		// TODO: make "AbCdEfG"
		StringBuilder	sb = new StringBuilder();
		
		for (int index = 0; index < s1.length(); index++) {	// 95%
			if (index % 2 == 0) {
				sb.append(Character.toUpperCase(s1.charAt(index)));
			}
			else {
				sb.append(Character.toLowerCase(s1.charAt(index)));
			}
		}
		System.err.println(sb);

		char[]	content = s1.toCharArray();
		
		for (int index = 0; index < content.length; index++) {	// 5%
			if (index % 2 == 0) {
				content[index] = Character.toUpperCase(content[index]);
			}
			else {
				content[index] = Character.toLowerCase(content[index]);
			}
		}
		System.err.println(new String(content));
		
		String	s2 = "12+34+567";
		// TODO: calculate sum inside s2
		int	sum = 0;		 // 95%
		
		for (String item : s2.split("\\+")) {
			sum += Integer.valueOf(item);
		}
		System.err.println("Sum="+sum);
		
		sum = 0;		 // 5%
		int add = 0;
		
		for (char item : s2.toCharArray()) {
			if (item >='0' && item <= '9') {
				add = add * 10 + item - '0';
			}
			else if (item == '+') {
				sum += add;
				add = 0;
			}
		}
		sum += add;
		System.err.println("Sum="+sum);
		
		
	}
}
