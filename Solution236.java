///// PROBLEM /////



The game mode is REVERSE: You do not have access to the statement. You have to guess what to do by observing the following set of tests:
01 Test 1
Input
Expected output
3
5
#####
#   #
# # #
02 Test 2
Input
Expected output
10
11
###########
#         #
#         #
#         #
#         #
#         #
#         #
#         #
#         #
#    #    #
03 Test 3
Input
Expected output
20
21
#####################
#                   #
#                   #
#                   #
#                   #
#                   #
#                   #
#                   #
#                   #
#                   #
#                   #
#                   #
#                   #
#                   #
#                   #
#                   #
#                   #
#                   #
#                   #
#         #         #
04 Test 4
Input
Expected output
30
31
###############################
#                             #
#                             #
#                             #
#                             #
#                             #
#                             #
#                             #
#                             #
#                             #
#                             #
#                             #
#                             #
#                             #
#                             #
#                             #
#                             #
#                             #
#                             #
#                             #
#                             #
#                             #
#                             #
#                             #
#                             #
#                             #
#                             #
#                             #
#                             #
#              #              #



//// CODE FOR THE PROBLEM /////



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
        int H = in.nextInt();
        int W = in.nextInt();
        for(int i=0;i<=0;i++)
        {
            for(int j=0;j<W;j++)
            {
                System.out.print("#");
            }
           
        }
         System.out.println();
        for(int i=0;i<H-2;i++)
        {
            for(int j=0;j<W;j++)
            {
                if(j==0 || j==W-1)
                {
                    System.out.print("#");
                }
                else
                {
                    System.out.print(" ");
                }
               
            }
             System.out.println();
            
        }
        int c=W/2;
        for(int i=0;i<1;i++)
        {
            for(int j=0;j<W;j++)
            {
                if(j==0 || j==W-1 || j==c)
                {
                    System.out.print("#");
                }
                else
                {
                    System.out.print(" ");
                }
                
            }
             System.out.println();
            
        }

    }
}
