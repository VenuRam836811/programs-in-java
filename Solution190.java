import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution190 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int no = in.nextInt();
        String nonmetal = in.next();
        int ox = in.nextInt();
        if(no==1)
        System.out.print(nonmetal);
        if(no==2)
         System.out.print("di"+nonmetal);
         if(no==3)
         System.out.print("tri"+nonmetal);
         if(no==4)
         System.out.print("tetr"+nonmetal);
         if(no==5)
         System.out.print("penta"+nonmetal);
         if(ox==1)
         System.out.print(" monoxide");
         if(ox==2)
         System.out.print(" dioxide");
         if(ox==3)
         System.out.print(" trioxide");
         if(ox==4)
         System.out.print(" tetroxide");
         if(ox==5)
         System.out.print(" pentoxide");
        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

       
    }
}
