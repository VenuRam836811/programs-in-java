import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solutions152 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        String str=string.toLowerCase();
        int count=0,count1=0;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='y')
            {
                count++;
            }
            else
            {
                count1++;
            }
        }
        if(count>count1)
        {
            System.out.print("vowels");
        }
        else
        {
           System.out.print("consonants"); 
        }
    }
}
