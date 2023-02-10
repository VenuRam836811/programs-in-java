import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution5 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String S = in.nextLine();
        int b=0;
        for(int i=0;i<S.length();i++)
        {
        char ch=S.charAt(i);
        int a=(int)ch;
         b=b+a;
        }

        

        System.out.println(b);
    }
}
