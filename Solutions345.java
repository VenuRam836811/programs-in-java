/// PROBLEM 


Abecedarian words are words in which all the letters ascend alphabetically. Your aim is to find the number of abecedarian words within the string words. Each word is in lowercase and is separated by a comma and a space ", ".
Input
Line 1: A string words with different words separated by a comma and a space ", "
Output
Line 1: An integer of the number of abecedarian words
Constraints
words contains at least two words
Example
Input
abhor, access, beach, effort
Output
3



/// CODE FOR THE PROBLEM 


import java.util.*;
class Solutions345 {
  public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String w[] = in.nextLine().split(", ");
        int m=0,p=w.length;
        for(int j=0;j<w.length;j++)
        {
            String s=w[j];
            for(int k=0;k<1;k++)
            {
                for(int l=0;l<s.length()-1;l++)
                {
                    if(s.charAt(l+1)<s.charAt(l))
                    {
                        m++;
                        break;
                    }
                }
            }
        }
        System.out.println(p-m);
    }
}
