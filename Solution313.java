/// PROBLEM ///


You and your friend are playing tictactoe, but have come to a disagreement on who has won the game. Output the winner of the game.
Your friend, however, hates losing and you suspect him of cheating! If the game is fudged (that is, your friend has played more turns than he should have), output 'CHEATER!' instead of winner.
You and your friend play random sides, your friend always starts first, and every game is completed.
Input
3 lines:
row: A string of three characters, each being 'X', 'O'or a space.
Output
winner: 'X', 'O', 'draw' or 'CHEATER!'.
Constraints
Example
Input
XOO
XX 
X O
Output
X


  /// CODE FOR THE PROBLEM ///


import java.util.*;
import java.io.*;
import java.math.*;
class Solution {
public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int a=0,b=0;
        String row[]=new String[3];
        for (int i = 0; i < 3; i++) {
           row[i] = in.nextLine();
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                char m=row[i].charAt(j);
                if(m=='O')
                {
                    a++;
                }
                else if(m=='X')
                {
                    b++;
                }
            }
        }
        if(a==b+1 || b==a+1)
        {
            for(int j=0;j<1;j++)
            {
                for(int i=0;i<3;i++)
                {
                char ch=row[j].charAt(i);
                char ch1=row[j+1].charAt(i);
                char ch2=row[j+2].charAt(i);
                if(ch==ch1 && ch==ch2)
                {
                    System.out.print(row[j].charAt(0));
                    break;
                }
                else
                {
                    System.out.print("draw");
                    break;
                }
                
                }
            }
        }
        else if(a>=b+2 || b>=a+2)
        {
            System.out.print("CHEATER!");
        }
        else
        {
            System.out.print("O");
        }
        }      
}
