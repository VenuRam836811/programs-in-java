import java.util.*;
import java.io.*;
import java.math.*;


class Answer113 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            
             int a=(int)ch;
            if(Character.isUpperCase(ch))
            {
               System.out.print(ch);
                int b=a+32;
                System.out.printf("%c",b);
            }
            else if(Character.isLowerCase(ch))
            {
                 System.out.print(ch);
             int c=a-32;
              System.out.printf("%c",c);
            }
            else
            {
                System.out.print(ch);
               
            }
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        
    }
}
