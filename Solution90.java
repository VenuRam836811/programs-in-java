import java.util.*;
import java.io.*;
import java.math.*;

class Solution90 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            char ch1=s.charAt(s.length()-1-i);
            System.out.print(ch);
            System.out.print(ch1);
        }

      
    }
}
