import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Answer116 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int R = in.nextInt();
        long a=1;
        System.out.print("1");
        for(int i=1;i<N;i++)
        {
           a=a*R;
           System.out.print(" "+a);
        }

    
    }
}
