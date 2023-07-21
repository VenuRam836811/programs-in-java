/// PROBLEM ///

You must output the correct string concatenation depending on the sum result.
If it's positive, output "Foo"
If it's negative, output "Bar"
If it's even, concatenate " & Baz" to the output
If it's odd, concatenate " & Qux" to the output
Input
Line 1 : An integer N for the number of integers to sum.
Next N lines: A positive or negative integer K
Output
Line 1 : A string containing the correct two words.
Constraints
-100<=K<=100
Example
Input
1
6
Output
Foo & Baz

  /// CODE FOR THE PROBLEM ///

  import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution281 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int sum=0;
        for (int i = 0; i < N; i++) {
            int K = in.nextInt();
            sum+=K;
        }
        if(sum>0 && sum%2==0)
            System.out.print("Foo & Baz");
        else if(sum<0 && Math.abs(sum)%2==0)
            System.out.print("Bar & Baz");
        else if(sum>0 && sum%2==1)
            System.out.print("Foo & Qux");
        else if(sum<0 && Math.abs(sum)%2==1)
            System.out.print("Bar & Qux");






    }
}
