///// PROBLEM ////


Björn owns a small company with 6 employees. He has decided to give a gift for the most secure password in the company, given the following rules:

A password s is valid only if:

- its length is 8 <= s <= 15
- it contains at least one number
- it contains at least one upper-case character
- it doesn't contain any space

He attributes points like this:

- each space char gives 0 point
- each upper-case char gives 10 points
- each lower-case char gives 5 points
- each number gives only 1 point
- every other char (like " ! . , & - @) gives 25 points.

For example, !Bash&234a.r, ====> returns True, 138 where 138 is the sum of the points of each char.
Input
Line 1: The password string s, which contains only ASCII characters.
Output
A string valid, points based on the given password, where:

- valid is True or False
- points is an integer that represents the sum of the points of each char in the password
Constraints
Example
Input
BigPassword
Output
False, 65


/// CODE FOR THE PROBLEM ///

  import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution259 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String L = in.nextLine();
        int sum=0,sum1=0,sum2=0,sum3=0;
        for(int i=0;i<L.length();i++)
        {
            char ch=L.charAt(i);
            if(Character.isUpperCase(ch))
            {
                sum+=10;
            }
            else if(Character.isLowerCase(ch))
            {
                sum1+=5;
            }
            else if(Character.isDigit(ch))
            {
                sum2+=1;
            }
            else if(ch==' ')
            {

            }
            else
            {
                sum3+=25;
            }
        }
  int z=sum+sum1+sum2+sum3;
       if(sum>0&&sum1>0&&sum2>0&&sum3>0)
       {
        System.out.print("True, "+z);
       }
       else
       {
           System.out.print("False, "+z);
       }
    }
}
