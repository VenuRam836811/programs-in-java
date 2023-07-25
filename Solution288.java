/// PROBLEM ///

A student is taking a coding final exam. The exam has 16 questions. The student attempts questions one by one and does not proceed until the current question is passed. Each question passed gives 6 points, except the final 16th question which gives 10 points.

Calculate the score based on the attempts provided.
Input
Line 1: An integer N for the number of attempts the student made.
Next N lines: A word attempt either PASS or FAIL
Output
score based on the attempts provided.
Constraints
1 ≤ N ≤ 100
0 ≤ score ≤ 100
Example
Input
7
PASS
PASS
PASS
PASS
PASS
PASS
PASS
Output
42

  /// code for the problem ///

  import java.util.*;
import java.io.*;
import java.math.*;
class Solution288 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum=0,c=0;
        for (int i = 1; i <= n; i++) {
            String a= in.next();
            if(a.equals("PASS"))
            {
                c++;
            }
            if(a.equals("PASS")&&c<16)
            {
                sum+=6;
            }
             if(a.equals("PASS")&&c==16)
            {
                sum+=10;
            }

        }
        System.out.println(sum);
    }
}
