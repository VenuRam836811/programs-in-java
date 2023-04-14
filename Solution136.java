import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution136 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int c = in.nextInt();
        int n = in.nextInt();
       int S=0; 
        if (in.hasNextLine()) {
            in.nextLine();
        }
        for (int i = 0; i < n; i++) {
            String row = in.nextLine();
            for(int j=0;j<row.length();j++)
            {
                char ch=row.charAt(j);
                if(Character.isDigit(ch))
                {
                    if(ch=='7')
                    {
                       S=S+7;
                    }
                }
            }
        }

       
        System.out.println(S);
    }
}
