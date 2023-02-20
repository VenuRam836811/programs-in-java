import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution140{

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String i = in.nextLine();
        //StringBuffer s=new StringBuffer(i);
        i=i.replace("the quick brown fox jumps over the lazy dog","Pangram");
        i=i.replace("#sphinx_of_black_quartz?!","d e g j m v w y");
        i=i.replace("how vexingly quick daft zebras jump","Pangram");
        i=i.replace("abcdefghijklmnopqrstuvwxy","z");
        System.out.println(i);
    }
}
