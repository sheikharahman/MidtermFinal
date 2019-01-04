package datastructure;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Iterator;
public class UseQueue {

	public static void main(String[] args) {

		/*

		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.

		 * Use For Each loop and while loop with Iterator to retrieve data.

		 * 

		 */

		Queue<String> grade=new LinkedList<String>();

		grade.add("A");

		grade.add("B");

		grade.add("C");

		grade.add("D");



		grade.size();



		grade.remove();

		grade.peek();

		grade.poll();







		Iterator it=grade.iterator();

		while(it.hasNext())

		{

			System.out.println(it.next());

		}

		for(String st1: grade)

		{

			System.out.println("Remove names: "+grade.remove()+" Peek Names: "+grade.peek()+" Poll Names: "+grade.poll());



		}



	}



}
	