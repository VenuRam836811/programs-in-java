import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution221 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String t = in.nextLine();
        String match = in.nextLine();
        int a=t.indexOf(match);
       String b=t.substring(0,a);
       String c=t.substring(a+match.length());
       System.out.println(b);
       System.out.println(match);
       System.out.println(c);


        
    }
}
