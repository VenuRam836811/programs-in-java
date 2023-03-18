import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution103 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String DNA = in.nextLine();
        for(int i=0;i<DNA.length();i++)
        {
            char ch=DNA.charAt(i);
            if(ch=='A')
            {
                System.out.print("AA");
            }
            else if(ch=='T')
            {
                System.out.print("TTT");
            }
           else if(ch=='G')
            {
                System.out.print("");
            }
           else if(ch=='C')
            {
                System.out.print(ch);
            }
            else
            {
                System.out.print(ch);
            }
        }

        
    }
}
