import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution84 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int count=0,count1=0;
        for(int i=0;i<s.length();i++)
        {
            char ch= s.charAt(i);
            if(Character.isUpperCase(ch))
            {
                count+=1;
            }
            if(Character.isLowerCase(ch))
            {
                count1+=1;
            }
        }
        System.out.println(Math.abs(count-count1));
    }
}
