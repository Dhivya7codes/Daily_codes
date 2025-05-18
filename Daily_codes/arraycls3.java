package apnacollege;
import java.util.Scanner;
public class arraycls3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int x = sc.nextInt();
        int[] marks = new int[size];
        //input
        for(int i =0;i<size;i++) {
            marks[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++) {
            if(marks[i]==x) {
                System.out.print(marks[i]);
            }
        }
    }
}

