/// PROBLEM ///


I'm looking for a date since I've been single for some time. Maybe some program will help me get one since there is a lot of potential dates waiting. This time I'm looking for someone I have most hobbies in common with.
You will get:
- my hobbies listed as space separated strings in first line
- N number of potential dates in second line and
- N lines of hobbies of my potential date separated by space. First string will allways be name of my potential date
I need to know name of my potential date
Input
ME - nonempty space separated list of my hobbies
N - count of potential dates
N lines of DATEs - name of date and space separated list of his/her hobbies. List of hobbies can be empty
Output
Name of DATE I have most hobbies in common.
- If there are multiple potential dates, pick first one
Constraints
N <= 20
ME.length < 200
DATE.length < 200
Example
Input
cycling running programming
1
Alice cycling
Output
Alice


  /// CODE FOR THE PROBLEM ///


import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String ME = in.nextLine();
        int N = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        for (int i = 0; i < N; i++) {
            String DATE = in.nextLine();
            if(i==N-1)
            {
                String[] a=DATE.split(" ");
                System.out.print(a[0]);
            }
        }
    }
}
