/// PROBLEM ///


In the land of Word Flip, letters in words like to play leapfrog! Each letter wants to jump over its neighbor to the right until there are no more letters to jump over. Your task is to simulate this playful behavior. For a given word, each letter should be moved to the right end one by one, in order, from the first to the last.
Input
A single line containing a word word to be flipped.
Output
Multiple lines representing the playful jumps of each letter in the word. For each letter, output the word as it looks after that letter has jumped to the end.
Constraints
word contains only lowercase alphabetic characters.
1 ≤ word.length ≤ 100
Example
Input
code
Output
odec
deco
ecod
code



  // CODE FOR THE PROBLEM ///


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
        String word = in.nextLine();
        String str="";
        for(int i=0;i<word.length();i++)
        {
            for(int j=1;j<word.length();j++)
            {
                char ch=word.charAt(j);
                str+=ch;
            }
            str+=word.charAt(0);
            System.out.println(str);
            word=str;
            str="";
        }

       
    }
}
