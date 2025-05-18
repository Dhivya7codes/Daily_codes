package apnacollege;
import java.util.Scanner;

public class Example1 {
    public static void main(String[]args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a String:");
        String a = s.nextLine();
        a = a.toLowerCase();
        int sum = 0;
        for (char ch : a.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                sum += (ch - 'a' + 1);
            }

        }

        System.out.println(sum);
    }

}

