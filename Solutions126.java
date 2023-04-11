import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solutions126 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        long N= in.nextLong();
        int k = 1;
        while (N > 1) {
            k++;
            N /= k;
        }
        if (N == 1) {
            System.out.println(k);

        }
        //System.out.println("result");
    }
}
