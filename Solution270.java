/// PROBLEM ///

You must sort all characters by ASCII value in each word in message
Input
message
Output
sorted_message
Constraints
1 < Length of message by words < 250
5 < Length of message < 700
Example
Input
hello world
Output
ehllo dlorw


  /// CODE FOR THE PROBLEM ///

  import java.util.*;

class Solution270 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String message = in.nextLine(); 
        String[] str=message.split(" ");
        for(int i=0;i<str.length;i++)
        {
            String b=str[i];
            int a[]=new int[b.length()];
            for(int j=0;j<b.length();j++)
            {
            char ch=b.charAt(j);
            int c=(int)ch;
            a[j]=c;
            }
            Arrays.sort(a);
            for(int j=0;j<a.length;j++)
            {
                System.out.printf("%c",a[j]);
            }
            if(i<str.length-1)
            {
                System.out.print(" ");
            }
            
        }
    }
}
