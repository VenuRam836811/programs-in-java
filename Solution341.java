/// PROBLEM 


You are given a string with upper and lower case letters.
I want to know the result of the number of uppercase letters raised to the power of the number of lowercase letters.
Spaces, digits and any other characters should be ignored.
Input
String s with upper and lower case letters.
Output
Result of the number of uppercase letters raised to the power of the number of lowercase letters.
Constraints
0 < the length of s < 20
Example
Input
HELLO world
Output
3125


/// CODE FOR THE PROBLEM 


  import java.util.*;
class Solution341{
public static void main(String args[]) {
        Scanner n=new Scanner(System.in);
        String s=n.nextLine();
        int a=0,b=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(Character.isLowerCase(c)) a++;
            if(Character.isUpperCase(c)) b++;    
        }
        System.out.print((int)Math.pow(b,a));
    }
}
