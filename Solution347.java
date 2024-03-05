/// PROBLEM 


A man, alone, have n apples and needs to survive d days. Each apples can keep him alive for h hours. You need to know how much time the man can survive and if he has enough apples to survive.
Input
Line 1 An integer n for the number of apples he has.
Line 2 An integer d for the amount of days he needs to survive.
Line 3 An integer h for the amount of hours each apples can keep him alive.
Output
If he can survive and still have apples, it will return It is enough .
If it is the perfect amount of apple, it will return Just enough .
And if it is not enough it will return Not enough.
Constraints
Example
Input
36
12
3
Output
Not enough



  /// CODE FOR THE PROBLEM 


import java.util.*;
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int h = in.nextInt();
        int a=(n*h)/24;
        if(a<d)
        System.out.println("Not enough");
        else if(a==d)
        System.out.println("Just enough");
        else
        System.out.println("It is enough");


    }
}
