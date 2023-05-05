import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution210 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int f = in.nextInt();
        int a=f*2;
        int N = in.nextInt();
        for (int i = 0; i < N; i++) {
            int ch = in.nextInt();
            System.out.println(a-ch*2);
        }

    }
}
