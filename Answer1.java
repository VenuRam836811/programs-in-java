import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Answer1 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double a=n/2;
        int b=(int)a;
        if(n%2==0)
        {
        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(b*(n-1));
        }
        else
        {
            System.out.println(b*n);
        }
    }
}
