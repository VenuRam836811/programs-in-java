import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution8 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int time = in.nextInt();
        int speed = in.nextInt();
        int a=time*speed;
        int b=a/60;

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(b);
    }
}
