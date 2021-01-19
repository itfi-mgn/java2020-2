package lesson14;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final List<String>		l = Arrays.asList("vassya","petya");
		
		final Stream<String>	s = l.stream();		// source
		final Stream<String>	s1 = s.distinct();	// intermediate
		final long				s2 = s1.count();	// terminal
		
		l.stream().filter(new Predicate() {
			@Override
			public boolean test(Object t) {
				return "vassya".equals(t);
			}
		}).forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.err.println("Value="+t);
			}
		});
		
		l.stream().filter((t)->"vassya".equals(t)).forEach((t)->System.err.println("Value="+t));
		
		for (String item : l) {
			if ("vassya".equals(item)) {
				System.err.println("Value="+item);
			}
		}
		
	}

}
