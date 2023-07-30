/// PROBLEM //
Determine if 2 ranges overlap.
(The begin and end are inclusive in the range)
Input
2 Lines: Two space separated integers begin and end for the beginning and end of the segment, respectively
Output
Line 1 : "Overlap" if 2 segments intersect, otherwise "Not overlap"
Constraints
Example
Input
1 7
8 9
Output
Not overlap

  /// CODE FOR THE PROBLEM ///

  import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution295 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        if(c>=a && c<=b)
        System.out.print("Overlap");
        else
        System.out.print("Not overlap");  
    }
}
