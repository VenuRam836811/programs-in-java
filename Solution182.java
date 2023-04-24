import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution182 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int ad = in.nextInt();
        int ac = in.nextInt();
        int bd = in.nextInt();
        int bc = in.nextInt();
        int re = in.nextInt();
        for(int i=0;i<re;i++)
        {
            for(int j=0;j<ac;j++)
            {
                if(ad+i<=9)
                System.out.print(ad+i);
                else
                System.out.print("0");
            }
            for(int k=0;k<bc;k++)
            {
                if(bd+i<=9)
                System.out.print(bd+i);
                else
                System.out.print("0");
            }
        }
    }
}
