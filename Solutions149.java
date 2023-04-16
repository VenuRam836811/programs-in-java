import java.util.*;
class Solutions149 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='0' || ch=='6' || ch=='9')
            {
                count+=1;
            }
            if(ch=='8')
            {
                count+=2;
            }
        }

        System.out.println(count);
    }
}
