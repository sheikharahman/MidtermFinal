package string.problems;

public class Palindrome {

        public static void main(String[] args) {

            /*

              If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are

              Palindrome. So write java code to check if a given String is Palindrome or not.

             */

            String inputString = "DAD";
            int length = inputString.length();

            int i, start, end, middle;
            start = 0;

            end = length - 1;

            middle = (start + end)/2;
            for (i = start; i <= middle; i++) {

                if (inputString.charAt(start) == inputString.charAt(end)) {

                    start++;

                    end--;

                }

                else {

                    break;

                }

            }

            if (i == middle + 1) {

                System.out.println("Palindrome Successful");

            }

            else {

                System.out.println("Not a palindrome");

            }

        }


        }
        
       