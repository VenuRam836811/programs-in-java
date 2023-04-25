import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution186 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int b=0;
        int a[]=new int[s.length()];
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
             a[i]=(int)ch;
            
        }
        Arrays.sort(a);
        for(int i=0;i<s.length();i++)
        {
            System.out.printf("%c",a[i]);
        }
    }
}
