import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution155 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum=0;
        if(n<10)
        {
            System.out.println(n*n);
        }
        else
        {
            while(n>0)
            {
                int a=n%10;
                sum+=a;
                n=n/10;
            }
 System.out.println(sum*sum);
        }

       
    }
}
