import java.util.*;

class sum_of_numbers
{
    public static void main(String[] args) {
        double sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number");
        double a=sc.nextFloat();
        System.out.print("Enter second number");
        double a1=sc.nextFloat();
        sum=a+a1;
        System.out.print("Sum of two numbers : "+sum);
    }
}