import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution141 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for(int i=1;i<=N;i++)
        {
            if(i%5==0 && i%7!=0)
            {
                System.out.println("Foo");
            }
            else if(i%7==0 && i%5!=0)
            {
                 System.out.println("Bar");
            }
            else if(i%5==0 && i%7==0)
            {
                System.out.println("FooBar");
            }
            else
            {
                System.out.println(i);
            }
        }

    }
}
