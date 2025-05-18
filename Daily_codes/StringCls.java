package apnacollege;
import java.util.Scanner;

public class StringCls {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int length=str.length()/2;
        if(length%2==0)
            System.out.print(str.charAt(length));
        else

            System.out.print(str.charAt(length-1)+""+str.charAt(length));
    }

}
