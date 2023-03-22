import java.util.*;
import java.io.*;
import java.math.*;

class Main111 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        if(year%400==0)
        {
             System.out.println("29 L");
        }
        if(year%400!=0 && year%100==0)
        {
             System.out.println("28 H");
        }
        if(year%100!=0 && year%4==0)
        {
             System.out.println("29 F");
        }
        if(year%4!=0)
        {
             System.out.println("28 N");
        }

        
    }
}
