/// PROBLEM ///


Given a shopping list, output the cost of the list. Sometimes you need multiple of one item and sometimes you may not find the item instore.
Input
Line 1: An integer N for the number of items.
Next N lines: The items on your shopping list.
Line N+1: An integer C the number of items in store.
Next C lines: A string separated with a space with the integer Cost.
Output
Line 1: The cost of the shopping trip.
Constraints
0< N < 100
0<Cost < 100000
Example
Input
1
Juice
3
TV 1000
Juice 3
Guitar 20000
Output
3


  /// CODE FOR THE PROBLEM ///


import java.util.*;
class Solution{
public static void main(String args[]){
Scanner z=new Scanner(System.in);
int N=z.nextInt();
String a[]=new String[N];
for(int i=0;i<N;i++){
a[i]=z.next();}
int c=z.nextInt(),s=0;
String b[]=new String[c];
int d[]=new int[c];
for(int i=0;i<c;i++){
b[i]=z.next();
d[i]=z.nextInt();}
for(int i=0;i<N;i++){
for(int j=0;j<c;j++){
if(a[i].equals(b[j])){
s+=d[j];}}}
System.out.print(s);}}
