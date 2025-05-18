package apnacollege;
import java.util.Scanner;
import java.util.Arrays;
public class arraycls27 {
    public static void main(String[] args) {
        // int[] marks = {56,89,9,99}; another method to declare a array
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] marks = new int[size];
        for(int i=0;i<size;i++){
            marks[i]=sc.nextInt();
        }
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
    }
}
