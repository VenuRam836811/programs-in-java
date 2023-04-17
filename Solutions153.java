import java.util.*;
class Solutions153 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        String a=Integer.toBinaryString(x);
        int c=0;
        for(int i=0;i<a.length();i++)
        {
            char ch=a.charAt(i);
            if(ch=='1')
            {
                c++;
            }
        }
        if(c%2==0)
        {
 System.out.println("false");
        }
        else
        {
             System.out.println("true");
        }
    }
}
