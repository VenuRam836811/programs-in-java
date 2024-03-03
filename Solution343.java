//PROBLEM 


The game mode is REVERSE: You do not have access to the statement. You have to guess what to do by observing the following set of tests:
01 Test 1
Input
Expected output
[REVERSE CLASH]
12 0
02 Test 2
Input
Expected output
@5DN1L!!!
3 2
03 Test 3
Input
Expected output
C3PO R2D2
5 3
04 Test 4
Input
Expected output
ANSWER IS NUMBER 1
14 1
05 Test 5
Input
Expected output
Longer Sentence with no numbers or symbols
36 0
06 Test 6
Input
Expected output
JUMBLED SENTENCE IN THE NEXT TEST CASE:
32 0
07 Test 7
Input
Expected output
TH1S 1S 4 JUMBL3D S3NT3NC3!
15 7
08 Test 8
Input
Expected output
|888-444-555-333-222-111-000-999-777-666|
0 30
09 Test 9
Input
Expected output
A11 ZER0S AND 0NES: 110001010
11 13
10 Test 10
Input
Expected output
???
0 0



  /// CODE FOR THE PROBLEM 


import java.util.*;
class Solution343 {
public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String s= in.nextLine();
        int a=0,b=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(Character.isLetter(ch))
            {
                a++;
            }
            if(Character.isDigit(ch))
            {
                b++;
            }
        }
        System.out.println(a+" "+b);
    }
}
