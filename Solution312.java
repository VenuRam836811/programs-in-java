/// PROBLEM ///


Delta encoding is a way of compressing an array by indicating the difference between each piece of data and the previous one (rather than the value itself). The result is a fairly small array of data requiring less memory space. This method is efficient when the consecutive values are close together.
Program an algorithm which takes N integers between -200 and 200 contained in a string data and returns a string delta containing the integers separated by a space using this technique.
Input
Line 1 : N the number of values in data
Line 2 : A string data made up of integers separated by a space
Output
Return a string of integers delta separated by a space.
OR
If the given data doesn't contain any value, return None.
Constraints
0 <= N <= 144
Example
Input
4
10 5 5 -5
Output
10 -5 0 -10


  /// CODE FOR THE PROBLEM ////

import java.util.*;
import java.io.*;
import java.math.*;
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        String data = in.nextLine();
        String a[]=data.split(" ");
       if(N==0) 
        System.out.println("None");
        else if(N==1)
        System.out.print(data);
        else
        {
            for(int i=0;i<a.length;i++)
            {
                if(i==0)
                {
                    System.out.print(a[i]);
                }
                else
                {
                    int b=Integer.parseInt(a[i]);
                    int d=Integer.parseInt(a[i-1]);
                    int e=b-d;
                    System.out.print(" "+e);
                }
            }
        }
    }
}
