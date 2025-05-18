package apnacollege;
import java.util.Scanner;

public class Day2_program2 {//lucus sequence

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int first_num=0;
        int second_num=0;
        int third_num=1;
        System.out.print(first_num+" "+second_num+" "+third_num+" ");
        for(int i=1;i<=n-3;i++) {
            int next_num=first_num+second_num+third_num;
            first_num=second_num;
            second_num=third_num;
            third_num=next_num;
            System.out.print(next_num+" ");

        }
    }
}
