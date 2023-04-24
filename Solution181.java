import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution181 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N1 = in.nextInt();
        int N2 = in.nextInt();
        for(int i=N1;i<=N2;i++)
        {
            if(i%3==0 || i%10==3 || i/10==3)
            {
                System.out.print("Dope");
            }
            else
            System.out.print(i);
            if(i==i)
            {
                if(i<N2)
                System.out.print("-");
            }
        }
    }
}
