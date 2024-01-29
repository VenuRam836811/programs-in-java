/// PROBLEM ///


You've come up with some simple rules for how much to bet in a poker game based on your_hand and the hand you suspect your opponent has (opponent_hand). Program them as below:

1. Compare your_hand and the opponent_hand in terms of the ranking: 1. Straight Flush, 2. Four-of-a-kind, 3. Full House, 4. Flush, 5. Straight, 6. Three-of-a-kind, 7. Two Pair, 8. Pair, 9. High card.
2. Calculate the difference in ranks between opponent_hand and your_hand: (opponent's rank - your rank). Maximum is 8 and minimum is -8. (e.g. for opponent_hand = "Pair" (8) and your_hand = "Straight" (5) then the difference is 3.)
3. Use this difference to choose how many times the minimum bet you should bet, following the rules below to determine the final output:
< 0: Check
0: Bet 1x
1: Bet 4x
2-3: All-in
4-5: Bet 3x
6-8: Bet 2x

Note: 'Check' means declining to bet. Also, we bet most for situations when the difference in our hands is not too extreme, since they will just fold if we bet too high when we have a big advantage.
Input
Line 1: your_hand: One of the hand names (Straight Flush, Four-of-a-kind, Full House, Flush, Straight, Three-of-a-kind, Two Pair, Pair, High card).
Line 2: opponent_hand: One of the hand names (Straight Flush, Four-of-a-kind, Full House, Flush, Straight, Three-of-a-kind, Two Pair, Pair, High card).
Output
1 line: One of the 6 outputs Check, Bet [1-4]x or All-in, depending on the difference in hand ranking.
Constraints
Inputs will always be valid hands.
Example
Input
High card
High card
Output
Bet 1x



  /// CODE FOR THE PROBLEM ///


  import java.util.*;

class Solution338 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String y = in.nextLine();
        String o = in.nextLine();
        int a1=0,b1=0;
        String a[]={"Straight Flush", "Four-of-a-kind", "Full House", "Flush", "Straight", "Three-of-a-kind", "Two Pair", "Pair", "High card"};
        String b[]={"Straight Flush", "Four-of-a-kind", "Full House", "Flush", "Straight", "Three-of-a-kind", "Two Pair", "Pair", "High card"};
for(int i=0;i<9;i++)
{
    if(y.equals(a[i]))
    {
        a1=i+1;
    }
    if(o.equals(b[i]))
    {
        b1=i+1;
    }
}
if((b1-a1)<0)
System.out.println("Check");
else if((b1-a1)==0)
System.out.println("Bet 1x");
else if((b1-a1)==1)
System.out.println("Bet 4x");
else if((b1-a1)==2 || (b1-a1)==3)
System.out.println("All-in");
else if((b1-a1)==4 || (b1-a1)==5)
System.out.println("Bet 3x");
else if((b1-a1)>=6 || (b1-a1)<=8)
System.out.println("Bet 2x");
    }
}
