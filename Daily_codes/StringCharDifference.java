package apnacollege;

import java.util.Scanner;

public class StringCharDifference {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
		  /* String str1=s.nextLine();
		   String str2=s.nextLine();
		   System.out.println(str1.compareTo(str2));*/
        //another method:

        String str1 = s.nextLine();
        String str2 = s.nextLine();
        String str3 = str1.toLowerCase();
        String str4 = str2.toLowerCase();
        for (int i = 0; i < str1.length(); i++) {
            int num = 0;
            if (str3.charAt(i) != str4.charAt(i)) {
                num = (int) str3.charAt(i) - (int) str4.charAt(i);
                System.out.println(num);
                break;
            }

        }

    }
}




