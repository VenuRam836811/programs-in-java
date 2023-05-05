import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution205 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int width = in.nextInt();
        int height = in.nextInt();
        if(height>1)
        {
        for(int i=0;i<width;i++)
        {
            System.out.print("*");
        }
        System.out.println();
        for(int i=0;i<height-2;i++)
        {
            for(int j=0;j<width;j++)
            {
                if(j==0 || j==width-1)
                System.out.print("*");
                else
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=0;i<width;i++)
        {
            System.out.print("*");
        }
        }
        if(height==1)
        {
             for(int i=0;i<width;i++)
        {
            System.out.print("*");
        }
        }
    }
}
