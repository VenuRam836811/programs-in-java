/// PROBLEM ///


Given a sentence, reverse the order of the words in it. Your program should be case-sensitive. A word is considered to be any sequence of characters separated by a space. Assume the input will not have leading or trailing spaces, and words are always separated by a single space.
Input
A single string sentence representing the sentence.
Output
A single string that contains the words from the original string in reverse order.
Constraints
All characters in the sentence will be printable ASCII characters.
1 ≤ length of sentence ≤ 100
Example
Input
Hello World
Output
World Hello


  /// CODE FOR THE PROBLEM ///


  import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String sentence = in.nextLine();
        String a[]=sentence.split(" ");
        for(int i=a.length-1;i>=0;i--)
        {
            System.out.print(a[i]);
            if(i>=1)
            {
                System.out.print(" ");
            }
        }

    }
}
