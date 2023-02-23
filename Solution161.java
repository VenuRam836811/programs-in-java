import java.util.*;
class Solution161{
public static void main(String args[]){
Scanner in=new Scanner(System.in);
String s=in.nextLine();
int e=s.length();
float c=0;
for(int i=0;i<e;i++){
int d=s.charAt(i);
c=c+d;}
System.out.printf("%.1f",c/e);}}
