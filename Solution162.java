import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution162 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        long sum=0,sum1=0;
        for(int i=1;i<=N;i++)
        {
            double a=Math.pow(i,2);
            long b=(long)a;
            sum+=b;
            sum1+=i;
        }
        System.out.println((long)Math.pow(sum1,2)-sum);
    }
}
