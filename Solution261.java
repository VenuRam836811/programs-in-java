//// PROBLEM ///

The game mode is REVERSE: You do not have access to the statement. You have to guess what to do by observing the following set of tests:
01 Test 1
Input
Expected output
5
15
02 Test 2
Input
Expected output
7
28
03 Test 3
Input
Expected output
8
36
04 Test 4
Input
Expected output
1
1
05 Test 5
Input
Expected output
9
45
06 Test 6
Input
Expected output
10
55
07 Test 7
Input
Expected output
2
3
08 Test 8
Input
Expected output
3
6
09 Test 9
Input
Expected output
4
10
10 Test 10
Input
Expected output
6
21


  /// CODE FOT THE PROBLEM ////


  import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution261 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int a=N/2;
        if(N%2==0)
        System.out.print(N*(a)+a);
        else
        System.out.print(N*(a+1));
    }
}
