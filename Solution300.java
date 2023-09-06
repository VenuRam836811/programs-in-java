/// PROBLEM ///

There was once a king in India who was a big chess enthusiast and had the habit of challenging wise visitors to a game of chess. One day a traveler was challenged by the king. The traveler used to play this game all his life and had a lot of experience. To convince his opponent, the king offered the traveler anything he could name. The traveler modestly asked just for a few grains of rice in the following manner: The king was to put a single grain of rice on the first chess square and double it on every consequent one. The king agreed to the deal and did not think about what he just did.

Having lost the game and being a man of his word the king ordered a bag of rice to be brought to the chessboard. He started placing rice grains according to the deal: 1 grain on the first square, 2 on the second, 4 on the third, 8 on the fourth, and so on until he realized what huge amount of rice it will him cost.

You're given a number N, which says how many grains of rice you want. Print out the minimum number of squares, F, starting with the first square, that would be needed to get N rice grains.

Information: The input value, N, won't exceed 64 bits.
Input
Line 1: An integer N containing a number of rice grains.
Output
Line 1 : An integer F which contains the minimum number of squares required for getting the number of N rice grains, starting with the first square.
Constraints
0 < N < 2^64-1
0 < F ≤ 64 (Size of a chessboard)
Example
Input
7
Output
3


  /// CODE FOR THE PROBLEM ///

  import java.util.*;
import java.io.*;
import java.math.*;

class Solution300 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        long N = in.nextLong();
        long a=1;
        long b=0;
        while(a<=N)
        {
            a=a*2;
            b++;
        }
        System.out.println(b);
    }
}
