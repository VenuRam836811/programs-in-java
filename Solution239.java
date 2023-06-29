////// PROBLEM /////


his challenge is about expressing a birthday differently via a string of alphabet from "A...J". Each character's index will correspond (0..9) respectively.
The input sequence will contain "-" or "/" it will correspond to the seperation between day month and year.
PS: All the inputs will translate to valid dates
Input
Line 1: A String DT to be decoded.
Output
Line 1: A String Birthday, the output after you have finished decoding it and it should contain "-" or "/" like the input to seperate the day, month and year.
Constraints
The DT length should be:
11<DT.length<20
Example
Input
AB-AB-CAAB
Output
01-01-2001




  /////// CODE FOR THE PROBLEM //////


  import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution239 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(Character.isLetter(ch))
            {
                int a=(int)ch-65;
                System.out.print(a);
            }
            else
            {
                System.out.print(ch);
            }
        }

    }
}
