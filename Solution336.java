/// PROBLEM ///


The game mode is REVERSE: You do not have access to the statement. You have to guess what to do by observing the following set of tests:
01 Test 1
Input
Expected output
5
private bool IsEven(int number){
    if (number == 1) return false;
    else if (number == 2) return true;
    else if (number == 3) return false;
    else if (number == 4) return true;
    else if (number == 5) return false;
}
02 Test 2
Input
Expected output
-9
Can't create function
03 Test 3
Input
Expected output
24
private bool IsEven(int number){
    if (number == 1) return false;
    else if (number == 2) return true;
    else if (number == 3) return false;
    else if (number == 4) return true;
    else if (number == 5) return false;
    else if (number == 6) return true;
    else if (number == 7) return false;
    else if (number == 8) return true;
    else if (number == 9) return false;
    else if (number == 10) return true;
    else if (number == 11) return false;
    else if (number == 12) return true;
    else if (number == 13) return false;
    else if (number == 14) return true;
    else if (number == 15) return false;
    else if (number == 16) return true;
    else if (number == 17) return false;
    else if (number == 18) return true;
    else if (number == 19) return false;
    else if (number == 20) return true;
    else if (number == 21) return false;
    else if (number == 22) return true;
    else if (number == 23) return false;
    else if (number == 24) return true;
}
04 Test 4
Input
Expected output
0
Can't create function



  /// CODE FOR THE PROBLEM ////



  import java.util.*;
import java.io.*;
import java.math.*;
class Solution336 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n<=0)
        {
            System.out.println("Can't create function");
        }
        else 
        {
            System.out.println("private bool IsEven(int number){");
            for(int i=1;i<=n;i++)
            {
                if(i%2==1)
                {
                    if(i==1)
                    {
                  System.out.println("    if (number == 1) return false;");
                    }
                    else
                    {
                       System.out.println("    else if (number == "+i+") return false;"); 
                    }
                }
                else
                {
                    System.out.println("    else if (number == "+i+") return true;"); 

                }
            }
            System.out.println("}");
        }
    }
}
