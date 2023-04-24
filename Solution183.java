import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution183 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 16; i++) {
            String line = in.nextLine();
            for(int j=0;j<line.length();j++)
            {
                char ch=line.charAt(j);
                if(ch=='1')
                System.out.print("#");
                else
                System.out.print(" ");
            }
            System.out.println();
        }

        
    }
}
