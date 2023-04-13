import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solutions130 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            int a=(int)ch;
            if(a%2==0)
            {
                count+=a*2;
            }
            if(a%2==1)
            {
                count+=a;
            }
        }
        System.out.println(count);
    }
}
