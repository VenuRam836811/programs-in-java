import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solutions160 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        String m = in.nextLine();
        for(int i=0;i<m.length();i++)
        {
            char ch=m.charAt(i);
            if(ch==' ')
            {
System.out.print(" ");
            }
            else
            {
System.out.print("e");
            }
        }

        
    }
}
