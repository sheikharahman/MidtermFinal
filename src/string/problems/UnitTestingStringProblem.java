package string.problems;

import org.testng.Assert;

public class UnitTestingStringProblem {
    public static void main(String[] args) {

        Anagram.isAnagram("APPLE", "ELPPA");

        Assert.assertTrue(true, "true");

        DetermineLargestWord.findTheLargestWord("Human brain is a biological learning machine");

       Assert.assertEquals("biological","biological");
       DuplicateWord.duplicateWords("Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language");

       Assert.assertEquals("Java"+"is","Java"+"is");
        Palindrome.main(new String[]{"DAD"});

        Assert.assertEquals(true, true);

        Permutation.conceptPermutation("XYZ");

        Assert.assertEquals("XZY,YXZ,YZX,ZXY,ZYX","XZY,YXZ,YZX,ZXY,ZYX");

    }

}




  