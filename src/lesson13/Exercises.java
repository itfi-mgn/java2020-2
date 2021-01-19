package lesson13;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Exercises {
	public static String[]	names = {"ivan","petr","boris","petr","alla","ivan"};
	public static int[]		ages = {20,23,28,23,18,20};
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// exclude duplicates from 'names' and sort it
		Set<String>	s = new HashSet<>(Arrays.asList(names));
		String[]	sa = new String[s.size()];
		
		s.toArray(sa);
		Arrays.sort(sa);
		
		
	}

}
