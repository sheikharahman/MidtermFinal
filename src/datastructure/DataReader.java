package datastructure;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import databases.ConnectToSqlDB;

public class DataReader {

	public static void main(String[] args) {
		/*

		 * User API to read the below textFile and print to console.

		 * Use BufferedReader class.

		 * Use try....catch block to handle Exception.

		 *

		 ****** Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.

		 *

		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word

		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO

		 * order from LinkedList and retrieve as FILO order from Stack.

		 *

		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.

		 * Use For Each loop/while loop/Iterator to retrieve data.

		 */
		String textFile = "C:\\Users\\Rob Dos\\Desktop\\sheik\\MidtermNovember2018\\src\\data\\self-driving-car";

		FileReader fr= null;

		try {

			fr = new FileReader(textFile);

			System.out.println("your File  found.");

		} catch (Exception e) {

			System.out.println("File  not found");
		}

		Stack <String>Stack = new Stack<String>();

		List<String> List = new LinkedList<String>();

		BufferedReader br = new BufferedReader(fr);

		String a;

		ConnectToSqlDB con = new ConnectToSqlDB();

		con.createTableFromStringToMySql("Car","Info");

		try {

			while ((a = br.readLine()) !=null){

				System.out.println(a);

				String [] word = a.split("");

				for (int i=0; i<word.length; i++) {

					Stack.push(word[i]);

					List.add(word[i]);

				}

				con.insertDataFromStringToSqlTable(a, "Car", "Info");

			}

		} catch (IOException e) {

			e.printStackTrace();

		}finally {

			try {

			br.close();

			fr.close();

		}catch (IOException e2){

				e2.printStackTrace();

			}

		}

		Stack.push("Bangladesh");

		Stack.pop();

		Stack.peek();

		Stack.search("Bangladesh");

		//read from the database

		List<String> text = con.readDataBase("Car", "Info");

		for (String x : text) {

		System.out.println(x);

		}

		//Retrive as FIFO order

		for (int b = 0; b<List.size(); b++) {

			System.out.println(List.get(b));

		}

		//Retrive in FILO order

		for (int c=Stack.size(); c>=0; --c) {

			System.out.println(Stack.get(c));

		}

		//Retrive using for each loop

		for (String elements: Stack) {

			System.out.println(elements);

		}
		//Retrieve using iterator

		Iterator<String> itrator = List.iterator();

		while (itrator.hasNext()){

			System.out.println(itrator.next()+" ");

		}

		//Retrieve using while loop

		while (!Stack.isEmpty())

		{

			System.out.println(Stack.pop() + " ");

		}

	}

}
		