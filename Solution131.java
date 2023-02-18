import java.util.*;
import java.io.*;
import java.math.*;


class Solution131 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int b=0;
        for (int i = 0; i < N; i++) {
            int xi = in.nextInt();
             b=xi*xi+b;
        }

        System.out.println(b);
    }
}
