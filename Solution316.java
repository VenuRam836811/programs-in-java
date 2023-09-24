/// PROBLEM ///


Modify the input sentence this way :
1-st word should have only letters with EVEN ASCII codes.
2nd word should have only letters with ODD ASCII codes.
and keep alternating between odd and even.
Using this pattern, some words might completely disappear, so be careful to not leave extra spaces.
Describing the task from another angle:
every word with even index in the sentence should be stripped off of letters with odd ascii codes and left with letters that possess only even ASCII code.
And reversed for words with odd indices.
Input
Space separated words
Output
Processed sentence
Constraints
ASCII characters only
Example
Input
Canada Canada Ontario Ontario
Output
nd Caaa ntr Oaio


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
        String T = in.nextLine();
        String[] a=T.split(" ");
        int n=0;
        String str="";
        for(int i=0;i<a.length;i++)
        {
            String b=a[i];
            
            for(int j=0;j<b.length();j++)
            {
                char c=b.charAt(j);
                int m=(int)c;
              if(i%2==0)
              {
                if(m%2==0)
                {n++;
                   str+=c;
                }
                else
                {
                   n++;
                }
              }
              else
              {
                 if(m%2==1)
                 {n++;
                    str+=c;
                 }
                 else
                 {
                     n++;
                 }
              }
            }
             if(n>0)
              {
               str+=" ";
              }
              n=0;
        }
        for(int i=0;i<str.length()-1;i++)
        {
            char ch=str.charAt(i);
            System.out.print(ch);
        }
    }}
