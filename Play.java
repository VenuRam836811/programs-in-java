import java.util.Scanner;
class Play
{
	public static void main(String args[])
	
	{
 int x1,x2,y1,y2;
double dis;
Scanner sc=new Scanner(System.in);
x1=sc.nextInt();
y1=sc.nextInt();
x2=sc.nextInt();
y2=sc.nextInt();  
int a=((x1-x2)*(x1-x2));
int b=((y1-y2)*(y1-y2));
dis=Math.sqrt(a+b);
System.out.println(dis);
	    
}

}
