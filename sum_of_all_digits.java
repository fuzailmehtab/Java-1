import java.util.Scanner;

public class sum_of_all_digits {
    public static void main(String[] args) {
    Scanner sc=new  Scanner(System.in);
    System.out.println("Enter a number");
    int a=sc.nextInt();
        double sum=0;
        int num=a;
        while(num>0){
            int r=num%10;
            sum+=r;
            num=num/10;
        }
        System.out.println("Sum is "+sum);
    }
}
