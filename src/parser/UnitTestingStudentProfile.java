package parser;

import org.testng.Assert;

public class UnitTestingStudentProfile {

    public static void main(String[] args) {

            Student st = new Student ("Sheikh","Rahman",40,50);



            Assert.assertEquals(st.getFirstName(),"Sheikh");

            Assert.assertEquals(st.getLastName(),"Rahman");

            Assert.assertEquals(st.getScore(),40);

            Assert.assertEquals(st.getId(),50);



    }

}
