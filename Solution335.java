// PROBLEM ///


The game mode is REVERSE: You do not have access to the statement. You have to guess what to do by observing the following set of tests:
01 Test 1
Input
Expected output
4
nom
tot
pap
fort
nom
fort
2
02 Test 2
Input
Expected output
6
four
mort
ballab
jouer
coloc
gag
four
mort
jouer
3
03 Test 3
Input
Expected output
4
faire
ere
taire
mange
faire
taire
mange
1
04 Test 4
Input
Expected output
3
serre
double
zeste
serre
double
zeste
0


/// CODE FOR THE PROBLEM ///


import java.util.*;
class Solution335 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        int a=0;
        for (int i = 0; i < n; i++) {
            String mot = in.nextLine();
            String str=new StringBuffer(mot).reverse().toString();
            if(mot.equals(str))
            {

            }
            else
            {
                System.out.println(mot);
                a++;
            }
        }
        System.out.print(n-a);
    }
}
