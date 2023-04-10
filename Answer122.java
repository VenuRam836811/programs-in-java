import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Answer122 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n>0)
        {
            System.out.print(n-1);
            for(int i=n-2;i>=0;i--)
            {
                System.out.print(" "+i);
            }
        }
            else if(n<0)
            {
                int a=Math.abs(n);
                System.out.print("-"+a);
                for(int i=a-1;i>0;i--)
            {
                System.out.print(" "+"-"+i);
            }
            System.out.print(" 0");
            }
            else
            {
                 System.out.print("Already Zero");
            }
            
        }
}
