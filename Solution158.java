import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution158 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        for (int i = 0; i < N; i++) {
            String ROW = in.nextLine();
            for(int j=0;j<ROW.length();j++)
            {
                char ch=ROW.charAt(j);
                if(ch=='0')
                {
                    System.out.print("-");

                }
                else
                {
                    System.out.print(ch);
                }
            }
            System.out.println();
        }
    }
}
