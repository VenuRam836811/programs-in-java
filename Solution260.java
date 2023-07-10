//// PROBLEM ////

Your task is to bake a cake. The cake needs specific amounts of three ingredients: flour, sugar, and eggs. Given the available quantities of these ingredients, calculate the maximum number of cakes you can bake.
Input
Line 1: Three integers separated by space, FlourTotal , SugarTotal , EggsTotal representing the quantity of flour, sugar, and eggs in your kitchen.
Line 2: Three integers separated by space, FlourRequired , SugarRequired , EggsRequired representing the required amount of flour, sugar, and eggs to bake one cake.
Output
One integer the number of cakes you can bake with the given ingredients.
Constraints
1 ≤ FlourTotal, SugarTotal, EggsTotal, FlourRequired, SugarRequired, EggsRequired ≤ 10^6
Example
Input
30 40 50
3 4 5
Output
10
//// CODE FOR THE PROBLEM ////

  import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution260{

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int f = in.nextInt();
        int s = in.nextInt();
        int e = in.nextInt();
        int o = in.nextInt();
        int u = in.nextInt();
        int g= in.nextInt();
        
        if(f%o==0 && s%u==0 && e%g==0)
        System.out.print(f/o);
         else if(f<o || s<u || e<g)
        System.out.print("0");
        else
        System.out.print((int)((f+s+e)/(o+u+g))-1);
    }
}
