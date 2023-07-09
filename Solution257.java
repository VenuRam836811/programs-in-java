//// PROBLEM ///


The world championship of rock paper scissors uses the best of three of three format (best of three games = one set, best of three sets = match).

Given a sequence S of game results (1 = player 1 won, 2 = player 2 won, 0 = draw), determine who won the match.


Example:
Given the sequence 2 2 1 0 0 2 2, we get these sets:
Set 1: 2 2 => Player #2 won
Set 2: 1 0 0 2 2 => Player #2 won
Result: Player #2 won two sets and therefore won the match!

Note: A set cannot end in a draw. A set ends whenever a player has won two games.
Input
Line 1: An integer N for the number of games played
Line 2: A sequence S of game results
Output
The player who won the match (either 1 or 2)
Constraints
4 ≤ N ≤ 20
Example
Input
7
2 2 1 0 0 2 2
Output
2

  ///   CODE FOR THE PROBLEM ////

  import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution257{

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(),a=0,b=0,z=0;
        for (int i = 0; i < N; i++) {
            int s = in.nextInt();
            z=s;
            if(s==2)
            {
                a++;
            }
            if(s==1)
            {
                b++;
            }
        }
        if(a>b)
        System.out.print("2");
        else if(a<b)
        System.out.println("1");
        else
        System.out.print(z);
    }
}
