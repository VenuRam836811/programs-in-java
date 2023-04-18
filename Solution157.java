import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution157 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        long N = in.nextLong();
        int sum=0;
        while(N>0)
        {
            long a=N%10;
            if(a%2==0)
            {
                sum+=a;
            }
            N=N/10;
        }

        System.out.println(sum);
    }
}
