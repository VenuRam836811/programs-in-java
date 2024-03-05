/// PROBLEM  


You are given a string of digits. For each digit (starting with the leftmost one), calculate that digit raised to the power of its index and cumulative sum so far. Output all the cumulative sums, one sum per line.
Input
Line 1 : A string of digits str .
Output
Several lines : Cumulative sums as described in Goal section, one sum per line (digit).
Constraints
Example
Input
123
Output
1
3
12



  /// CODE FOR THE PROBLEM 


import java.util.*;
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int sum=0;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            int a=Integer.parseInt(ch+"");
            sum+=Math.pow(a,i);
            System.out.println(sum);
        }
        
    }
}
