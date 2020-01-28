package datastructure;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 * 
		 */
		ArrayList<String> Name = new ArrayList<String>();
		//adding element
		Name.add("Liam");
		Name.add("Leon");
		Name.add("Luis");


		//Print A.List
		System.out.println("Printing elements from the ArrayList: " + Name);

		//peek element

		System.out.println("Peek element from the ArrayList: " + Name.get(1));

		//remove element from ArrayList
		Name.remove("Luis");
		System.out.println("Remove element: " + Name);

		//Retrieving elements from ArrayList
		System.out.println("Retrieving elements from the ArrayList: " + Name);

		//Using forEach loop
		System.out.println("Use forEach loop: ");
		for (String str : Name) {
			System.out.println(str);
		}

		//iterating ArratList
		System.out.println("iterator of the array list: ");
		Iterator itr = Name.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}



	}

}

	}

}
