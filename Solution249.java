//// PROGRAM ////

You are in a room with happy people and sad people. You wish to measure how happy the room is.
To do this, you decide to add one point for each happy face and remove one for each sad face.

The possible emoticons are the following.
Happy:
=)
^_^

Sad:
:(
>_<

The final score may be a negative number.
Input
Line 1: A string of emoticons, each separated by exactly one space.
Output
A single line containing the total happiness score.
Constraints
There may be any number of faces from 1 to 9 (inclusive).
Example
Input
=) ^_^
Output
2

  //// CODE FOR THE PROBLEM ////


  import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution249 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String faces = in.nextLine();
        int a=0,b=0,c=0,d=0;
        for(int i=0;i<faces.length();i++)
        {
            char ch=faces.charAt(i);
            if(ch=='=')
            {
            a++;
            }
            if(ch=='^')
            {
            b++;
            }
            if(ch==':')
            {
            c++;
            }
            if(ch=='>' || ch=='<')
            {
            d++;
            }
            
        }
        int z=d/2;
        int y=b/2;


        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(a+y-(c+z));
    }
}
