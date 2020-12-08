package lesson11;

public class Exercises {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human[]		list1 = {new Human("Ivanov","Ivan","Ivanovich",21),
							 new Human("Petrov","Petr","Petrovich",22)
							};
		Human[]		list2 = {new Human("Sidorov","Sidor","Sidorovich",23)
							};
		
		// 1. Create ZIP d:/temp.zip and store lis1 into 'subdivision1', list2 into 'subdivision2'
	}

}


class Human {
	String 	family;
	String 	name;
	String 	patroname;
	int		age;
	
	public Human(String family, String name, String patroname, int age) {
		this.family = family;
		this.name = name;
		this.patroname = patroname;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Human [family=" + family + ", name=" + name + ", patroname=" + patroname + ", age=" + age + "]";
	}
}
