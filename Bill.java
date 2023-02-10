import java.util.*;
public class Bill
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a<100)
        {
            System.out.println(a*1.20);
        }
        else if(a<=300)
        {
            System.out.println(100*1.20+(a-100)*2);
        }
        else
        {
             System.out.println(100*1.20+200*2+(a-300)*3);
        }
    }
}
