/// PROBLEM ///


The game mode is REVERSE: You do not have access to the statement. You have to guess what to do by observing the following set of tests:
01 Test 1
Input
Expected output
10
rgy
-r-g-y-r-g-y-r-g-y-r-
02 Test 2
Input
Expected output
5
b
-b-b-b-b-b-
03 Test 3
Input
Expected output
15
rgyb
-r-g-y-b-r-g-y-b-r-g-y-b-r-g-y-
04 Test 4
Input
Expected output
18
rg
-r-g-r-g-r-g-r-g-r-g-r-g-r-g-r-g-r-g-
05 Test 5
Input
Expected output
105
ygrb
-y-g-r-b-y-g-r-b-y-g-r-b-y-g-r-b-y-g-r-b-y-g-r-b-y-g-r-b-y-g-r-b-y-g-r-b-y-g-r-b-y-g-r-b-y-g-r-b-y-g-r-b-y-g-r-b-y-g-r-b-y-g-r-b-y-g-r-b-y-g-r-b-y-g-r-b-y-g-r-b-y-g-r-b-y-g-r-b-y-g-r-b-y-g-r-b-y-g-r-b-y-g-r-b-y-
06 Test 6
Input
Expected output
25
rgrbry
-r-g-r-b-r-y-r-g-r-b-r-y-r-g-r-b-r-y-r-g-r-b-r-y-r-


  // CODE FOR THE PROBLEM ////



  import java.util.*;
import java.io.*;
import java.math.*;
class Solution {
 public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        String c = in.nextLine();
        int a=c.length();
        int b=n%a;
        System.out.print("-");
        for(int i=0;i<n/a;i++)
        {
            for(int j=0;j<a;j++)
            {
                char ch=c.charAt(j);
                System.out.print(ch+"-");
            }
        }
        for(int i=0;i<b;i++)
        {
            char d=c.charAt(i);
            System.out.print(d+"-");
        }
    }
}
