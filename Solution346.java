/// PROBLEM 


You are given a list of person making a one-time donation for the Elvita project.
The person who makes the major part of the donations will receive a reward from the cosmic Christ.
A character is called ‘Majoritary donor’ if its name appears more than (N / 2) times in the list.

E.g: At least 2 for 3 donations, at least 6 for 10 donations.

You must display the name of the Majoritary donor (if it exist) else conspiracy.
Input
First line: The number N of donors
Second line: A string containing the name of all the donors separated by a single space. (The names does not contain any space and the only non-alphabetical character is - )
Output
The name of the majoritary donor if it exists, else conspiracy.
Constraints
0 < N < 20
Example
Input
1
Jesus
Output
Jesus



/// CODE FOR THE PROBLEM 



import java.util.*;
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        int a=0,b=0;
        String k[]= in.nextLine().split(" ");
        for(int i=0;i<k.length;i++)
        {
            for(int j=i+1;j<k.length;j++)
            {
                if(k[i].equals(k[j]))
                a++;
            }
            if(a>=n/2)
            {
            System.out.print(k[i]);
            b++;
            break;
            }
            a=0;
        }
        if(b==0)
        System.out.print("conspiracy");
    }
}
