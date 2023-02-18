import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solutiona7 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if(in.hasNextLine()){
            in.nextLine();
        }
        
        String t = in.nextLine();
        for(int i=0;i<t.length();i++)
        {
            char ch=t.charAt(i);
           if(Character.isLetter(ch)){
           System.out.print(ch);}
           else if(ch==' ')
           {
             System.out.print(ch);
           }
           else if(Character.isDigit(ch))
           {
            System.out.print(ch);
           }
           
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

       // System.out.println("hidden message");
    }
}
