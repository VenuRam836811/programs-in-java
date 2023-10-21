/// PROBLEM ///

A fella smokes a cigarette every 3 butts he finds.

Every cigarette smoked results into a new butt.

Given n butts found how many can he smoke ?
Input
An integer N for the number of butts found.
Output
An integer C for the number of cigarettes smoked.
Constraints
1 ≤ N ≤ 199
Example
Input
1
Output
0


  /// CODE FOR THE PROBLEM ////


import java.util.*;
import java.io.*;
import java.math.*;

class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n%2==0)
        System.out.print((n/2)-1);
        else
        System.out.print((n-1)/2);

    }
}
