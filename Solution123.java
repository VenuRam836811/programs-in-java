import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution123 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        if(a==b)
        {
            System.out.println(c);
        }
        else if(a==c)
        {
            System.out.println(b);
        }
        else if(b==c)
        {
            System.out.println(a);
        }

       
    }
}
