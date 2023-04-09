import java.util.*;
class Answer118 {
public static void main(String args[]) {
Scanner in = new Scanner(System.in);
int n = in.nextInt();
int min=0,max=0;
int x[]=new int[n];
for (int i = 0; i < n; i++) {
x[i] = in.nextInt();}
Arrays.sort(x);
for(int i=0;i<n;i++){
min=x[0]+x[n-1];}
System.out.println(min);}}
