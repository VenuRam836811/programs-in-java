import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution209 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c=0;
        while(n!=0)
        {
            int b=n%10;
            c=c*10+b;
            n=n/10;
        }
        while(c>0)
        {
            int a=c%10;
            if(a%2==0)
            System.out.print("#");
            if(a%2==1)
             System.out.print("*");
             c=c/10;
        }

        
    }
}
