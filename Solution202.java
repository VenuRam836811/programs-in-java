import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution202 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int w = in.nextInt();
        int h = in.nextInt();
        String white = in.next();
        String black = in.next();
        for(int i=0;i<h;i++)
        {
            for(int j=0;j<w;j++)
            {
                if(i%2==0)
                {
                    if(j%2==0)
                    System.out.print(white);
                    else
                    System.out.print(black);
                }
                else
                {
                    if(j%2==0)
                    System.out.print(black);
                    else
                    System.out.print(white);
                }
            }
            System.out.println();
        }

        
    }
}
