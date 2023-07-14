/// PROBLEM ///


You must invert the case of each letter of the alphabet and remove special characters (except spaces and digits) contained in the given string S.
E.g. : Hello World! becomes hELLO wORLD
Input
A string S.
Output
The inverted string.
Constraints
0 < Length of S <= 1024
Example
Input
Hello World !
Output
hELLO wORLD 

  /// CODE FOR THE PROBLEM ///


  import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution266 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String S = in.nextLine();
        for(int i=0;i<S.length();i++)
        {
            char ch=S.charAt(i);
            if(Character.isLowerCase(ch))
            {
                int a=(int)ch-32;
                System.out.printf("%c",a);
            }
            else if(Character.isUpperCase(ch))
            {
                int b=(int)ch+32;
                System.out.printf("%c",b);
            }
            else if(ch==' ')
            {
                System.out.print(" ");
            }
            else if(Character.isDigit(ch))
            {
                     System.out.print(ch);
            }
        }
    }
}
