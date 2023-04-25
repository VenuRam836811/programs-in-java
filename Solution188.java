import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution188 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int S = in.nextInt();
        int E = in.nextInt();
        int c=0,d=0,e=0,f=0;
        for(int i=S;i<=E;i++)
        {
            if(i%a==0 && i%b!=0)
            c++;
            else if(i%b==0 && i%a!=0)
            d++;
            else if(i%a==0 && i%b==0)
            e++;
            else
            f++;
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(c+" "+d+" "+e+" "+f);
    }
}
