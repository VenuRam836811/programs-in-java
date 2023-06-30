///// PROBLEM ////


A program that calculates the total area of a set of geometric shapes, whose type and dimensions are provided. The geometric shapes can be circles or rectangles. The program should return the total area of all the geometric shapes.
Input
Line 1: An integer N representing the number of geometric shapes to calculate.
Next N lines: A character ( C or R), representing the type of geometric shape (C for circle, R for rectangle) followed by two integers a and b, representing the dimensions of the geometric shape (the radius for a circle or the length and width for a rectangle). If it is a circle, b can be ignored.
Output
A single line containing the total area of all the geometric shapes. The total must be rounded to 2 decimal places
Constraints
1 <= N <= 5
1 <= a <= 15
0 <= b <= 15
Example
Input
4
R 3 4
C 2 0
R 5 6
C 3 0
Output
82.84



  ////// CODE FOR THE PROBLEM ////



  import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution242 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        double sum=0;
        for (int i = 0; i < N; i++) {
            String s = in.next();
            int a = in.nextInt();
            int b = in.nextInt();
            if(s.equals("C"))
            {
                sum+=3.1415*a*a;
            }
            if(s.equals("R"))
            {
                sum+=a*b;
            }
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.printf("%.2f",sum);
    }
}
