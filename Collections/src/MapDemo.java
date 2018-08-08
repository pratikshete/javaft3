import java.util.HashMap;

public class MapDemo {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<>();
		map.put("Jack", "Jill");
		map.put("Scott", "Tiger");
		map.put("Duke", "Java");
		map.put("Jack", "Rose");

		for (String key : map.keySet())
			System.out.println(key + ":" + map.get(key));

	}

}
