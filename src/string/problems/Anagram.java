package string.problems;

import java.util.Arrays;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {


    public static void main(String[] args) {

        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is

        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".

        String b = "APPLE";

        String e = "ELPPAs";

        System.out.println(isAnagram(b, e));

    }

    public static boolean isAnagram (String str1, String str2)//

    {

        if (str1.length() != str2.length()) {

            return false;

        }

        char[] str1c =str1.toCharArray();

        Arrays.sort(str1c);

        char[] str2c =str2.toCharArray();

        Arrays.sort(str2c);
        return Arrays.equals(str1c, str2c);

    }

}

   