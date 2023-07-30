/// PROBLEM ///

Given the prime decomposition of a positive integer, return the corresponding integer.
Example: 1 0 2 1
recomposed integer = 2**1 * 3**0 * 5**2 * 7**1 = 350
Input
Line 1 : 2 space-separated integers n and l, the number of integers to recompose, and the length of each decomposition.
n next lines : l space-separated integers, the factors for the l first prime numbers.
Output
n lines : an integer corresponding to the prime recomposition
Constraints
1 ≤ n ≤ 20
1 ≤ l ≤ 20
1 ≤ Any integer to output ≤ 2^64-1
Example
Input
5 4
0 0 0 0
1 0 0 0
0 1 0 0
0 0 1 0
0 0 0 1
Output
1
2
3
5
7

  /// CODE FOR THE PROBLEM ///

  import java.util.*;
import java.io.*;
import java.math.*;

class Solution294 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int l = in.nextInt();
        int b[]={2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73};
        int x[][]=new int[n][l];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < l; j++) {
                x[i][j] = in.nextInt();
            }
        }
        long sum=1;
     for (int i = 0; i < n; i++) {
        sum=1;
            for (int j = 0; j < l; j++) {
               sum*=Math.pow(b[j],x[i][j]);
            }
            System.out.println(sum);
        }
        
    }
}
