/// PROBLEM ///

Alice and Bob are playing a bastketball game. Each ball scored earns 2 points, but if it is scored from strictly more than 6.75 units away, it earns 3 points. Help them to find out who won the game!
The basket is located at coordinate (0,0).
Input
Line 1 : An integer N for the number of coordinates to consider.
N next lines : A player player (A for Alice and B for Bob) followed by two float x and y for the coordinates of where he/she scored a basket separated by a space.
Output
The winner of the match, or DRAW
Constraints
0 ≤ N ≤ 10
0 ≤ x ≤ 100
-100 ≤ y ≤ 100
Example
Input
1
A 1 1
Output
ALICE

  /// CODE FOR THE PROBLEM ///

  import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution291 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int sum1=0,sum2=0;
        for (int i = 0; i < N; i++) {
            String player = in.next();
            float X = in.nextFloat();
            float Y = in.nextFloat();
            if(X>0 && Y>0)
            {
            if(player.equals("A"))
            {
                sum1+=X+Y;
            }
            if(player.equals("B"))
            {
                sum2+=X+Y;
            }
            }
        }
        if(sum1==0&&sum2==0 || sum1==sum2)
        System.out.print("DRAW");
        else if(sum1>sum2)
        System.out.print("ALICE");
        else
        System.out.print("BOB");

        
    }
}
