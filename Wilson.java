import java.util.*;
public class Wilson{
  public static int simple(double a)
  {
      String e="true";
      String f="false";
      double r=a-1;
      int b=0;
      for(int i=1;i<=r;i++)
      {
          b=b+i;
      }
      double d=a*a;
      int c=b+1;
      if(c%d==0)
      {
          System.out.println(f);
      }
      else
      {
          System.out.println(e);
      }
      return 0 ;
    //write your logic here
  }
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
double a=sc.nextDouble();
Wilson w=new Wilson();
w.simple(a);
//System.out.println(simple(a));
}}
