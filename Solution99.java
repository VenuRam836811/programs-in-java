import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution99 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c=a*b;
        if(c<=26)
        {
           int d=c+97;
            System.out.printf("%c",d);
        }
        else if(c>26)
        {
            int e=c-26;
            if(e>26)
            {
                int g=e-26;
               // int z=g+97;
            
                int z=g+97;
                System.out.printf("%c",z);
                
            }
            else
            {
            int f=e+97;
            System.out.printf("%c",f);
            }
        }


        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        //System.out.println("a");
    }
}
