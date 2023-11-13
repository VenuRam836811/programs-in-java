/// PROBLEM ///


The string S has 1000000 characters formed by sequentially arranging the letters from A to Z.
(After A is B, after B is C,..., after Y is Z, after Z is A, after A is B,...)
Locate the letter at the index position of the string S.
Note: The first index of the string S is 1
Input
An integer index
Output
Character in string S corresponding to index
Constraints
0 < index <= 1000000
Example
Input
27
Output
A



  /// CODE FOR THE PROBLEM  ///



import java.util.*;
import java.io.*;
import java.math.*;
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int index = in.nextInt();
        int a=index%26;
        int b=a+64;
        if(a!=0)
        System.out.printf("%c",b);
        else
        System.out.print("Z");
    }
}
