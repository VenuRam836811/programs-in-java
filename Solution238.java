import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Please note that the second variable named 'inputs' is the list of children
 * Please rename the second variable called 'inputs' to avoid errors caused by 2 variables of the same name
 * If you do not see 2 variables of the same name as in matter discussed above, DO NOT BOTHER
 * Just make sure that you have an array variable that the loop is adding each of the name values to
 **/
class Solution238 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int P = in.nextInt();
        int a=P%N;
        for (int i = 0; i < N; i++) {
            String name = in.next();
            if(a==i+1)
            {
                System.out.print(name);
            }
            if(a==0 && i==N-1)
            {
                System.out.print(name);
            }

        }

        
    }
}
