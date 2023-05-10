The program:
Your program must calculate the sum of the numbers that are placed on the edges of a matrix.

You are given a matrix of size N by N.

Edges are the first and the last rows and columns. Don't count corners numbers twice.

INPUT:
Line 1: an integer number N.
Next N lines: N integer numbers separated by whitespaces.

OUTPUT:
An integer number, the sum of the edge numbers.

CONSTRAINTS:
0 < N ≤ 10
-100 ≤ Number of the matrix ≤ 100

EXAMPLE:
Input
4
1 2 2 1
2 9 9 2
2 9 9 2
0 2 2 0
Output
18
 
 ....PROGRAM....
 
 import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Venu {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        int a[][]=new int[N][N];
        for (int i = 0; i < N; i++) {
            for(int j=0;j<N;j++)
            {
            a[i][j] = in.nextInt();
            }
        }
        int sum=0;
        for(int i=0;i<N;i++)
        {
            for(int j=0;j<N;j++)
            {
                if(i==0 || j==0 || i==N-1 || j==N-1)
                sum+=a[i][j];
            }
        }

        // Write an answer using System.out.println()
        // To debug: System.err.println("Debug messages...");

        System.out.println(sum);
    }
}
