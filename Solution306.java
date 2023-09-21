/// PROBLEM ///


The game mode is REVERSE: You do not have access to the statement. You have to guess what to do by observing the following set of tests:
01 Test 1
Input
Expected output
54
63
02 Test 2
Input
Expected output
65
76
03 Test 3
Input
Expected output
2
4
04 Test 4
Input
Expected output
17
25
05 Test 5
Input
Expected output
75
87
06 Test 6
Input
Expected output
134
142
07 Test 7
Input
Expected output
1024
1031
08 Test 8
Input
Expected output
2048
2062


  /// CODE FOR THE PROBLEM ///


import java.util.*;
import java.io.*;
import java.math.*;
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int a=N;
        int sum=0;
        while(N>0)
        {
            int b=N%10;
            sum+=b;
            N=N/10;
        }
        System.out.println(a+sum);
    }
}
