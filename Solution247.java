//// PROBLEM ////


Given the lengths of the three sides of a triangle, a, b and c, calculate the perimeter of said triangle if it is a RIGHT triangle (one angle is 90°).

If the three side lengths given are not able to form a RIGHT triangle, print invalid. This could be the case if either
• A length is negative or zero
• The lengths are mismatched. You might test this using the Pythagorean theorem: a² + b² = c²

Hint: You don't really need to google any formulas for this one. Perimeter = a+b+c
Input
Line 1: An integer a containing the length of side a.
Line 2: An integer b containing the length of side b.
Line 3: An integer c containing the length of side c.
Output
Line 1 : The perimeter of the triangle or the string literal invalid.
Constraints
a, b, c are all integers

a + b + c <= 3000
Example
Input
3
4
5
Output
12


  ///// CODE FOR THE PROGRAM ////


  import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution247 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt(); 
        
        int d=(int)Math.sqrt(a*a+b*b);
        if(a>0&&b>0&&c>0)
        {
        if(d==c)
        {
            System.out.print((int)a+b+d);
        }
        else
        System.out.print("invalid");
        }
        else
        System.out.print("invalid");

        
    }
}
