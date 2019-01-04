package math.problems;

import databases.ConnectToSqlDB;

public class PrimeNumber {
	public static void main(String[] args) throws Exception {

		/*

		 * Find list of Prime numbers from number 2 to 1 million.

		 * Try the best solution as possible.Which will take less CPU life cycle.

		 * Out put number of Prime numbers on the given range.

		
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.

		 */


		int[] arr = new int[0];

		for (int i=2; i<=1000000;i++)

		{

			for (int j=2;j<=i;j++)

			{

				if(j==i)

				{

					System.out.println(i);

				}

				if(i%j==0)

				{

					break;

				}

			}

		}

		int[] list = arr;

		ConnectToSqlDB.connectToSqlDatabase();

		ConnectToSqlDB connect = new ConnectToSqlDB();

		connect.insertDataFromArrayToSqlTable(list, "Prime_Numbers", "PN");

		connect.readDataBase("Prime_Numbers", "PN");


	}

}
