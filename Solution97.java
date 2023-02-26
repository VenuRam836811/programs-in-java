import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution97 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum=0;

        if (in.hasNextLine()) {
            in.nextLine();
        }
        for (int i = 0; i < n; i++) {
            String f = in.nextLine();
            if(f.equals("zoan"))
            {
                sum=sum+25;
            }
            if(f.equals("paramecia"))
            {
                sum=sum+75;
            }
            if(f.equals("logia"))
            {
                sum=sum+100;
            }
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(sum+" beli");
    }
}
