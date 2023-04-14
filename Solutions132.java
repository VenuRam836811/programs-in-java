import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solutions132 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a=0;
        for(int i=1;i<=n;i++)
        {
            a+=i;
            System.out.println(a*a);
        }

        
    }
}
