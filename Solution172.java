import java.util.*;
class Solution172{
public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for (int i = 0; i < N; i++) {
            int X = in.nextInt();
            String a=Integer.toBinaryString(X);
            System.out.println(a);
        }

    }
}
