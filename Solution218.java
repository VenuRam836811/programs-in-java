import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution218 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(Character.isUpperCase(ch))
            {
                int a=(int)ch-64;
                System.out.print(a);
            }
            else if(Character.isLowerCase(ch))
            {
                int b=(int)ch-96;
                System.out.print(b);
            }
            else
            System.out.print(ch);
        }

        
    }
}
