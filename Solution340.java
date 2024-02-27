/// PROBLEM 


You have to decode a word to find the flag.
The code works like this:
The first character is shifted by 1 in the alphabet, the second by 2 and so on.

The alphabet is: [a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z]

For example the flag: "easy" is coded like this:
"e" becomes "f".
"a" becomes "c
"s" becomes "v
"y" becomes "c

The word you would be given is "fcvc".
Input
Line 1: An Integer i for the size of the string.
Line 2: A string w that you have to decode.
Output
Line 1: A string that represent the flag.
Constraints
1<=i<=100
Example
Input
4
fcvc
Output
easy


  /// CODE FOR THE PROBLEM 



  import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution340 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        String w = in.nextLine();
        for(int i=0;i<w.length();i++)
        {
            char ch=w.charAt(i);
            int a=(int)ch-96;
            int b=a-(i+1);
            if(b>0)
            System.out.printf("%c",b+96);
            else
            System.out.printf("%c",122+b);

        }
    }
}
