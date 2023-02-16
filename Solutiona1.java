import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solutiona1 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int a=0;
        int sum=0;
        if(N<0)
        {
            System.out.println("no negative numbers");
        }
        else
        {
        while(N>0)
        {
            a=N%10;
            sum=sum+a;
            N=N/10;
        }
        if(sum%3==0)
        {
            System.out.println("true");
        }
        else
        {
             System.out.println("false");
        }
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

       
    }
}
