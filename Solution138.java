import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution138 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int a=0,b=0;
        int c=Math.max(n,d);
        for(int i=2;i<=c;i++)
        {
            if(n%i==0 && d%i==0)
            {
                a=n/i;
                b=d/i;
            }
        }
       if(a!=0 && b!=0)
       {
        System.out.println(a+"/"+b);
       }
       else
       {
         System.out.println(n+"/"+d);
       }
    }
}
