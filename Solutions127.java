import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solutions127 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        long a=0;
        for (int i = 0; i < count; i++) {
            int number = in.nextInt();
            if(number%2==0)
            {
                a+=number;
            }
            if(number%2==1)
            {
                a=a*number;
            }
        }
        System.out.println(a);
    }
}
