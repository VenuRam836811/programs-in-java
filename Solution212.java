import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution212 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String ip = in.nextLine();
        int c=0;
        for(int i=0;i<ip.length();i++)
        {
            char ch1=ip.charAt(i);
            if(Character.isLetter(ch1))
            c++;
        }
        if(c>0)
        {
        System.out.print("print(");
        for(int i=0;i<ip.length();i++)
        {
            char ch=ip.charAt(i);
            if(Character.isLetter(ch) || ch=='>' || ch=='=' || ch==' ')
            {
                System.out.print(ch);
            }
        }
        System.out.print(")");
        }
        else
        System.out.print("None");

       
    }
}
