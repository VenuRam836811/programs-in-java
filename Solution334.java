/// PROBLEM ///


Given M minutes, you will have to convert from minutes to h and m (hour and minute format).
Example: 100 minutes --------> 1h 40m.
If M is less than 60 then hour is 0.
Example: 50 minutes --------> 0h 50m.
If there is no number of minutes after conversion then the minute is 0.
Example: 60 minutes --------> 1h 0m.
Input
An integer M for the number of minutes.
Output
A single line of h and m format.
Constraints
M is always positive.
Example
Input
100
Output
1h 40m


  /// CODE FOR THE PROBLEM ///


  import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution334 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int M = in.nextInt();
        int a=M%60;
        System.out.println(M/60+"h"+" "+a+"m");
    }
}
