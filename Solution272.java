/// PROBLEM ///

You are given a string w, and a single character c.
c is equal to either S or D.

You need to print the word w as many times as the length of w. You print w once and then print w reversed, you print w once and then print w reversed and so on...

if c equal to S you need to have spaces between each word.

if c equal to D you need to have line breaks between each word.

Good luck!
Input
A word w.
A character c equal to S or D.
Output
The word w, alternatively reversed.
w must be outputted on different lines if c is D, or on the same line (with line breaks) if c is S.
Constraints
c = D or S
Example
Input
Hello
S
Output
Hello olleH Hello olleH Hello


  /// CODE FOR THE PROBLEM ///

  import java.util.*;
class Solution272{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        String b=sc.nextLine();
        String c=new StringBuffer(a).reverse().toString();
        if(b.equals("S"))
        {
            for(int i=0;i<a.length();i++)
            {
                if(i%2==0)
                {
                  System.out.print(a);  
                }
                if(i%2==1)
                {
                    System.out.print(c);
                }
                if(i<a.length()-1)
                {
                    System.out.print(" ");
                }
            }
        }
        if(b.equals("D"))
        {
            for(int i=0;i<a.length();i++)
            {
                if(i%2==0)
                {
                  System.out.print(a);  
                }
                if(i%2==1)
                {
                    System.out.print(c);
                }
                if(i<a.length()-1)
                {
                    System.out.println();
                }
            }
        }
    }
}

  
