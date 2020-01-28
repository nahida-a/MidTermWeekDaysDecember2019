package datastructure;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */
		List<String> job = new ArrayList<Srting>();
		job.add("A");
		job.add("b");
		job.add("c");

		List<String>  = new ArrayList<String>();
		edu.add("HS");
		edu.add("AS");
		edu.add("BS");




		List<Integer> nameId = new ArrayList<>();
		nameId.add(101);
		nameId.add(102);
		nameId.add(103);
		Map<String,List<String>> list1 =new LinkedHashMap<String, List<String>>();
		list1.put("job",job);
		list1.put("edu", edu);


		Map<String,List<Integer>> list2 =new HashMap<String, List<Integer>>();
		list2.put("ID", nameId);


		for(Map.Entry key: list1.entrySet()){
			System.out.println(key.getKey()+" "+key.getValue());
		}

		for(Map.Entry key: list2.entrySet()){
			System.out.println(key.getKey()+" "+key.getValue());
	}

	}

}
