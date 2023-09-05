/// PROBLEM ///

Extra characters are scattered in the sentences, among them: ' ? ! / , . : ) %
Your task is to count how many such characters are in a sentence.

! Space is not extra character !
Input
One sentence
Output
One number - quantity of extra characters
Constraints
3 <= lengh of sentence <= 100
Example
Input
Where's your motivation?
Output
2

  /// CODE FOR THE PROBLEM ///

  import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution298 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String s= in.nextLine();
        int a=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(Character.isLetter(ch) || ch==' ')
            {

            }
            else
            {
                a++;
            }
        }
System.out.print(a);
    }
}
