/// PROBLEM ///

The game mode is REVERSE: You do not have access to the statement. You have to guess what to do by observing the following set of tests:
01 Test 1
Input
Expected output
greetings
GRTNGS
02 Test 2
Input
Expected output
This is a rather lengthy text containing no vowels.
THS S  RTHR LNGTH TXT CNTNNG N VWLS.
03 Test 3
Input
Expected output
A E I O U Y
null
04 Test 4
Input
Expected output
As the sun dipped below the horizon, casting a warm golden glow across the tranquil landscape, the chirping of crickets and the gentle rustling of leaves in the gentle breeze created a soothing symphony of nature's melodies, wrapping the world in a cocoon of serenity that offered a momentary escape from the hustle and bustle of everyday life, allowing one to reflect upon the beauty and intricacy of the universe and their place within it, a fleeting moment of contemplation amidst the vast canvas of existence, where time seemed to slow down and the worries of the world seemed to fade into the background, replaced by a sense of awe and wonder at the marvels that surrounded them, reminding them of the simple joys that could be found in the smallest of moments, a reminder that amidst the chaos and challenges, there is always a space for stillness and appreciation.
S TH SN DPPD BLW TH HRZN, CSTNG  WRM GLDN GLW CRSS TH TRNQL LNDSCP, TH CHRPNG F CRCKTS ND TH GNTL RSTLNG F LVS N TH GNTL BRZ CRTD  STHNG SMPHN F NTR'S MLDS, WRPPNG TH WRLD N  CCN F SRNT THT FFRD  MMNTR SCP FRM TH HSTL ND BSTL F VRD LF, LLWNG N T RFLCT PN TH BT ND NTRCC F TH NVRS ND THR PLC WTHN T,  FLTNG MMNT F CNTMPLTN MDST TH VST CNVS F XSTNC, WHR TM SMD T SLW DWN ND TH WRRS F TH WRLD SMD T FD NT TH BCKGRND, RPLCD B  SNS F W ND WNDR T TH MRVLS THT SRRNDD THM, RMNDNG THM F TH SMPL JS THT CLD B FND N TH SMLLST F MMNTS,  RMNDR THT MDST TH CHS ND CHLLNGS, THR S LWS  SPC FR STLLNSS ND PPRCTN.
05 Test 5
Input
Expected output
MY LOVE ABOUT YOU IS STRONG
M LV BT  S STRNG
06 Test 6
Input
Expected output
A
null


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
        String text1 = in.nextLine();
        String text=text1.toUpperCase();
        int a=0;
        for(int i=0;i<text.length();i++)
        {
            char ch=text.charAt(i);
            if(ch=='A'|| ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='Y'||ch==' ')
            {
a++;
            }
            
        }
        if(a==text.length())
        {
            System.out.print("null");
        }
        else
        {
          for(int i=0;i<text.length();i++)
        {
            char ch=text.charAt(i);
            if(ch=='A'|| ch=='E'||ch=='I'||ch=='O'||ch=='U'||ch=='Y')
            {

            }
            else
            {
                System.out.print(ch);
            }
            
        }  
        }

    }
}
