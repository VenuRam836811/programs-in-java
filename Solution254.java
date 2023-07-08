//// PROBLEM ///

In a Jewish calendar, there are 12 months in a REGULAR year, and 13 months in a LEAP year.
In each year, there are 5 months with 29 days, 5 months with 30 days, and 2 months that the days in them is changed:
- if the year is MISSING - the 2 months have 29 days
- if the year is SERIAL - one month has 29 days and the second has 30 days
- if the year is FULL - the 2 months have 30 days
The added month in a leap year has 29 days.

Giving the type of the year, output the number of days in this year
Input
Line 1: REGULAR or LEAP
Line 2: MISSING, SERIAL or FULL
Output
Line 1: The number of days in the year
Constraints
Example
Input
REGULAR
MISSING
Output
353


  /// CODE FOR THE PROBLEM ///

  import java.util.*;
import java.io.*;
import java.math.*;

class Solution254 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String is = in.nextLine();
        String ye = in.nextLine();
        int a=0;
        if(is.equals("REGULAR"))
        {
            if(ye.equals("MISSING"))
            {
                a=295+29*2;
            }
            if(ye.equals("SERIAL"))
            {
                a=295+29+30;
            }
            if(ye.equals("FULL"))
            {
                a=295+30*2;
            }
            
        }
        if(is.equals("LEAP"))
        {
            if(ye.equals("MISSING"))
            {
                a=295+29*2+29;
            }
            if(ye.equals("SERIAL"))
            {
                a=295+29+30+29;
            }
            if(ye.equals("FULL"))
            {
                a=295+30*2+29;
            }
            
        }
        System.out.println(a);
    }
}
