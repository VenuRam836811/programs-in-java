/// PROBLEM ///


You program must output the smallest prime factor of N.
If N equals 0 or 1 you program must output NONE

Example :
15 = 3 * 5 , 3 and 5 are both prime and 3 is the smallest so the result is 3.

INPUT:
Line 1: An integer N

OUTPUT:
Line 1 : The smallest prime factor of N

CONSTRAINTS:
0 ≤ N ≤ 2000000

EXAMPLE:
Input
15
Output
3


  /// CODE FOR THE PROBLEM ///


import java.util.*;
import java.io.*;
import java.math.*;
class Solution {
public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int prime=0;
        int v[]=new int[N/2];
        int b=0;
       for(int i=2;i<=N;i++)
       {
        if(N%i==0)
        {
            int c=0;
            for(int j=2;j<=i;j++)
            {
               if(i%j==0)
               {
                c+=1;
               }
            }
            if(c==1)
            {
              v[b]=i;
              b+=1;
            }
            c=0;
        }
       }
       int k=0;
       String str="";
       Arrays.sort(v);
       for(int i=0;i<v.length;i++)
       {
        if(v[i]!=0)
        {
            str+=v[i];
            str+=" ";
            k++;
        }
       }
        if(k>0)
        {
            String u[]=str.split(" ");
            System.out.print(u[0]);
        }
        else
        {
            System.out.print("NONE");
        } 
    }
}
