import java.util.Scanner;  
public class Powerofanumber 
{  

static int power(int base, int exponent)  
{  int a=1;
    for(int i=0;i<exponent;i++)
    {
        a=base*a;
    }
    return a;
//Type your code here
}  

public static void main(String args[])  
{  
int base, exponent;  
Scanner sc=new Scanner(System.in);  
base=sc.nextInt();  
exponent=sc.nextInt();  
int pow=power(base, exponent);  
System.out.println(pow);  
}  
}  
