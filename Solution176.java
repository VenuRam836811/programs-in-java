import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution176 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        if(year % 4 == 0 && year % 100!= 0 || year%400 == 0)
System.out.print("29"+" ");
        else
        System.out.print("28"+" ");
        if(year%400==0)
        System.out.print("L");
        if(year%400!=0 && year%100==0)
        System.out.print("H");
        if(year%100!=0 && year%4==0)
        System.out.print("F");
        if(year%4!=0)
        System.out.print("N");
    }
}
