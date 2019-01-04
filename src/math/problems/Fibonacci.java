package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
        /*

        Write 40 Fibonacci numbers with java.

       */

      int n=0,n1=1,count=40;

      for(int i=0;i<count;i++)

      {

          int total =n+n1;

          n=n1;

          n1=total;

          System.out.print(" "+total);

      }





  }

}
     
