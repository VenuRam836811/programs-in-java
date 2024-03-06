/// PROBLEM 


Given two angles you must output if they are SUPPLEMENTARY (totaling 180), COMPLEMENTARY (totaling 90) or NEITHER.
Input
Line 1: A single integer n for the amount of number pairs
n lines: A space separated integer pair a1 and a2.
Output
n lines containing SUPPLEMENTARY, COMPLEMENTARY or NEITHER.
Constraints
180 > a1 > 0
180 > a2 > 0
Example
Input
2
90 90
45 45
Output
SUPPLEMENTARY
COMPLEMENTARY



  //// CODE FOR THE PROBLEM 


 import java.util.*;
class Solution349 {
public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int a= in.nextInt();
            int b= in.nextInt();
            switch(a+b)
            {
                case 180:
                System.out.println("SUPPLEMENTARY");
                break;
                case 90:
                System.out.println("COMPLEMENTARY");
                break;
                default:
                System.out.println("NEITHER");
            }
        }
        
    }
} 
