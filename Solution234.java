///// PROBLEM /////


Crushing a number, in this case, means to multiply all digits of an integer together, resulting in a smaller integer.
Input
Line 1: An integer N for the number
Line 2: An integer T, the amount of times to crush N
Output
Line 1: An integer O, the output after you have finished crushing
Constraints
0 ≤ N ≤ 1000
0 ≤ T ≤ 1000
0 ≤ O ≤ 1000
Example
Input
88
1
Output
64



////// CODE FOR THE PROBLEM ////


import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution234 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); // The number to crush
        int T = in.nextInt(),sum=1;
        if(N>0)
        { // The amount of times to crush the number
        for(int i=1;i<=T;i++)
        {
              sum=1;
            while(N>0)
            {
              
                int a=N%10;
                sum*=a;
                N=N/10;
            }
            N=sum;;
        }
        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(N);
        }
        else
        System.out.print(N); // Print out your crushed number
    }
}
