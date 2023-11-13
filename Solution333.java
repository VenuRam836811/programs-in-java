/// PROBLEM ///


Write a program to merge lines of numbers whose sum is even.
Each line may contain a different amount of numbers.
Input
Line 1: An integer N for the number of next lines.

Next N lines: Space separated numbers (only integers).
Output
The concatenation of lines whose sum is even in the same order as input, separated by a space.

0 if there is no even lines.
Constraints
2 ≤ N ≤ 20

0 ≤ number ≤ 100
Example
Input
2
1 2 3
4 5 6
Output
1 2 3



/// CODE FOR THE PRONLEM ///


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
        int N = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        int sum=0,a=0;
        String h="";
        for (int i = 0; i < N; i++) {
            String input = in.nextLine();
            String str[]=input.split(" ");
            for(int j=0;j<str.length;j++)
            {
                sum+=Integer.parseInt(str[j]);
                
            }
            if(sum%2==0)
            {
                a++;
                h+=input+" ";
            }
            sum=0;
        }
        if(a==0)
        System.out.print("0");
        for(int i=0;i<h.length()-1;i++)
        {
            char ch=h.charAt(i);
            System.out.print(ch);
        }
        
    }
}
  
