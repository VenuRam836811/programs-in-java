import java.util.*;
class Square
{
    void square1()
    {
        Scanner sc=new Scanner(System.in);
        char s1=sc.next().charAt(0);
        int s2=sc.nextInt();
        float s3=4*s2;
        float s4=s2*s2;
        System.out.printf("perimeter: %.2f\n",s3);
        System.out.printf("Area : %.2f\n",s4);
    }
}
class Rectangle extends Square
{
    void rectangle1()
    {
    Scanner sc=new Scanner(System.in);
    char r1=sc.next().charAt(0);
    int r2=sc.nextInt();
    int r3=sc.nextInt();
    float r4=2*(r1+r2);
    float r5=r2*r3;
    System.out.printf("perimeter : %.2f",r4);
    System.out.printf("\nArea : %.2f",r5);
    }
}
class Circle extends Rectangle
{
    void circle1()
    {
        Scanner sc=new Scanner(System.in);
            char c1=sc.next().charAt(0);
            int c2=sc.nextInt();
            double c3=(3.14)*c2*c2;
            double c4=(3.14)*2*c2;
            System.out.printf("circumference : %.2f",c4);
            System.out.printf("\nArea : %.2f",c3);
    }
}
class Main
{
    public static void main(String[] args)
    {
        Circle obj=new Circle();
        obj.square1();
        obj.rectangle1();
        obj.circle1();
    }
}
