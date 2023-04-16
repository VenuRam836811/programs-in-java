import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solutions145 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int X = in.nextInt();
        int Y = in.nextInt();
        int sum=0;
        double a=Math.pow(X,Y);
        int b=(int)a;
        while(b>0)
        {
            int c=b%10;
            sum+=c;
            b=b/10;
        }
        

        System.out.println(sum);
    }
}
