/// PROBLEM ///

Mirrored time number is a number of two digits x and y which if we write like xy:xy or xy:yx we get a valid time in hh:mm.
You are given a number N which represents xy. Your task is to print all the valid combinations separated by spaces. If no such combination exists print 'NONE'.
The result will always be unique
Example:
N=12
Result:
12:12 12:21
Input
Line 1: A number n with two characters x and y
Output
Line 1: A list of all combinations or 'NONE'.
Constraints
0<=N<=1000
Example
Input
11
Output
11:11

  /// CODE FOR THE PROBLEM ///

import java.util.*;
import java.io.*;
import java.math.*;

class Solution {
public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String N = in.nextLine();
        String N1=new StringBuffer(N).reverse().toString();
        int a=Integer.parseInt(N);
        int b=Integer.parseInt(N1);
        if(a<=24 && b<=60)
        {
        if(N.equals(N1))
        System.out.print(N+":"+N);
        else
        System.out.print(N+":"+N+" "+N+":"+N1);
        }
        else if(a<=24 && b>60)
        {
            System.out.print(N+":"+N);
        }
        else
        {
            System.out.print("NONE");
        }
}
}
