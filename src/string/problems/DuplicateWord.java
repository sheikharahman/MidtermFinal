package string.problems;

import java.util.HashSet;
import java.util.Set;

import java.util.Collections;

/**
 * Created by mrahman on 04/22/17.
 */
public class DuplicateWord {
    static String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

    public static void main(String[] args) {

        /*

         * Write a java program to find the duplicate words and their number of occurrences in the string.

         * Also Find the average length of the words.

         */

        Set<String> duplicates = duplicateWords(st);

        System.out.println("input : " + st);

        System.out.println("output : " + duplicates);

        String[] words = st.split(" ");

        DuplicateWord.occurance();

        int count = 0;

        double sum = 0;

        for (String word : words) {

            double wordLength = word.length();

            sum += wordLength;

            count++;

        }

        double average = 0;

        if (count > 0) {

            average = sum / count;

        }

        System.out.println("Average word length = " + average);

    }

    public static void occurance(){

        String input= st; //

        String[] words=input.split(" "); 

        int wordCount=1; 

        for(int i=0;i<words.length;i++) 

        {

            for(int j=i+1;j<words.length;j++) 

            {

                if(words[i].equals(words[j])) //

                {
                    wordCount=wordCount+1; 
                    words[j]="0"; 

                }

            }

            if(words[i]!="0")

                System.out.println(words[i]+"--"+wordCount); 

            wordCount=1;

        }

    }

    public static Set<String> duplicateWords(String input){

        if(input == null || input.isEmpty()){

            return Collections.emptySet();

        }

        Set<String> duplicates = new HashSet<>();

        String[] words = input.split("\\s+");

        Set<String> set = new HashSet<>();

        for(String word : words){

            if(!set.add(word)){

                duplicates.add(word);

            }

        }

        return duplicates;
    }

}

   