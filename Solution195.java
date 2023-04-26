import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution195 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lenS = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        int a=0;
        String s = in.nextLine();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
             a+=(int)ch;

        }
        System.out.printf("%c",a/lenS);
    }
}
