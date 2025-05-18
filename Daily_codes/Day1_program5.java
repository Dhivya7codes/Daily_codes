package apnacollege;
import java.util.Scanner;

public class Day1_program5 {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int side=s.nextInt();
        float area=(float) (Math.sqrt(3)/4)*side*side;
        System.out.println("Area:"+String.format("%.2f",area));

    }

}
