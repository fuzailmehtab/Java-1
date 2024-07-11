import java.util.Scanner;

public class str_to_int {
    public static void main(String[] args)
    {
    double p;
    Scanner sc=new  Scanner(System.in);
    System.out.println("Enter a number as a string");
    String a=sc.nextLine();
    int i = Integer.parseInt(a);//  Integer.toString(a)----to convert integer to string
    p=i+1;
    System.out.println(p);
    }
}
