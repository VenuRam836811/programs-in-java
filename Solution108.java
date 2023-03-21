import java.util.*;
class Solution108 {
public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int X = in.nextInt();
        int N = in.nextInt();
        long a=1;
        for(int i=0;i<N;i++)
        {
            a=a*(X-i);
        }
        System.out.println(a);
    }
}
