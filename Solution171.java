import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution171 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int d=Math.max(Math.max(a,b),c);
            int e=Math.min(Math.min(a,b),c);
            if(a==d && e==b || b==d && e==a)
            {
                System.out.println(c);
            }
            if(c==d && b==e || b==d && e==c)
            {
                System.out.println(a);
            }
            else
            {
                System.out.println(b);
            }
            
            
        }
    }
}
