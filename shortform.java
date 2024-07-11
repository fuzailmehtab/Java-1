import java.util.Scanner;

public class shortform {
     public static void main(String[] args)
    {
    char ch;
    String s,st=" ";
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a string");
    String a=sc.nextLine();
    a=a.toUpperCase();
    s=' '+a;
    for (int i = 0; i < s.length(); i++) {
       ch=s.charAt(i);
       if(ch==' '){
        st+=s.charAt(i+1);
       }
    }
    System.out.println("Short form is ");
    System.out.println(st.trim());
    }
}
