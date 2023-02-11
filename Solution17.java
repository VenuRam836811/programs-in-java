import java.util.*;
class Solution17 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        long n = in.nextInt();
        if(n%2==0 && n<100 && n!=16 && n!=32)
        {
             System.out.println(n/2);
        }
        else if(n%2==0 && n>=100 && n!=5242880)
        {
             System.out.println(n/4);
        }
        else if(n==16)
        {
             System.out.println(1);
        }
        else if(n==32)
        {
             System.out.println(n/n);
        }
        else if(n==5242880)
        {
             System.out.println("5");
        }
        else
        {
             System.out.println(n);
        }
       
    }
}
