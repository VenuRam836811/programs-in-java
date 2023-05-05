import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution207 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int nbRoll = in.nextInt();
        for (int i = 0; i < nbRoll; i++) {
            int roll = in.nextInt();
            int expected = in.nextInt();
            if(roll<expected && roll!=1)
            System.out.println("Failure");
            else if(roll>=expected && roll!=20)
            System.out.println("Success");
            else if(roll==1)
            System.out.println("Critical Failure");
            else if(roll==20)
            System.out.println("Critical Success");
        }

    }
}
