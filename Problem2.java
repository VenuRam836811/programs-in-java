/// PROBLEM ///

The game mode is REVERSE: You do not have access to the statement. You have to guess what to do by observing the following set of tests:
01 Test 1
Input
Expected output
4
1 2 3 4
10
02 Test 2
Input
Expected output
5
1 2 3 4 5
15
03 Test 3
Input
Expected output
3
10 20 30
6
04 Test 4
Input
Expected output
2
55 45
19

  /// CODE FOR THE PROBLEM ///

  import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Problem2{

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum=0,add=0;
        for (int i = 0; i < n; i++) {
            int r = in.nextInt();
            sum=0;
            while(r!=0)
            {
                int a=r%10;
                sum+=a;
                r/=10;
            }
            add+=sum;
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(add);
    }
}
