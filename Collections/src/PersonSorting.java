import java.util.TreeSet;

public class PersonSorting {

	public static void main(String[] args) {
		PersonComparator pc = new PersonComparator();
		TreeSet<Person> persons = new TreeSet<>(pc);
		
	//TreeSet<Person> persons = new TreeSet<>((p1.p2) -> p1.getAge() - p2.getAge());
		//TreeSet<persons> 
		
		persons.add(new Person("Bala", 21));
		persons.add(new Person("Guru", 19));
		persons.add(new Person("Swami", 20));

		persons.forEach(System.out::println);

	}

}
