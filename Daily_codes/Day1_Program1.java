package apnacollege;
import java.util.Scanner;
public class Day1_Program1 {
    public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            float f=s.nextFloat();
            System.out.printf("%.3f\n",f);
            System.out.printf("%.2f\n",f);
            System.out.printf("%.1f\n",f);
            //alternate method
            System.out.println(String.format("%.3f",f));
        }

    }

