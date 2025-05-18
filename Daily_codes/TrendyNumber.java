package apnacollege;
import java.util.Scanner;

public class TrendyNumber {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter number:");
        int n=s.nextInt();
        int a=n%100;
        if((a/10)%3==0)
            System.out.println("trendy number");
        else
            System.out.println("not");
    }
}