import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solutions133 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lenT = in.nextInt();
        for (int i = 0; i < lenT; i++) {
            int x = in.nextInt();
            System.out.print(x);
            if(i<lenT-1)
            {
            for(int j=0;j<x;j++)
            {
                System.out.print(".");
            }
            }
        }

    }
}
