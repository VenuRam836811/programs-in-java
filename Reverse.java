import java.io.*;
import java.util.Scanner;

class Reverse {
public static void main (String[] args) {
Scanner sc= new Scanner(System.in);
String str = sc.nextLine();
String nstr="";
int a=str.length();
char ch;
for (int i=a; i>0; i--)
{
    nstr= new StringBuffer(str).reverse().toString();
}
System.out.println(nstr);
}
}


