import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution214 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String s= in.nextLine();
        int a=s.length();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(i%2==0)
            System.out.print(ch);
        
        }
        for(int i=a-1;i>=0;i--)
        {
            char ch1=s.charAt(i);
            if(i%2==1)
            System.out.print(ch1);
        
        }

    }
}
