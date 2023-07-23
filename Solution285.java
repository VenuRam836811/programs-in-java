/// PROBLEM ///
You must output the n-th element of the number sequence, which is specified by these rules:
1. First two elements (N1 and N2) are given.
2. The element with index n is the sum of two previous elements. For example, N4 = N3 + N2.

Example
Input:
0 1
3

Sequence:
0 1 1 2 3 5 8 ...

Output (3rd element):
1
Input
Line 1: First two elements (N1, N2) of the sequence
Line 2: Number n
Output
n-th element of the sequence.
Constraints
1 ≤ n ≤ 500
Example
Input
0 1
3
Output
1

  /// CODE FOR THE PROBLEM ///

  import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution285 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N1 = in.nextInt();
        int N2 = in.nextInt();
        int n = in.nextInt();
        int a=0;
        if(n==1)
        {
            System.out.print(N1);
        }
        else
        {
    a=N1+N2;
    for(int i=2;i<n;i++)
    {
        a=N1+N2;
        N1=N2;
        N2=a;
    }
    System.out.print(N2);
        }

    }
}
