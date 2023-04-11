import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solutions123 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        long N = in.nextLong();
        long sum=0,sum1=0;
        while(N>0)
        {
            long a=N%10;
            sum+=a;
            N=N/10;
        }
        while(sum>0)
        {
            long b=sum%10;
            sum1+=b;
            sum=sum/10;
        }
        System.out.println(sum1);
    }
}
