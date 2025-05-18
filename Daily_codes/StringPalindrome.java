package apnacollege;
import java.util.Scanner;

public class StringPalindrome {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String str1="";
        for(int i=str.length()-1;i>=0;i--) {
            str1=str1+str.charAt(i);
        }
        //System.out.print(str1);
        if(str.equals(str1)) {
            System.out.print("palindrome");
        }
        else
            System.out.print("Not");
    }
}
