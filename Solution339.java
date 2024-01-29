/// PROBLEM ///


Given two sentences, s_1 and s_2, return whether they are shadows of each other. This means that all of the word lengths are the same and words in corresponding positions don't share any common letters whatsoever.
If shadow sentences: print shadow

else print the reason that they are not shadows (check in the order provided):

not the same amount of words in both strings
some of the corresponding words not the same length
shared letters in corresponding words
Input
Line 1: s_1
Line 2: s_2
Output
shadow or one of the reasons that the strings are not shadows
lengths of the words, space-separated for the 2 strings in order
Constraints
length(s_1), length(s_2) < 30
the two strings will only have lowercase letters
Example
Input
they are round
fold two times
Output
shadow



  /// CODE FOR THE PROBLEM ///


  import java.util.*;
class Solution339 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String s1 = in.nextLine();
        String a[]=s1.split(" ");
        String s2 = in.nextLine();
        String b[]=s2.split(" ");
        int a1=0;
        if(s1.equals(s2))
        {
            System.out.println("shared letters in corresponding words");
        }
        else if(a.length!=b.length)
        {
            System.out.println("not the same amount of words in both strings");
        }
        else if(a.length==b.length)
        {
            for(int i=0;i<a.length;i++)
            {
                if(a[i].length()==b[i].length())
                {
                    a1++;
                }
            }
            if(a1==a.length)
            {
                System.out.print("shadow");
            }
            if(a1!=a.length)
            {
                System.out.println("some of the corresponding words not the same length");
            }
        }
    }
}
