////// PROBLEM /////



In a school of 12 classes, the students thought of planting trees in and around the school to reduce air pollution. It was decided that the number of trees that each class will plant will follow an arithmetic progression, e.g., class 1 will plant X tree, class 2 will plant Y trees and so on till class 12.
How many trees will be planted by the students?

A idea from Spring Challenge 2021.
Good luck...
Input
Line 1 integer X the first term of arithmetic progression.
Line 2 integer Y the second term.
Output
integer total number of trees that will be planted by students.
Constraints
1<=X<=1000000
1<=Y<=1000000
Example
Input
1
2
Output
78



//// CODE FOR THE PROGRAM /////


import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int X = in.nextInt(),sum=0;
        int y = in.nextInt();
        for(int i=1;i<=12;i++)
        {
            sum+=i*(Math.abs(X-y));
        }
    
        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(sum);
    }
}
