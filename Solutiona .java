import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solutiona {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
       if(a==b ||a==c)
       {
        System.out.println(a);
    }
     else if(b==a||b==c)
       {
        System.out.println(b);
    }
    else if(c==a||c==b)
       {
        System.out.println(c);
    }
    else
    {
         System.out.println("no solution");
    }


        
    }
}
