import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution189 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum=0,sum1=0;
        while(n>=1)
        {
            int a=n%10;
            sum+=a;
            n=n/10;
            
            
        }
        while(sum>=1)
        {
            int b=sum%10;
            sum1+=b;
            sum/=10;
        }
        System.out.print(sum1);
    }
}
