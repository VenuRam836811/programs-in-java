import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution184 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int a[]=new int[N];
        for (int i = 0; i < N; i++) {
             a[i] = in.nextInt();
        }
        int b[]=new int[N];
        for (int i = 0; i < N; i++) {
            b[i] = in.nextInt();
        }
        int sum=0;
        for(int i=0;i<N;i++)
        {
            sum+=Math.abs(a[i]-b[i]);
        }

       
        System.out.println(sum);
    }
}
