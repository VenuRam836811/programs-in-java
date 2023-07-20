/// PROBLEM ///

The game mode is REVERSE: You do not have access to the statement. You have to guess what to do by observing the following set of tests:
01 Test 1
Input
Expected output
Elpm1ax7E
EXAMPLE
02 Test 2
Input
Expected output
D452l1r0o8w O11l9le7H
HELLO WORLD
03 Test 3
Input
Expected output
E6ta283lOC37o4hC e75Vo99l I21
I LOVE CHOCOLATE
04 Test 4
Input
Expected output
ola4F6fuB 0ol77a5fUB 6olaF6F4Ub ol5a3F6fub olafF3534b ola36345F3fu4B Ola2FF124UB olAFF112uB
BUFFALO BUFFALO BUFFALO BFFALO BUFFALO BUFFALO BUFALO BUFFALO

  //// CODE FOR THE PROBLEM ///

  import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution277 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String c = in.nextLine();
        String str=new StringBuffer(c).reverse().toString();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(Character.isLetter(ch) || ch==' ')
            {
                if(Character.isUpperCase(ch) || ch==' ')
                {
                System.out.print(ch);
                }
                else
                {
                    int b=(int)ch-32;
                    System.out.printf("%c",b);
                }
            }
        }

    }
}
