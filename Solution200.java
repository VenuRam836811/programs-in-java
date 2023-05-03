import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution200 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int a=0,b=1,c=0;
        for(int i=0;i<N;i++)
        {
            System.out.print(a);
            if(i<N-1)
            System.out.print(" ");
            c=a+b;
            a=b;
            b=c;
        }

    }
}
