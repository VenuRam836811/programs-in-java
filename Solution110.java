import java.util.*;
import java.io.*;
import java.math.*;

class Solution110 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String w = in.next();
        String decor = in.next();
        int outer = in.nextInt();
        int a=2+outer*2+w.length();
        for(int i=0;i<outer;i++)
        {
            for(int j=0;j<a;j++)
            {
           System.out.print(decor);
            }
            System.out.println();
        }
        for(int i=0;i<outer;i++)
        {
            System.out.print(decor);
        }

        System.out.print(" "+w+" ");
        for(int i=0;i<outer;i++)
        {
            System.out.print(decor);
        }
        System.out.println();
        for(int i=0;i<outer;i++)
        {
            for(int j=0;j<a;j++)
            {
           System.out.print(decor);
            }
            System.out.println();
        }

        
    }
}
