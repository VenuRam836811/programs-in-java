import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution159 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int a=0,b=0,c=1;
        String z="";
        for (int i = 0; i < N; i++) {
            String line = in.next();
            b=line.length();
            for(int j=0;j<line.length();j++)
            {

                char ch=line.charAt(a);
                char ch1=line.charAt(b-c);
                z=z+ch1;
                System.out.print(ch);
                a=a+1;
                c=c+1;
                break;

            }
        }
        System.out.print(" "+z);

        
        
    }
}
