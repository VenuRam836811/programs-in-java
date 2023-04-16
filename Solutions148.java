import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solutions148 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        int a=0,b=0;
        for(int i=0;i<input.length();i++)
        {
            char ch=input.charAt(i);
            if(Character.isLetter(ch))
            {
                a+=1;
            }
            if(Character.isDigit(ch))
            {
                b+=1;
            }
        }
        
System.out.println(a/b);
        
//S0, 1f u turn 0n u'r br4in u wi11 underst4nd
        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        
    }
}
