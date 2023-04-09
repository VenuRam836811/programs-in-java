import java.util.*;
class Answer119
{
public static void main(String args[])
{
Scanner z=new Scanner(System.in);
String n=z.nextLine();
int b=0;
for(int i=0;i<n.length();i++)
{
char c=n.charAt(i);
if(Character.isLetter(c))
{
int a=(int)c;b=b+a-65;
}
}
System.out.print(b);
}
}
