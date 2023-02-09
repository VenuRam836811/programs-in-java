import java.util.Scanner;
public class Arraymean
{
    public static int array_mean_cal(int n,int arr[])
    {
        int a=0;
       for(int i=0;i<n;i++)
       {
          a=a+arr[i]; 
       }
       int c=a/n;
       return c;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();}
        float x=array_mean_cal(n,arr);
        System.out.println(x);
    }
}
