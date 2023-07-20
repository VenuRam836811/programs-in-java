/// PROBLEM ///

Given a 
string s, you must convert it to aLtErNaTiNg CaSe, and then output only the alphabetic characters out it.
Input
A string s
Output
s but in aLtErNaTiNg CaSe
Constraints
0 <= len(s) <= 1500
Characters can only be a-z A-Z 0-9
Example
Input
sdg9ad71gg
Output
sDgaDgG

  /// CODE FOR THE PROBLEM ///

  import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution274 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(Character.isLetter(ch))
            {
            if(i%2==0)
            {
            if(Character.isLowerCase(ch))
            {
               System.out.print(ch);
            }else
            {
                int a=(int)ch+32;
                System.out.printf("%c",a);
            }
            }
            else
            {
              if(Character.isUpperCase(ch))
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
}
