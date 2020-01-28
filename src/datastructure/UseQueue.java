package datastructure;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<String>  = new LinkedList<String>();
		qlist.add("east");
		qlist.add("Black");
		qlist.add("Yellow");
		qlist.add("White");
		System.out.println("peek: "+qlist.peek());
		System.out.println("remove: "+qlist.remove());
		System.out.println("peek: "+qlist.peek());
		System.out.println("poll: "+qlist.poll());
		for(String str : qlist ){
			System.out.println("for each loop : "+str);
		}
		Iterator itr = qlist.iterator();
		while(itr.hasNext()){
			System.out.println("Iterator : "+itr.next());
		}



	}

}
	}

}
