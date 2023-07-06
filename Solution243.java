////// PROBLEM ////


Depending on type, Sum up all of the odd or even numbers from 1 to value
Input
Line 1 : A String type, either odd or even, for the type of number to sum
Line 2 : A number value , for the maximum value to sum up
Output
Line 1: The sum of all the type integers less than or equal to value
Constraints
type = odd or even
1 ≤ value < 1000
Example
Input
even
11
Output
30



  ///// CODE FOR THE PROGRAM ////


  import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution243 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String type = in.next();
        int value = in.nextInt();
        int sum=0;
        if(type.equals("even"))
        {
            for(int i=0;i<=value;i++)
            {
                if(i%2==0)
                {
                    sum+=i;
                }
            }
        }
        if(type.equals("odd"))
        {
            for(int i=0;i<=value;i++)
            {
                if(i%2==1)
                {
                    sum+=i;
                }
            }
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");
        System.out.println(sum);
    }
}
