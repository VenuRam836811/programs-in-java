/// PROBLEM //

Crash bandicoot needs to cross a falling apart bridge, where only some tiles are still in place, the others are gone.
He will need to run over the tiles and jump over the holes in order to successfully finish the level.
Input
The structure of the bride is described by a string containing only "#" and spaces " " chars.
A tile is represented by a #, while a hole is represented by one space. The bridge always starts with a tile and ends with a tile, should be crossed from left to right.
Line 1: : l length of the bridge.
Line 2: : b A string containing the structure of the bridge using "#" and " "
Output
A single line containing the movements that have to be carried successively in order to cross the bridge.
w: walk from one tile to an adjacent tile.
j: jump over a hole.
Constraints
l>=2
Example
Input
5
## ##
Output
wjw


  //// CODE FOR THE PROBLEM ///

  import java.util.*;
import java.io.*;
import java.math.*;

class Solution290 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        String b = in.nextLine();
        for(int i=0;i<b.length();i++)
        {
            char ch=b.charAt(i);
            if(ch==' ')
            {
                System.out.print("j");
            }
            if(i<b.length())
            {
                char ch1=b.charAt(i+1);
                if(ch==ch1)
                {
                    System.out.print("w");
                }
            }
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println("movements");
    }
}
