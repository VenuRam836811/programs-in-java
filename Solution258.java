/// PROBLEM ////

The among us imposter is trying to go to the mall for some among us plushies but needs to know if he will make it or not.
Input
Line 1: An integer f the starting fuel in liters
Line 2: An integer d the distance to travel in meters
Line 3: An integer r the rate at which fuel is burned liters per meters
Output
Line 1: An integer a for either the remaining fuel or not enough fuel
Constraints
Example
Input
50
25
1
Output
25

  /// CODE FOR THE PROBLEM ///

  import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution258 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int f = in.nextInt();
        int d = in.nextInt();
        int r = in.nextInt();
        int c=d*r;
        if(f>=c)
        System.out.print(f-c);
        else
        System.out.println("not enough fuel");
    }
}
