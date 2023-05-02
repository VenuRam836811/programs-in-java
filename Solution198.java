import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution198 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String S1 = in.next();
        String S2 = in.next();
        int a[]=new int[S1.length()];
         int b[]=new int[S2.length()];
         int c=0;
        for(int i=0;i<S1.length();i++)
        {
            char ch=S1.charAt(i);
            a[i]=(int)ch;
        }
        Arrays.sort(a);
        for(int i=0;i<S1.length();i++)
        {
            char ch=S2.charAt(i);
            b[i]=(int)ch;
        }
        Arrays.sort(b);
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==b[i])
            c++;
        }
        if(c==a.length)
        System.out.print("1");
        else
        System.out.print("0");


        
    }
}
