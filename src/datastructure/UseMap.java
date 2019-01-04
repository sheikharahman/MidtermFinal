package datastructure;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import databases.ConnectToSqlDB;

public class UseMap {
	public static void main(String[] args) throws Exception {

		/*

		 * Demonstrate how to use Map that includes storing and retrieving elements.

		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();

		 * Use For Each loop and while loop with Iterator to retrieve data.

		 *

		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.

		 */



		List<String> cityOfBD = new ArrayList<>();

		cityOfBD.add("Sylhet");

		cityOfBD.add("Comilla");

		cityOfBD.add("Barisal");

		cityOfBD.add("Mymensing");

		cityOfBD.add("Dhaka");



		List<String> cityOfUSA = new ArrayList<>();

		cityOfUSA.add("New York");

		cityOfUSA.add("New Jersey");

		cityOfUSA.add("Texas");

		cityOfUSA.add("Virginia");

		cityOfUSA.add("Florida");





		List<String> cityOfGB = new ArrayList<>();

		cityOfGB.add("London");

		cityOfGB.add("Bristol");

		cityOfGB.add("Liverpool");

		cityOfGB.add("York");

		cityOfGB.add("Manchester");





		Map<String, List<String>> list = new HashMap<String, List<String>>();

		list.put("BD",cityOfBD);

		list.put("UK", cityOfGB);

		list.put("USA",cityOfUSA);



		System.out.println(list);



		//System.out.println(" ");



		for (Map.Entry<String, List<String>> st : list.entrySet()){

			System.out.println(st.getKey()+ " --------> " +st.getValue());

		}

		System.out.println(" ");



		Set set = list.entrySet();

		Iterator it = set.iterator();

		while(it.hasNext())

		{

			System.out.println(it.next());

		}

		ConnectToSqlDB con = new ConnectToSqlDB();



		List list1 = cityOfGB;

		//con.insertDataFromArrayListToSqlTable(list1,"cityOfGB","City");

		con.insertDataFromStringToSqlTable(String.valueOf(list1), "cityOfGB", "City");

		System.out.println("Data showing from database");

		List<String> numberA = con.readDataBase("cityOfGB","City");

		for(String st:numberA){

			System.out.println(st);

		}



		List list2 = cityOfGB;

		//con.insertDataFromArrayListToSqlTable(list2,"cityOfBD","City");

		con.insertDataFromStringToSqlTable(String.valueOf(list2),"cityOfBD", "City");

		System.out.println("Data showing from database");

		List<String> numberB = con.readDataBase("cityOfBD","City");

		for(String st:numberB){

			System.out.println(st);

		}



		List list3 = cityOfUSA;

		//con.insertDataFromArrayListToSqlTable(list3,"cityOfUSA","City");

		con.insertDataFromStringToSqlTable(String.valueOf(list3),"cityOfUSA", "City");

		System.out.println("Data showing from database");

		List<String> numberC = con.readDataBase("cityOfUSA","City");

		for(String st:numberC){

			System.out.println(st);

		}

	}



}

	