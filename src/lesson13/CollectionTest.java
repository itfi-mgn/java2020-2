package lesson13;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Child1<Type1,Type2 extends java.lang.Number> extends CollectionTest<Type1,Type2> {
	
}

class Child2<Type1> extends CollectionTest<Type1,Integer> {
	
}

class Child3 extends CollectionTest<String,Integer> {
	
}

class Child4<Type3> extends CollectionTest<String,Integer> {
	
}

public class CollectionTest<Type1,Type2 extends java.lang.Number> {
	
	public Type1		myField;	// Object myField
	public Type2		myField2;	// Number myField
	
	public Type2 call(Type1 value) {
		return null;
	}

	public static void main(String[] args) throws NoSuchFieldException, SecurityException {
		// TODO Auto-generated method stub
		Class	cl = CollectionTest.class;
		Field	f = cl.getField("myField");
		
		System.err.println("Field type: "+f.getType());
		System.err.println("Field2 type: "+cl.getField("myField2").getType());
		
//		CollectionTest<String,Integer> ct = null;
//		
//		ct.myField = "vassya";
//		String s = /*(String)*/ct.myField;
		
		Iterable	it = null;
		
//		for(Object item : it) {
//		}
		
		List<String>		list = new ArrayList<String>(); 
		
		list.add("vassya");
		list.add("petya");
		list.add(1,"tanya");
		
		for (String item : list) {
			System.err.println("Item="+item);
		}
//		String	s = /*(String)*/list.remove(0);
		
		System.err.println("Content="+list);
		System.err.println("get: "+list.get(0));	// ... = list[0]
		list.set(0,"kim");							// list[0] = ...
		System.err.println("Content[2]="+list);		
		
		list.addAll(Arrays.asList("asdas","asdasd","dghgh","gh","ghgh"));
		
		Set<String>			set = new HashSet</*String*/>();
		
		set.add("vassya");
		set.add("petya");
		set.add("vassya");
		
		for (String item : set) {
			System.err.println("Item="+item);
		}
		System.err.println("Remove: "+set.remove("vassya"));
		System.err.println("Contains: "+set.contains("vassya"));
		System.err.println("COntent: "+set);
		
		set.addAll(Arrays.asList("vassya","igor","kim","vassya"));	// a U b
		System.err.println("COntent: "+set);
		set.retainAll(Arrays.asList("vassya","petya","tanya"));	// a ^ b
		System.err.println("COntent: "+set);
		set.removeAll(Arrays.asList("petya","tanya"));	// a - b
		System.err.println("COntent: "+set);
	}

}
