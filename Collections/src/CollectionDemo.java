import java.util.*;

public class CollectionDemo {

	public static void main(String[] args) {

		Vector<String> v = new Vector<>();
		v.add("Oracle");
		v.add("Microsoft");
		v.add("Google");
		v.add("Apple");
		v.add("Ibm");

		System.out.println("-- Iterating over vector using for each");
		for (String elem : v)
			System.out.println(elem);
		System.out.println("Iterating Vector using Iterator");
		Iterator<String> ltr = v.iterator();
		while (ltr.hasNext())
			System.out.println(ltr.next());

		LinkedList<String> lst = new LinkedList<>();
		lst.add("Tesla");
		lst.add("Apache");
		lst.addFirst("Apple");

		v.addAll(lst);// merging list into vector
		System.out.println("--Iterating over updated vector using for each");
		for (String elem : v)
			System.out.println(elem);

		// converting vector into set
		HashSet<String> set = new HashSet<>(v);
		System.out.println("--Iterating over hashset using for each");
		for (String elem : set)
			System.out.println(elem);

		// COnveritng set into TreeSet
		TreeSet<String> tree = new TreeSet<>(set);
		System.out.println("--Iterating over Treeset using for each");
		for (String elem : tree.descendingSet())
			System.out.println(elem);

		// New way to iterate from java 8
		System.out.println("--Iterating over Treeset using java 8forEach");
		tree.forEach(System.out::println);

		String[] week = { "Sun", "Mon", "Tue", "Wed", "Thrus", "Fri", "Sat" };
		List<String> days = Arrays.asList(week);
		days.forEach(System.out::println);

	}

}
