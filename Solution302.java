/// PROBLEM ///

Input is a mountain of uppercase letters.
Output that same mountain.
Then put a line of water (which is shown as ~) underneath it. This is the same width as mountain's base)
Followed by the mountain's reflection in the water.
(Reflection is dimmer than the mountain itself, so change uppercase letters to their lowercase equivalent in the reflection)
Input
Line 1: An integer, height of mountain
Next height Lines: mountain
Output
height Lines: mountain
Next Line: water
Next height Lines: the reflection
Constraints
Example
Input
2
 QQQ
RRRRRR
Output
 QQQ
RRRRRR
~~~~~~
rrrrrr
 qqq

  /// CODE FOR THE PROBLEM ///

  import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution302 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int height = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        String a[]=new String[height];
        for (int i = 0; i < height; i++) {
             a[i]= in.nextLine();
        }

    for(int i=0;i<height;i++)
    {
        System.out.println(a[i]);
    }
    int b=a[height-1].length();
    for(int i=0;i<b;i++)
    {
        System.out.print("~");
    }
    System.out.println();
    for(int i=height-1;i>=0;i--)
    {
        System.out.println(a[i].toLowerCase());
    }
    }
}
