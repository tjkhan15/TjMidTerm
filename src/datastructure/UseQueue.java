package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		Queue<String> movies = new LinkedList<>();

		movies.add("Black Panther");
		movies.add("Vice");
		movies.add("Roma");
		movies.add("Green Book");

		System.out.println("peek : "+movies.peek());
		System.out.println("remove : "+movies.remove());
		System.out.println("poll : "+movies.poll());

		for(String x : movies ) {
			System.out.println("for loop : "+x);
		}

		Iterator it = movies.iterator();
		while(it.hasNext()) {
			System.out.println("Iterator : "+it.next());
		}
	}
}
