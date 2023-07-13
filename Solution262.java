/// PROBLEM ///

Given N ASCII art lines of individual size, depicting two fish racing towards each other, you must output the number of chum each fish manages to eat before meeting the other.

Each line consists of two fish (><> and <><), always at the edges of the line and separated by a random amount of water (~) or chum (o).

Both fish will travel at the same speed towards each other, consuming any chum in their way. The distance between the fish is even, so it is impossible for both fish to eat the same chum in the middle.
Input
Line 1: Number N of fish lines.
Next N lines: The fish lines, each expecting an output in the same order.
Output
N lines, consisting of two integers: A B, where A is the chum eaten by the left fish, and B is the chum eaten by the right fish, in the same order as given in input.
Constraints
1≤ N ≤ 30
2≤size≤100
size is even
Example
Input
1
><>~o~~<><
Output
1 0


  /// CODE FOR THE PROBLEM ///


  import java.util.*;
import java.io.*;
import java.math.*;

class Solution262 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        int z=0,y=0;
        for (int i = 0; i < N; i++) {
            String f = in.nextLine();
            int a=f.length();
            int b=a/2;
            z=0;
            for(int j=3;j<b;j++)
            {
                char c=f.charAt(j);
                if(c=='o')
                {
                    z++;
                }
            }
            y=0;
            for(int k=b;k<f.length()-3;k++)
            {
                char ch=f.charAt(k);
                if(ch=='o')
                {
                    y++;
                }
            }
            System.out.println(z+" "+y);
        }

    }
}
