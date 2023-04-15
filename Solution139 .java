import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution139 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for (int i = 0; i < N; i++) {
            String W = in.next();
            String w1=new StringBuffer(W).reverse().toString();
            if(W.equals(w1))
            {
                System.out.println("true");
            }
            else
            {
                 System.out.println("false");
            }
        }
    }
}
