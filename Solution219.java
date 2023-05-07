import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution219 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            int a=(int)ch-96;
            if(a%2==0 &&ch!=' ')
            System.out.print("N");
            if(a%3==0 && a%2!=0&& ch!=' ')
            System.out.print("O");
            if(a%5==0 && a%2!=0 && a%3!=0&& ch!=' ')
            System.out.print("S");
            if(a%2!=0 && a%3!=0 && a%5!=0 &&ch!=' ')
            System.out.print("E");
            if(ch==' ')
            System.out.print(ch);
        }

        
    }
}
