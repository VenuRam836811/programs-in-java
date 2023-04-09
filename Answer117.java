import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Answer117 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        long count=0;
        for(int i=0;i<N;i++)
        {
            if(i%3==0 || i%5==0 || i%7==0)
            {
                count+=i;
            }
        }
        System.out.println(count);
    }
}
