/// PROBLEM ///

The game mode is REVERSE: You do not have access to the statement. You have to guess what to do by observing the following set of tests:
01 Test 1
Input
Expected output
5 6
#####
#S#E#
#_#_#
#_#_#
#___#
#####
# # # # #
 # S # E #
# _ # _ #
 # _ # _ #
# _ _ _ #
 # # # # #
02 Test 2
Input
Expected output
8 8
#E_____#
##_###_#
##_____#
#_#_####
##_____#
####_#_#
#S_____#
########
# E _ _ _ _ _ #
 # # _ # # # _ #
# # _ _ _ _ _ #
 # _ # _ # # # #
# # _ _ _ _ _ #
 # # # # _ # _ #
# S _ _ _ _ _ #
 # # # # # # # #
03 Test 3
Input
Expected output
15 12
_##_#####_###_#
#__######_##_#_
##S#_____#_#_#_
###_####__#_#_#
###_#####_#___#
#__#####_#_#_##
#_######_#_#_##
________#_#__##
_###_####_#_#_#
#___#####__#_#_
######E__###_#_
___#####_####_#
_ # # _ # # # # # _ # # # _ #
 # _ _ # # # # # # _ # # _ # _
# # S # _ _ _ _ _ # _ # _ # _
 # # # _ # # # # _ _ # _ # _ #
# # # _ # # # # # _ # _ _ _ #
 # _ _ # # # # # _ # _ # _ # #
# _ # # # # # # _ # _ # _ # #
 _ _ _ _ _ _ _ _ # _ # _ _ # #
_ # # # _ # # # # _ # _ # _ #
 # _ _ _ # # # # # _ _ # _ # _
# # # # # # E _ _ # # # _ # _
 _ _ _ # # # # # _ # # # # _ #
04 Test 4
Input
Expected output
21 21
#####################
#####_#________######
#####_#_#######_#####
####_#_#______#_#####
####_#_#_#####_#_####
###_#_#_#____#_#_####
###_#_##__###_#_#_###
##_#_#_##___#_#_#_###
##_#_#_#__##_#_#_#_##
#_#_#_#_##_#_#_#_#_##
#S#_#_#_#_E__##_#_#_#
#_#_#_#_#__#_#_#_#_##
##_#_#_#_###_#_#_#_##
##_#_#_#____#_#_#_###
###_#_#_#######_#_###
###_#_#_______#__####
####___#######_#_####
####_#________#_#####
#####_#####_###_#####
#####___#______######
#####################
# # # # # # # # # # # # # # # # # # # # #
 # # # # # _ # _ _ _ _ _ _ _ _ # # # # # #
# # # # # _ # _ # # # # # # # _ # # # # #
 # # # # _ # _ # _ _ _ _ _ _ # _ # # # # #
# # # # _ # _ # _ # # # # # _ # _ # # # #
 # # # _ # _ # _ # _ _ _ _ # _ # _ # # # #
# # # _ # _ # # _ _ # # # _ # _ # _ # # #
 # # _ # _ # _ # # _ _ _ # _ # _ # _ # # #
# # _ # _ # _ # _ _ # # _ # _ # _ # _ # #
 # _ # _ # _ # _ # # _ # _ # _ # _ # _ # #
# S # _ # _ # _ # _ E _ _ # # _ # _ # _ #
 # _ # _ # _ # _ # _ _ # _ # _ # _ # _ # #
# # _ # _ # _ # _ # # # _ # _ # _ # _ # #
 # # _ # _ # _ # _ _ _ _ # _ # _ # _ # # #
# # # _ # _ # _ # # # # # # # _ # _ # # #
 # # # _ # _ # _ _ _ _ _ _ _ # _ _ # # # #
# # # # _ _ _ # # # # # # # _ # _ # # # #
 # # # # _ # _ _ _ _ _ _ _ _ # _ # # # # #
# # # # # _ # # # # # _ # # # _ # # # # #
 # # # # # _ _ _ # _ _ _ _ _ _ # # # # # #
# # # # # # # # # # # # # # # # # # # # #

  /// CODE FOR THE PROBLEM ///

  import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution289 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int W = in.nextInt();
        int H = in.nextInt();
        String row[]=new String[H];
        if (in.hasNextLine()) {
            in.nextLine();
        }
        for (int i = 0; i < H; i++) {
            row[i] = in.nextLine();
        }
       for(int i=0;i<H;i++)
       {
        String a=row[i];
        if(i%2==1)
        {
            for(int j=0;j<a.length();j++)
            {
                char ch=a.charAt(j);
                System.out.print(" "+ch);
            }
            System.out.println();
        }
        else
        {
            for(int j=0;j<a.length();j++)
            {
                char ch=a.charAt(j);
                System.out.print(ch);
                if(j<a.length()-1)
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
       }
        
    }
}
