/// PROBLEM ///


You are given a letter S (0=a, 1=b, 2=c, and so on). You need to find the corresponding Fibonacci number.
Fibonacci Sequence:-
1, 1, 2, 3, 5, 8, 13, 21...
with the first term being "a".
Input
A string S to compute.
Output
A Fibonacci number corresponding to the string number (see statement)
Constraints
S is only 1 letter, always lowercase
Example
Input
a
Output
1


  /// CODE FOR THE PROBLEM ///


import java.util.*;
import java.io.*;
import java.math.*;


class Solution308 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String T = in.nextLine();
        char a=T.charAt(0);
        int b=(int)a-96;
        int a1=0,b1=1,c1=0;
        if(b==1)
        System.out.print(b);
        else
        {
            for(int i=1;i<b;i++)
            {
                c1=a1+b1;
                a1=b1;
                b1=c1;
            }
            System.out.print(b1);
        }

    }
}
