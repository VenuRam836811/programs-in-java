import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution160 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int V = in.nextInt();
        int N = in.nextInt();
        int a=0,b=0;
        for (int i = 0; i < N; i++) {
            String transaction = in.next();
            int amount = in.nextInt();
            if(transaction.equals("W"))
            {
                a=a+amount;
            }
            else if(transaction.equals("D"))
            {
                b=b+amount;
            }
        }
        System.out.println(b+V-a);
    }
}
