/// PROBLEM ///


Given an integer a and an odd prime number p, the Legendre symbol (a / p) tells us whether or not a is a square modulo p.
The Legendre symbol is defined as:
0 if p divides a
1 if a is a square modulo p (in other words, if you can find an integer b such that p divides b² - a)
-1 otherwise
Write a program that computes Legendre symbols. You do not have to check if p is prime.
Examples:
(35/7) = 0 because 7 divides 35
(265/193) = 1 because 193 divides 74² - 265
(12/5) = -1 because 5 does not divide 12, and 12 is not a square modulo 5
Input
Line 1: a - A positive integer
Line 2: p - An odd prime number
Output
The value of the Legendre symbol (a / p)
Constraints
a > 0
3 ≤ p ≤ 2357
p is always a prime number
Example
Input
1
13
Output
1


  /// CODE FOR THE PROBLEM ///


import java.util.*;
import java.io.*;
import java.math.*;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int p = in.nextInt();
        int c=Math.abs(a-p);
        if(a%p==0)
        System.out.println("0");
        else if(a%p!=0)
        {
            if((c*c-a)%p==0)
            {
                System.out.print("1");
            }
            else
            {
                System.out.print("-1");
            }
        }

    }
}
