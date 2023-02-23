import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Winner {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String team1 = in.nextLine();
        String team2 = in.nextLine();
        int a=0,b=0;
        for(int i=0;i<team1.length();i++)
        {
            char ch=team1.charAt(i);
            if(Character.isDigit(ch))
            {
                a=a+ch;
            }
            char ch1=team2.charAt(i);
            if(Character.isDigit(ch1))
            {
                b=b+ch1;
            }
        }
        if(a>b)
        {
            System.out.println("team1");
        } else if(a<b)
        {
            System.out.println("team2");
        }
        else
        {
            System.out.println("draw");
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

    }
}
