import java.util.*;
class Answer115 {
public static void main(String args[]) {
Scanner in = new Scanner(System.in);
int a = in.nextInt();
int b = in.nextInt();
int c = in.nextInt();
int max=Math.max(Math.max(a,b),c);
int min=Math.min(Math.min(a,b),c);
double pow=Math.pow(max,min);
int d=(int)pow;
System.out.println(d);}}
