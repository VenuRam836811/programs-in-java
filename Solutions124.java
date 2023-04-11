import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solutions124 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int count=0;
        for(int i=1;i<n;i++)
        {
        if(n%i==0)
        {
            count+=i;
        }
        }
        if(count<n)
        {
            System.out.println("deficient");
        }
        if(count>n)
        {
            System.out.println("abundant");
        }
        if(count==n)
        {
            System.out.println("perfect");
        }
    }
}
