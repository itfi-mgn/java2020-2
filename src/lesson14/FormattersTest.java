package lesson14;

import java.text.MessageFormat;

public class FormattersTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MessageFormat	mf;
		
		System.err.println(MessageFormat.format("{0,number,###} + {1,number,###} = {2,number,###}", 3, 5, 8));
	}
}
