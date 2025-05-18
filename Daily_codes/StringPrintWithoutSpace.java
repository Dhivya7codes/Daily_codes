package apnacollege;
import java.util.Scanner;

public class StringPrintWithoutSpace {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String str1=str.replace(" ","");
        System.out.print(str1);
    }
}
