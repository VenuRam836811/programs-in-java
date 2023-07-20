/// PROBLEM ///

You are given three integers representing the lengths sides of a triangle: a, b, and c. If the three form a right triangle, print the area of the triangle with side lengths a, b, and c. Otherwise, print Invalid.
Input
Line 1: Three integers, a, b, and c.
Output
A single line containing the area of the triangle, if a, b, and c form a Pythagorean triple, and Invalid otherwise.
Constraints
0<a<b<c<1000
Example
Input
3
4
5
Output
6

  /// CODE FOR THE PROBLEM ///

import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution275 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        double d=a*b*0.5;
        int a1=a*a+b*b;
        int c1=c*c;
        if(a1==c1)
        {
         System.out.print((int)d);
        }
        else
        {
            System.out.print("Invalid");
        }
    }
}  
