import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution70 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long a=1;
        for(int i=1;i<=n;i++)
        {
            a=a*i;
        }
        System.out.println(a);
    }
}
