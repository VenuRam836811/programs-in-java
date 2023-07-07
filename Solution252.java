///// PROBLEM ///

You are given a string s with letters and digits and a string c.
The goal is to print digits in s separated with c.
Input
Line 1: string s
Line 2: separation string c
Output
Line 1 : Digits contained in s separated by c
Constraints
Example
Input
Hell0 W0rld
*
Output
0*0

  //// CODE FOR THE PROBLEM ////


  import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution252 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String c = in.nextLine();
        int a=0,z=0;
        
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(Character.isDigit(ch))
            {z++;
            }
        }
        int d[]=new int[z*2];
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(Character.isDigit(ch))
            {
                int b=(int)ch-48;
                d[a*2]=b;
                a++;
            }
        }
        for(int i=0;i<d.length*2;i++)
        {
            if(i%2==0)
            {
                System.out.print(d[i]);
            }
            else if(i%2==1 && i<d.length-1)
            {
                System.out.print(c);
            }
        }

    }
}


