package parser;

import databases.ConnectToMongoDB;
import databases.ConnectToSqlDB;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ProcessStudentInfo {
	/*

	 * Under XmlReader class, the parseData() will return list of Student Info which will contain Student first name, last name and score.

	 * You need to implement the method name "convertIntToChar()" which will convert String score into char Grade.('A'for 90 to 100,'B'for 80 to 89 and

	 * 'C' for 70 to 79.

	 *

	 * Here in the main method fill in the code that outlined to read xml data parsed into 2 separate ArrayList, then store into map.

	 * Once map has all data, retrieve those data and out put to console.

	 *

	 * Do any necessary steps that require for below successful output.

	 * ......................................................

	 * Student (id= 1) "Ibrahim" "Khan"        		Grade= B

	 * Student (id= 2) "Asif" "Roni"          		Grade= A

	 * Student (id= 3) "Gumani" "Hose"              Grade= A

	 * Student (id= 4) "Sukanto" "Shaha"            Grade= B

	 * Student (id= 5) "MD" "Hossain"               Grade= C

	 * .....................................................

	 */



	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {

		//Path of XML data to be read.

		String pathSelenium  = System.getProperty("user.dir") +"/src/parser/selenium.xml";

		String pathQtp = System.getProperty("user.dir") + "/src/parser/qtp.xml";

		String tag = "id";

		//Create ConnectToSqlDB Object

		ConnectToMongoDB connectToMongoDB = new ConnectToMongoDB();

		//Declare a Map with List<String> into it.

		Map<String,List<Student>> list = new LinkedHashMap<String,List<Student>>();


		ArrayList<Student> seleniumStudents = new ArrayList<Student>();

		ArrayList<Student> qtpStudents = new ArrayList<Student>();

		//Create XMLReader object.

		XmlReader xmlReader = new XmlReader();

		//Parse Data using parseData method and then store data into Selenium ArrayList.

		seleniumStudents = (ArrayList<Student>) xmlReader.parseData(tag, pathSelenium);

		//Parse Data using parseData method and then store data into Qtp ArrayList.

		qtpStudents= (ArrayList<Student>) xmlReader.parseData(tag,pathQtp);

		list.put("selenium",seleniumStudents);


		list.put("qtp",qtpStudents);


		for (Map.Entry <String,List<Student>> print : list.entrySet()){

			List<Student> studentList=(List<Student>) list.get(print.getKey());

			System.out.println("\nPortfolio of Student of "+print.getKey()+"classes :\n");

			for (Student studentprofile:studentList) {

				int id=studentprofile.getId();

				String firstname=studentprofile.getFirstName();

				String lastname=studentprofile.getLastName();

				int grade=studentprofile.getScore();

				System.out.println("Student (id="+id+")"+firstname +" "+lastname+" "+"Grade="+grade);

			}
		}

		connectToMongoDB.insertIntoMongoDB(qtpStudents,"qtp");

		connectToMongoDB.insertIntoMongoDB(seleniumStudents,"selenium");


		List<Student> stList = connectToMongoDB.readStudentListFromMongoDB("qtp");

		for(Student st:stList){

			System.out.println(st.getFirstName()+" "+st.getLastName()+" "+st.getScore()+" "+st.getId());

		}


		List<Student> stList1 = connectToMongoDB.readStudentListFromMongoDB("selenium");

		for(Student st:stList1){

			System.out.println(st.getFirstName()+" "+st.getLastName()+" "+st.getScore()+" "+st.getId());

		}

	}


}
