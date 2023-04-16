import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solutions141 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String M1 = in.nextLine();
        int a=M1.length();
        for(int i=0;i<a;i++)
        {
            char ch=M1.charAt(i);
            int b=(int)ch;
            int c=b+a;
            System.out.printf("%c",c);
        }

    }
}
