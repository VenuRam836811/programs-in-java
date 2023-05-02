import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution199 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int a=0,b=0,sum=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(Character.isLowerCase(ch))
            {
                a=(int)ch-96;
                sum+=a;
            }
            if(Character.isUpperCase(ch))
            {
                b=(int)ch-64;
                
                
                int d=b*2;
                sum+=d;
                
            }
        }
int l=(int)(Math.log10(sum)+1);
if(l==6)
System.out.print(sum);
else
{
System.out.print(sum);
for(int i=1;i<=6-l;i++)
{
    System.out.print("0");
}
}
    }
}
