///// PROBLEM ////


The game mode is REVERSE: You do not have access to the statement. You have to guess what to do by observing the following set of tests:
01 Test 1
Input
Expected output
a----b
A----B
02 Test 2
Input
Expected output
Hello!!
hELLO!!
03 Test 3
Input
Expected output
AAbBcc
aaBbCC
04 Test 4
Input
Expected output
TesT
tESt



  ////// CODE FOR THE PROBLEM //////


  import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution240 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(Character.isLetter(ch))
            {
            int a=(int)ch;
            if(a<91)
            {
                System.out.printf("%c",a+32);
            }
            else if(a>96)
            {
                System.out.printf("%c",a-32);
            }
            }
            else
            {
                System.out.print(ch);
            }
        }

    }
}
