import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution102 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int count=0;
        if (in.hasNextLine()) {
            in.nextLine();
        }
        for (int i = 0; i < N; i++) {
            String ROW = in.nextLine();
            for(int j=0;j<ROW.length();j++)
            {
                char ch=ROW.charAt(j);
                if(Character.isDigit(ch))
                {
                    count+=1;
                }
            }
             System.out.println(count);
             count=0;
        }

        
    }
}
