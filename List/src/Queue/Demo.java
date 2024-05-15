package Queue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Demo {

	public static void main(String[] args) {

		PriorityQueue<String> queue = new PriorityQueue<>();
		queue.add("John");
		queue.add("Smith");
		queue.add("Orlen");
		queue.add("Charles");
		queue.add("Ravi");
		queue.add("Shashi");
		System.out.println(queue);
		System.out.println(queue.element());
		System.out.println(queue.peek());
		
		Iterator<String> iterator = queue.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			
			
		}
		queue.remove();
		queue.poll();
	}

}
