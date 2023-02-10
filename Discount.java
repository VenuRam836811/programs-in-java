import java.util.Scanner;
public class Discount
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int b=sc.nextInt();
	    double c=b/100.0;
	    double d=a*c;
	    System.out.println(a-d);
	}
}
