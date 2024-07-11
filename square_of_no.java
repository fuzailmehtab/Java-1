import java.util.Scanner;

public class square_of_no {
    public static void main(String[] args)
    {
    int a;
    Scanner sc=new  Scanner(System.in);
    System.out.println("Enter a number");
    a=sc.nextInt();
    System.out.println("Square of "+a+" is "+Math.pow(a, 2));
    System.out.println("Cube of "+a+" is "+Math.pow(a, 3));
    }
}
