/// PROBLEM ///

Multiply the number of consonants with the number of vowels in the string.
Consonants: bcdfghjklmnpqrstvwxz and uppercase equivalents
Vowels: aeiouy and uppercase equivalents
Letters with accents and special characters are ignored.
Input
Line 1: An integer N for the number of lines of the character string
Next N lines: A string text
Output
An integer for the multiplication result
Constraints
Example
Input
1
Toto
Output
4
Console output


  //// CODE FOR THE PROBLEM ////


  import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution251 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int a=0,b=0;
        if (in.hasNextLine()) {
            in.nextLine();
        }
        for (int i = 0; i < N; i++) {
            String text = in.nextLine();
            String str=text.toLowerCase();
            
            for(int j=0;j<str.length();j++)
            {
                char ch=str.charAt(j);
                if(Character.isLetter(ch))
                {
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='y')
                {
                    a++;
                }
                else
                {
                    b++;
                }
                }
            }
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(a*b);
    }
}
