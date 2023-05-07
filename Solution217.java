import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution217 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum=0,c=0;
        for (int i = 0; i < n; i++) {
            String attempt = in.next();
            if(attempt.equals("PASS"))
            sum+=6;
            c++;
        }

       if(c==16)
        System.out.println(sum+4);
        else
        System.out.print(sum);
    }
}
