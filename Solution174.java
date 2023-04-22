import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution174 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        for(int i=0;i<string.length();i++)
        {
            char ch=string.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
            {
System.out.print(ch);
System.out.print("p");
System.out.print(ch);

            }
            else
            {
                System.out.print(ch);
            }
        }
    }
}
