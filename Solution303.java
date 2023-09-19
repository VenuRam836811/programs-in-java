/// PROBLEM ///


The game mode is REVERSE: You do not have access to the statement. You have to guess what to do by observing the following set of tests:
01 Test 1
Input
Expected output
abc
3
:regional_indicator_a: :regional_indicator_b: :regional_indicator_c:
02 Test 2
Input
Expected output
ac cd
5
:regional_indicator_a: :regional_indicator_c:     :regional_indicator_c: :regional_indicator_d:
03 Test 3
Input
Expected output
a quick brown fox jumps over the lazy dog
41
:regional_indicator_a:     :regional_indicator_q: :regional_indicator_u: :regional_indicator_i: :regional_indicator_c: :regional_indicator_k:     :regional_indicator_b: :regional_indicator_r: :regional_indicator_o: :regional_indicator_w: :regional_indicator_n:     :regional_indicator_f: :regional_indicator_o: :regional_indicator_x:     :regional_indicator_j: :regional_indicator_u: :regional_indicator_m: :regional_indicator_p: :regional_indicator_s:     :regional_indicator_o: :regional_indicator_v: :regional_indicator_e: :regional_indicator_r:     :regional_indicator_t: :regional_indicator_h: :regional_indicator_e:     :regional_indicator_l: :regional_indicator_a: :regional_indicator_z: :regional_indicator_y:     :regional_indicator_d: :regional_indicator_o: :regional_indicator_g:
04 Test 4
Input
Expected output
   e
4
            :regional_indicator_e:


/// CODE FOR THE PROBLEM ///


import java.util.*;
import java.io.*;
import java.math.*;

class Solution303 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String t = in.nextLine();
        int l = in.nextInt();
        for(int i=0;i<l;i++)
        {
            char ch=t.charAt(i);
            if(Character.isLetter(ch))
            {
                System.out.print(":regional_indicator_"+ch+":");
            }
            if(i<l-1)
            {
                System.out.print(" ");
            }
            if(ch==' ')
            {
                System.out.print("   ");
            }
        }

           }
}
