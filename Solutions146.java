import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solutions146 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String s=s1.toLowerCase();
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(i%2==1)
            {
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            {
                count+=1;
            }
            }
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(count);
    }
}
