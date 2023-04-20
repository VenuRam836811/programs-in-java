import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solutions161 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        if(A+B>C && A+C>B && B+C>A)
        {
            System.out.print(A+B+C);
        }
        else
 System.out.println("-1");
    }
}
