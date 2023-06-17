///// PROBLEM //////



The Demogorgon is coming! There is only one way to stop it: if you can convince it that you're on their side, it will leave you alone.
In order to do this, you must turn your text ... Upside Down
Input
Line 1: A lowercase string s that needs to be turned upside down
Output
Line 1: The input string with the following letters upside down: a-e, b-p, d-q, m-w, n-u, s-z (and vice versa of course)
Constraints
All letters will be lowercase.
Punctuation should be left as it is.
Example
Input
run
Output
rnu



///// CODE FOR THE PROBLEM //////



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
        String s = in.nextLine();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='a')
            System.out.print("e");
            else if(ch=='e')
            System.out.print("a");
            else if(ch=='b')
            System.out.print("p");
            else if(ch=='p')
            System.out.print("b");
            else if(ch=='d')
            System.out.print("q");
            else if(ch=='q')
            System.out.print("d");
            else if(ch=='m')
            System.out.print("w");
            else if(ch=='w')
            System.out.print("m");
            else if(ch=='n')
            System.out.print("u");
            else if(ch=='u')
            System.out.print("n");
            else if(ch=='s')
            System.out.print("z");
            else if(ch=='z')
            System.out.print("s");
            else
            System.out.print(ch);
        }

        
    }
}
