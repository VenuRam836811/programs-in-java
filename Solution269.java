### PROBLEM ###

  Add the value of the letters
Value is the same whether capitalized or not.
Non-letter characters are worth 0.
Input
Line 1: An integer n, number of lines
Following n lines: string l
Output
n lines: The computed values, in order of input
Constraints
Example
Input
4
a
b
C
D
Output
1
2
3
4


  ### CODE FOR THE PROBLEM ###

  import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution269 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        int sum=0;
        for (int i = 0; i < n; i++) {
            String k = in.nextLine();
            sum=0;
            for(int j=0;j<k.length();j++)
            {
                
                char ch=k.charAt(j);
                if(Character.isLowerCase(ch))
                {
                    sum+=(int)ch-96;
                }
                if(Character.isUpperCase(ch))
                {
                    sum+=(int)ch-64;
                }
                
            }
            System.out.println(sum);
        }
    }
}
