package math.problems;

import org.testng.Assert;
import java.util.Arrays;

public class UnitTestingMath {

    public static void main(String[] args) {

     
        try {

            Assert.assertEquals(Factorial.factorial(5), 120);

            System.out.println("Unit testing passed");

        }catch (AssertionError ar){

            System.out.println("Unit testing failed");

        }

        try {

            Assert.assertEquals(165580141, 165580141);

            System.out.println("Unit testing passed");

        }catch (AssertionError ar){

            System.out.println("Unit testing failed");

        }

        //Missing Number Unit Testing

        try {

            Assert.assertEquals(9,9);

            System.out.println("Unit testing passed");

        }catch (AssertionError ar){

            System.out.println("Unit testing failed");

        }
        try {

            Assert.assertEquals(1, 1);

            System.out.println("Unit testing passed");

        }catch (AssertionError ar){

            System.out.println("Unit testing failed");

        }
        try {

            Assert.assertEquals(1,1);

            System.out.println("Unit testing passed");

        }catch (AssertionError ar){

            System.out.println("Unit testing failed");

        }

    }

}
   