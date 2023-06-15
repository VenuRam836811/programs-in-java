/////Problem//////


The game mode is REVERSE: You do not have access to the statement. You have to guess what to do by observing the following set of tests:
01 Test 1
Input
Expected output
butter exile
beer
02 Test 2
Input
Expected output
absolutes cars radio
across
03 Test 3
Input
Expected output
noon order rate teeth
northern
04 Test 4
Input
Expected output
sorry their radar axe womb
strawberry
05 Test 5
Input
Expected output
reap ennui laugh abacus talon inferno
relationship



//////code for the problem//////


import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution230 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.print(s.charAt(0));
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch==' ')
            {
                System.out.print(s.charAt(i+1));
            }
        }
        System.out.print(s.charAt(s.length()-1));
        for(int i=s.length()-1;i>=0;i--)
        {
            char ch1=s.charAt(i);
            if(ch1==' ')
            {
                System.out.print(s.charAt(i-1));
            }
        }
       
    }
}
