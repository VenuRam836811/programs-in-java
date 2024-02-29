/// PROBLEM 


You must reverse the input and swap the cases!
Input
Line 1 : A string string to process.
Output
Line 1: The reversed string with swapped cases.
Constraints
0 < length of string <= 50
Example
Input
Hello
Output
OLLEh


  /// CODE FOR THE PROBLEM 


  import java.util.*;
class Solution342{
public static void main(String p[]){
        Scanner n=new Scanner(System.in);
        String m=n.nextLine();
        String s=new StringBuffer(m).reverse().toString();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(Character.isUpperCase(c))
            {
                int a=(int)c+32;
                System.out.print((char)a);
            }
            else if(Character.isLowerCase(c))
            {
                int a=(int)c-32;
                System.out.print((char)a);
            }
            else
            System.out.print(c);
        }
        
    }
}
