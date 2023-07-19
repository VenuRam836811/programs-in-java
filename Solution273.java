
//// PROBLEM ///

The game mode is REVERSE: You do not have access to the statement. You have to guess what to do by observing the following set of tests:
01 Test 1
Input
Expected output
5
do
it
02 Test 2
Input
Expected output
12
am
my
03 Test 3
Input
Expected output
6
hi
no
04 Test 4
Input
Expected output
19
the
max
05 Test 5
Input
Expected output
6
fusion
layout
06 Test 6
Input
Expected output
7
manful
thumbs

  /// CODE FOR THE PROBLEM ///

  import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution273 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        String s = in.nextLine();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            int b=(int)ch+a;
            if(b<=122 && b>96)
            {
                System.out.printf("%c",b);
            }
            if(b>122)
            {
                int c=b-122+96;
                System.out.printf("%c",c);
            }
            
        }
    }
}
