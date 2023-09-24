/// PROBLEM ///


Story:
You were out partying with your friends and as the designated driver you decided to stay sober. Unfortunately the cop that pulled you over would disagree with you. For some reason the only way that the cop can prove your sobriety is by completing a maths challenge.
The Challenge
Output the absolute difference between two powers A^B and X^Y, rounded to the closest integer.
Input
Line 1 Two positive floats A and X.
Line 2 Two positive integers B and Y that will be exponents
Output
Line 1 The absolute difference between A^B and X^Y rounded to the closest integer
Constraints
A,X no more than 2 decimal places
Example
Input
4 2
3 5
Output
32


  /// CODE FOR THE PROBLEM ///


import java.util.*;
class Solution{
public static void main(String args[]){
Scanner i=new Scanner(System.in);
float A=i.nextFloat();
float X=i.nextFloat();
int B=i.nextInt();
int Y=i.nextInt();
System.out.print(Math.abs(Math.round(Math.pow(A,B)-Math.pow(X,Y))));
    }
}
