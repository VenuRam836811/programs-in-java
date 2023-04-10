import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solutions120 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x[]=new int[n];
        int y[]=new int[n];
        long sum=0;
        for (int i = 0; i < n; i++) {
            x[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            y[i] = in.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            double a=Math.pow(x[i],y[i]);
            int b=(int)a;
            sum+=b;
        }
        System.out.println(sum);
    }
}
