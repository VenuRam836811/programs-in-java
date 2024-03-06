/// PROBLEM 


Stalin Sort is a highly efficient sorting algorithm that operates sequentially, checking each item from the second element onwards, and removing any that are out of order (less than the previous element). This process is repeated until the list is sorted, achieving efficiency through potential data loss.
Input
Line 1 An integer n is amount of element to be sort
Next n line An integer element in the list to be sorted
Output
Line 1 A Stalin-sorted list of elements separated by space
Constraints
1 ≤ n ≤ 1,000
1 ≤ element ≤ 1,000,000
Example
Input
5
1
3
2
3
5
Output
1 3 3 5



  /// CODE FOR THE PROBLEM 



import java.util.*;
class Solution350 {
public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int e[]=new int[n];
        for (int i = 0; i < n; i++)
        {
            e[i] = in.nextInt();
        }
         int max=e[0];
         System.out.print(max);
        for(int i=1;i<n;i++)
        {
            if(max<=e[i])
            {
                System.out.print(" "+e[i]);
                max=e[i];
            }
        }
    }
}
