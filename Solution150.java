import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution150 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String number = in.nextLine();
        int count=0,count1=0;
        for(int i=0;i<number.length();i++)
        {
            char ch=number.charAt(i);
            if(ch=='6' )
            {
                count+=1;
            }
            else if(ch=='8')
            {
                count1+=1;
            }

        }
        if(count>0 &&count1>0)
        {
            System.out.println("Not Lucky");
        }
        else if((count>0 || count1>0))
        {
System.out.println("Lucky");
        }
        else
        {
            System.out.println("Not Lucky");
        
        }

    }
}
