import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Answer6 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        float a = in.nextFloat();
        float b = in.nextFloat();
        float c = in.nextFloat();
        float d = in.nextFloat();
       float e=a*d-b*c;
        float f=d/e;
        float g=-(b/e);
        float h=-(c/e);
        float i=a/e;
        if(e==0)
        {
          System.out.println("IMPOSSIBLE");
        }
        else
        {
              System.out.printf("%.3f",f);
                System.out.print(" ");
                System.out.printf("%.3f",g);
                System.out.println();
                System.out.printf("%.3f",h );
                System.out.print(" ");
                System.out.printf("%.3f",i);
        }


        

        
    }
}
