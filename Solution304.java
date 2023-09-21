/// PROBLEM ///

we need to find number of chickens and rabbits
in this we are given numbers heads and numbers of legs
note:for each chicken there is 2 legs and each rabbits has 4 legs
input:
  30 90
output:
  15 15


  /// CODE FOR THE PROBLEM ///


import java.util.*;
public class Solution304
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=(b-2*a)/2;
        System.out.println((a-c)+" "+c);
    }
}
