import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solutions147 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        String string = in.nextLine();
        if(N>0)
        {
        for(int i=0;i<N;i++)
        {
            System.out.print(string);
        }
        }
        else
        {
             System.out.print("empty");
        }
    }
}
