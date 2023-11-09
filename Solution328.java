/// PROBLEM ///


You are given a grid representing a minefield. Your task is to count all the mines in the grid and output the total number. The grid is represented as a 2D array, where M represents a mine and . represents an empty space.
Input
Line 1: Two space-separated integers N and M representing the dimensions of the grid.
Next N lines: A string of length M representing a row of the grid, where M is a mine and . is an empty space.
Output
Line 1: An integer K representing the total number of mines.
Constraints
1 < N,M < 100
The grid will contain only the characters M and .
Example
Input
3 3
.M.
...
M.M
Output
3



  /// CODE FOR THE PROBLEM ///


  import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        int sum=0;
        for (int i = 0; i < n; i++) {
            String row = in.nextLine();
           for(int j=0;j<row.length();j++)
           {
            char ch=row.charAt(j);
            if(ch=='M')
            {
                sum++;
            }
           }
        }
        System.out.print(sum);

    }
}
