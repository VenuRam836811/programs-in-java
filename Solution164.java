import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution164 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c=0;
        if (in.hasNextLine()) {
            in.nextLine();
        }
        for (int i = 0; i < n; i++) {
            String m = in.nextLine();
            if(m.equals("guitar"))
            {
               c++;
            
            if(c%2==1)
            {
                System.out.println("plinx");
            }
            else
            {
                System.out.println("plonx");
            }
            }
            if(m.equals("drums") && i!=n-1)
            {
                System.out.println("badum");
            }
            if(m.equals("drums") && i==n-1)
            {
                System.out.println("tss");
            }
        }
        
    }
}
