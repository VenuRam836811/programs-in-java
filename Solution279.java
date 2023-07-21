/// PROBLEM ///

input :
5
output:
1
2
3
4
hint : print the armstrong numbers below the given number.

  /// CODE FOR THE PROGRAM ///

  import java.util.*;
public class Solution279
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int z=0,sum=0;
        for(int i=1;i<a;i++)
        { z=i;
        sum=0;
            int c=(int)(Math.log10(z)+1);
            while(z!=0)
            {
                int b=z%10;
                sum+=Math.pow(b,c);
                z=z/10;
            }
            if(sum==i)
            {
                System.out.println(i);
            }
        }
    }
}
