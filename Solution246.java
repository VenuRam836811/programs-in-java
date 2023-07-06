//////PROGRAM ////


The game mode is REVERSE: You do not have access to the statement. You have to guess what to do by observing the following set of tests:
01 Test 1
Input
Expected output
abcdABCD
ABCD
02 Test 2
Input
Expected output
abcd1234
None
03 Test 3
Input
Expected output
abcdDCBA
DCBA
04 Test 4
Input
Expected output
123 A 4
A
05 Test 5
Input
Expected output
Codingame
C
06 Test 6
Input
Expected output
HeLlO WOrLd
HLOWOL


  ///// CODE FOR THE PROGRAM ////

  import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution246 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int a=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(Character.isUpperCase(ch))
            {
                System.out.print(ch);
                a++;
            }
        }
        if(a==0)
        System.out.println("None");

        
    }
}
