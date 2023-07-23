/// PROBLEM ///

The game mode is REVERSE: You do not have access to the statement. You have to guess what to do by observing the following set of tests:
01 Test 1
Input
Expected output
pizzas
psiazz
02 Test 2
Input
Expected output
even
enve
03 Test 3
Input
Expected output
hand
hdan
04 Test 4
Input
Expected output
family
fyalmi

  /// CODE FOR THE PROBLEM ///

  import java.util.*;
import java.io.*;
import java.math.*;
class Solution285 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String word = in.nextLine();
        for(int i=0;i<word.length()/2;i++)
        {
            char ch=word.charAt(i);
            char ch1=word.charAt(word.length()-1-i);
           
                System.out.print(ch);
                System.out.print(ch1);  
        }
    }
}
