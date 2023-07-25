/// PROBLEM ///

The game mode is REVERSE: You do not have access to the statement. You have to guess what to do by observing the following set of tests:
01 Test 1
Input
Expected output
12
Hey Hi!
Hi
02 Test 2
Input
Expected output
131
How are you?
Hey
03 Test 3
Input
Expected output
0020002001000200
I see trees of green, red roses too. I see them bloom for me and you.
rose
04 Test 4
Input
Expected output
125402110104
Coding something beside indie game and general application for my own entertainment
Codingame

  /// CODE FOR THE PROBLEM ///

  import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution287 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String key = in.nextLine();
        String message = in.nextLine();
        int b[]=new int[key.length()];
       for(int i=0;i<key.length();i++)
       {
        char ch=key.charAt(i);
        int a=(int)ch-48;
        b[i]=a;
       }
       String[] str=message.split(" ");
       for(int i=0;i<str.length;i++)
       {
        String c=str[i];
        if(b[i]!=0)
        {
        System.out.print(c.charAt(b[i]-1));
        }
       }
    }
}
