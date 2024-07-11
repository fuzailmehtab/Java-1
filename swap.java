import java.util.Scanner;

public class swap {
     public static void main(String[] args)
    {
    double temp,a,b;
    Scanner sc=new  Scanner(System.in);
    System.out.println("Enter first number");
    a=sc.nextFloat();
    System.out.println("Enter second number");
    b=sc.nextFloat();
    System.out.println("Numbers before swapping");
    System.out.println("a= "+a);
    System.out.println("b= "+b);
    temp=a;
    a=b;
    b=temp;
    System.out.println("Numbers after swapping");
    System.out.println("a= "+a);
    System.out.println("b= "+b);
    }
}
