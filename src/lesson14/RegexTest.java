package lesson14;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// *.txt  a*.txt ???.*
		final Pattern		p = Pattern.compile("a(.*)\\.txt");
		final Matcher		m = p.matcher("assa.txt");

		System.err.println("Matches? :"+m.matches());
		System.err.println("From="+m.regionStart());
		System.err.println("To="+m.regionEnd());
		System.err.println("Group="+m.group(1));
		
		System.err.println("REplace: "+"dklfj90mvklj34klvklj0,m,m4".replaceAll("\\d{2,2}",""));
		System.err.println("Split: "+Arrays.toString("dklfj90mvklj34klvklj0,m,m4".split("\\d{2,2}")));
		
		
	}
}
