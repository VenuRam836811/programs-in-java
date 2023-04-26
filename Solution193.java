import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution193 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            
            if(Character.isLetter(ch))
            {
                int a=(int)ch;
            String b=Integer.toBinaryString(a);
            System.out.print(b);
            }
            else if(Character.isDigit(ch))
            {
                int d=(int)ch-48;
                 String c=Integer.toBinaryString(d); 
                 System.out.print(c);
            }
        }

    }
}
