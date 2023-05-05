import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution211 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=1;i<=n;i++)
        {
        if(i%3==0 && i%4!=0 && i%5!=0)
        System.out.println("Fizz");
        else if(i%5==0 && i%3!=0 && i%4!=0)
        System.out.println("Buzz");
       else if(i%4==0 && i%5!=0 && i%3!=0)
        System.out.println("Bar");
         else if(i%3==0 && i%4==0 && i%5!=0)
         System.out.println("FizzBar");
         else if(i%5==0 && i%4==0 && i%3!=0)
         System.out.println("BuzzBar");
         else if(i%5==0 && i%3==0 && i%4!=0)
         System.out.println("FizzBuzz");
         else if(i%3==0 && i%4==0 && i%5==0)
         System.out.println("FizzBuzzBar");
         else
         System.out.println(i);
        }



    }
}
