import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution223 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if(x>=0)
        {
        int a=(int)(Math.log10(x)+1);
        System.out.println(a*x);
        }
        if(x<0)
        {
            int b=Math.abs(x);
            int c=(int)(Math.log10(b)+1);
        System.out.println(c*x);
        }
    }
}
