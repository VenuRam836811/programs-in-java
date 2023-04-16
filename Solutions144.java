import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solutions144 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        int count=0,count1=0;
        for(int i=0;i<string.length();i++)
        {
            char ch=string.charAt(i);
            if(Character.isLetter(ch))
            {
               count+=1; 
            }
            if(ch=='.')
            {
                count1+=1;
            }
            
        }
        if(count>0 || count1>1)
        {
              System.out.println("string");
        }
        else if(count1==1)
        {
 System.out.println("float");
        }
        else
        {
             System.out.println("integer");
        }

    }
}
