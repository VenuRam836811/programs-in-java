import java.util.*;
public class Quarter{
    public static int quarterOf(int a) 
    {
        int r=0;
        if(a<=3)
        {
           r=1; 
        }
        else if(a<=6&&a>3)
        {
            r=2; 
        }
        else if(a<=9&&a>6)
        {
            r=3; 
        }
        else
        {
            r=4; 
        }
        System.out.println(r);
        return 0;
    }

public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
Quarter q=new Quarter();
//int r;
q.quarterOf(a);
// System.out.println(r);
}}
