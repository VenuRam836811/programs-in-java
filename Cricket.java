import java.util.Scanner;
class Cricket
{
  public static void main(String arg[])
 {
double Matches,runs,innings,notout;
double avg;
Scanner sc=new Scanner(System.in);
System.out.println("enter the number of matches played");
Matches=sc.nextDouble();
System.out.println("enter the number innings batted");
innings=sc.nextDouble();
System.out.println("enter number of times notout");
notout=sc.nextDouble();
System.out.println("enter runs scored");
runs=sc.nextDouble();
avg=avgCalculation(runs,innings,notout);
System.out.println("batting average="+avg);
 }
static double avgCalculation(double runs,double innings,double notout)
  {
      double a=innings-notout;
       double b=runs/a;
       return b;
      
//code here 
   }
}
