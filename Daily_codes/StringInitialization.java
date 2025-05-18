package apnacollege;
import java.util.Scanner;

public class StringInitialization {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String str1=str.toLowerCase();
        int count=0;
        for(int i=0;i<str1.length();i++) {
            if(str1.charAt(i)=='a'||str1.charAt(i)=='e'||str1.charAt(i)=='i'||str1.charAt(i)=='o'||str1.charAt(i)=='u') {
                count+=1;
            }
        }
        System.out.print(count);
    }

}