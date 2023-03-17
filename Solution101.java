import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution101 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int M = in.nextInt();
        int N = in.nextInt();
        int sum=0;
        for (int i = 0; i < N; i++) {
            int E = in.nextInt();
            int a=E%M;
            sum+=a;
        }
        System.out.print(sum);
    }
}
