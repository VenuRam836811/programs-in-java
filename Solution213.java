import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution213 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int a=Math.max(x,y);
        int max=0,b=0,c=0;
        if(x!=y)
        {
        for(int i=1;i<a;i++)
        {
            if(x%i==0 && y%i==0)
            {
                max=i;
                b=x/i;
                c=y/i;
            }

        }
        System.out.println(max);
        System.out.println(b+" "+c);
        }
        else
        {
            System.out.println(x);
            System.out.println("1 1");
        }
    }
}
