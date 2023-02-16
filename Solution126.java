import java.util.*;
class Solution126 {
public static void main(String args[]) {
Scanner in = new Scanner(System.in);
int n = in.nextInt();
int sum=0;
for(int i=1;i<=n+n;i++){
if(i%2!=0){
sum=sum+i;}}
System.out.println(sum);}}
