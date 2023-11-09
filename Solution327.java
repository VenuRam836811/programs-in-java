/// PROBLEM ///


You must output the number of open TCP ports given the results of a port scan.

You are given a string representing the results of a port scan of one or more ports. Each port's result consists of the PortNumber, the status of open (O) or closed (C), and the protocol TCP (T) or UDP (U). For example, 22OT means that TCP port 22 is open.

Each port's result is separated by a comma within the string. For example, 22OT,67CU,80CT.
Input
Line 1: A string, scan, representing the port scan result of one or more ports.
Output
An integer representing the number of open TCP ports.
Constraints
scan contains at least one port scan result.
PortNumber is in the range of 1 to 65535 inclusive.
Example
Input
67OU,80OT,443CT
Output
1


  /// CODE FOR THE PROBLEM ///


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
        String scan = in.nextLine();
        int d=0;
        char c=0,c1=0;
        String a[]=scan.split(",");
        for(int i=0;i<a.length;i++)
        {
            String b=a[i];
             c=b.charAt(b.length()-2);
             c1=b.charAt(b.length()-1);
            if(c=='O' && c1=='T')
            {
                d+=1;
            }
        }
System.out.println(d);}}
