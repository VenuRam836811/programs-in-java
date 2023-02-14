import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution116 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
                int n = in.nextInt();
        int a=0;
        int sum=1;
       while(n>0){
        a=n%10;
        sum=sum*a;
        n=n/10;
       }
        

        System.out.println(sum);
    }
}
