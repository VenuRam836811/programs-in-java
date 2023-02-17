import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class a5 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        int count=0;
        for(int i=0;i<input.length();i++)
        {
            char ch=input.charAt(i);
            if(Character.isUpperCase(ch))
            {
                count+=1;
            }

        }

        
        System.out.println(count);
    }
}
