import java.util.*;
import java.io.*;
import java.math.*;

class Solution163 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int width = in.nextInt();
        int height = in.nextInt();
        String co = in.next();
        String ve = in.next();
        String ho= in.next();
        String com = in.next();
        for(int i=0;i<width;i++)
        {
            if(i==0 || i==width-1)
            {
                System.out.print(co);
            }
            else
            {
                System.out.print(ho);
            }
        }
        System.out.println();
        for(int i=0;i<height-2;i++)
        {
            for(int j=0;j<width;j++)
            {
                if(j==0 || j==width-1)
                {
                    System.out.print(ve);
                }
                else
                {
                    System.out.print(com);
                }
            }
            System.out.println();
        }
        for(int i=0;i<width;i++)
        {
            if(i==0 || i==width-1)
            {
                System.out.print(co);
            }
            else
            {
                System.out.print(ho);
            }
        }

        
    }
}
