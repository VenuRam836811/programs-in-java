import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution147 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int num[]=new int[n];
        int c=0;
        for (int i = 0; i < n; i++) {
         num[i] = in.nextInt();
        }
        Arrays.sort(num);
        for(int j=0;j<n;j++)
        {
            c=num[1];
        }
        System.out.println(c);

    }
}
