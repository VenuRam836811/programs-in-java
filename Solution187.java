import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution187 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String S = in.nextLine();
        int N = in.nextInt();
        for(int i=0;i<S.length();i++)
        {
            char ch=S.charAt(i);
           
            if(i%N==0 && i!=0)
            {
                System.out.print("-");
                System.out.print(ch);
            }
            else
            System.out.print(ch);
            }
        }
    }
