/// PROBLEM ////

You must return a list of elements joined by spaces.
Each number in this list will be the square of the given entry.
But there is an exception to this : if the square is a multiple of 3, the value should be replaced by the text threeIsGood
Input
Line 1: An integer N which is the number of integers to be squared
N next lines: The integers s to be squared
Output
Line 1: A list of numbers or threeIsGood
Constraints
2 ≤ N ≤ 20
0 ≤ s ≤ 100
Example
Input
3
1
9
2
Output
1 threeIsGood 4


  /////CODE FOR THE PROBLEM ////

  import java.util.*;
class Solution248 {
public static void main(String args[]) {
Scanner in = new Scanner(System.in);
int N = in.nextInt();
for (int i = 0; i < N; i++) {
int s = in.nextInt(); 
if(s%3==0)
System.out.print("threeIsGood");
if(s%3!=0)
System.out.print(s*s);
if(i<N-1)
 System.out.print(" ");
 }}}
