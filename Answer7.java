import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Answer7 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String water = in.next();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
            System.out.print(" ");
            }
            System.out.println(water);
            //System.out.println(" ");
        }
    }
}
