import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Answer120 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int x = in.nextInt();
        int sum=0;
        for(int i=0;i<x;i++)
        {
            double a=Math.pow(n,i);
            int b=(int)a;
            sum+=b;
        }
        System.out.println(sum);
    }
}
