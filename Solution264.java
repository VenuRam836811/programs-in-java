/// PROBLEM ///

Create a Fibonacci sequence in reverse


The first two terms of the Fibonacci sequence are 1 and 1. The rest of the terms are calculated by adding the two last terms of the sequence. Ex: the 3rd term is 2 because it's 1 + 1 and the 4th is 3 because it's 2 + 1
Input
Integer N the depth of the Fibonacci sequence to calculate
Output
String s which is the reversal of the Fibonacci sequence calculated and all the terms are space-separated
Constraints
2 ≤ N ≤ 100
Example
Input
4
Output
3 2 1 1


/// code for the problem ///

  import java.util.*;
import java.io.*;
import java.math.*;
import java.util.Arrays;
/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution264 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int a=0,b=1,c=0;
        int z[]=new int[s];
        for(int i=0;i<s;i++)
        {
            c=a+b;
            a=b;
            b=c;
            z[i]=a;
        }
        Arrays.sort(z);
        for(int i=s-1;i>=0;i--)
        {
            System.out.print(z[i]);
            if(i>0)
            {
                System.out.print(" ");
                
            }
        }
    }
}
