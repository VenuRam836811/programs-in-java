import java.util.*;
import java.io.*;
import java.math.*;


class Solution109 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            int a=(int)ch;
            if(Character.isUpperCase(ch))
            {
              sum+=a-64;
            }
            else if(Character.isLowerCase(ch))
            {
                sum+=a-96;
            }
        }

        
        System.out.println(sum);
    }
}
