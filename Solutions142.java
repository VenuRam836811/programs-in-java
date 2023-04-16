import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solutions142 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        if(m>0)
        {
        for(int i=1;i<=m;i++)
        {
            if(i%2==1)
            {
                System.out.print(i);
                if(i<m-1)
                {
                   System.out.print(" ");
                }
            }
        }
        }
        else
        {
            System.out.println("0");
        }

    }
}
