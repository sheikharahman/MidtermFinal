package datastructure;

import java.util.ArrayList;
import javax.swing.text.html.parser.Parser;
import databases.ConnectToSqlDB;
import java.util.Collection;
import java.util.Iterator;
import java.util.*;
import java.util.List;
public class UseArrayList {

	public static void main(String[] args) {
		/*

		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.

		 * Use For Each loop and while loop with Iterator to retrieve data.

		 * Store all the sorted data into one of the databases.

		 * 

		 */

		ArrayList<String> list = new ArrayList<String>();

		list.add("This");

		list.add("Exam");

		list.add("is");

		list.add("Hard");

		System.out.println(list);

		list.get(1);

		list.remove(2);



		System.out.println(list);



		Iterator it = list.iterator();

		//iterator with while loop

		while(it.hasNext())

		{

			System.out.println(it.next());

		}

		//iterator with for each loop

		for (String a : list)

		{

			System.out.println("Listed Names are :" + a);

		}





		Collections.sort(list);

		System.out.println(list);

		List al = new ArrayList();

		al = list;



		ConnectToSqlDB.connectToSqlDatabase();

		ConnectToSqlDB arr = new ConnectToSqlDB();



		arr.createTableFromStringToMySql("Array_list","listElement");



		arr.insertDataFromArrayListToSqlTable(al, "Array_list", "ALMethods");





		List<String> numbers = arr.readDataBase("Array_list", "AlMethods");

		for(String str:numbers){

			System.out.println(str);

		}









	}



	}


	