/// PROBLEM ///


Given mode, one of AND, OR or XOR, determine if a bitwise operation of mode on bin1 and bin2 results in result.
Input
Line 1: mode, one of AND, OR, or XOR
Line 2: bin1
Line 3: bin2
Line 4: result
Output
One line: true or false; whether or not result is the correct result of a bitwise operation of mode on bin1 and bin2. bin1 and bin2 can contain leading zeroes.
Constraints
bin1 and bin2 will never have different lengths.
1 <= length of bin1 and bin2 <= 10
Example
Input
AND
1
0
1
Output
false


  /// CODE FOR THE PROBLEM ///


import java.util.*;
import java.io.*;
import java.math.*;
class Solution {
 public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String mode = in.nextLine();
        String bin1 = in.nextLine();
        String bin2 = in.nextLine();
        String result = in.nextLine();
        int a=Integer.parseInt(bin1,2);
        int b=Integer.parseInt(bin2,2);
        if(mode.equals("AND"))
        {
            int c=a*b;
            String bin3=Integer.toBinaryString(c);
            if(bin3.equals(result))
            System.out.print("true");
            else
            System.out.print("false");
        }
        else if(mode.equals("OR"))
        {
            int c=a+b;
            String bin3=Integer.toBinaryString(c);
            if(bin3.equals(result))
            System.out.print("true");
            else
            System.out.print("false");
        }
        else if(mode.equals("XOR"))
        {
            int c=a-b;
            String bin3=Integer.toBinaryString(c);
            if(bin3.equals(result))
            System.out.print("true");
            else
            System.out.print("false");
        }
    }
}
