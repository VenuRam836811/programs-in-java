/// PROBLEM ///

The game mode is REVERSE: You do not have access to the statement. You have to guess what to do by observing the following set of tests:
01 Test 1
Input
Expected output
..... .....
.#.#. .....
..... ..#..
.#.#. .....
..... .....
.....
.#.#.
..#..
.#.#.
.....
02 Test 2
Input
Expected output
..... .....
.#.#. ...#.
..... ..#..
.#.#. .#...
..... .....
.....
.#...
..#..
...#.
.....
03 Test 3
Input
Expected output
#...# ..#..
.#.#. ..#..
..#.. #####
.#.#. ..#..
#...# ..#..
#.#.#
.###.
##.##
.###.
#.#.#
04 Test 4
Input
Expected output
###.. ...##
.#..# ###..
####. ##..#
#..#. #####
#.#.# #.#.#
#####
#.#.#
..###
.##.#
.....
05 Test 5
Input
Expected output
.#... .####
.#.## ..#..
.#### #.###
.#.#. .#...
#...# #...#
..###
.####
##...
...#.
.....


  /// CODE FOR THE PROBLEM ///

  import java.util.*;
import java.io.*;
import java.math.*;

class Solution268 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            String r= in.nextLine();
            String[] str=r.split(" ");
            for( int j=0;j<r.length()/2;j++)
            {
                char c=str[0].charAt(j);
                char c1=str[1].charAt(j);
                if(c=='.' && c1=='.')
                {
                    System.out.print(".");
                }
                if(c=='.' && c1=='#')
                {
                    System.out.print("#");
                }
                if(c=='#' && c1=='.')
                {
                    System.out.print("#");
                }
                if(c=='#' && c1=='#')
                {
                    System.out.print(".");
                }
            }
            System.out.println();
        } 
    }
}
