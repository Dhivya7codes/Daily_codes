package apnacollege;
import java.util.Scanner;

public class ArrayInitialization {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int size=s.nextInt();
        int arr[]=new int[size];
        int i,product=1;
        for( i=0;i<size;i++) {
            arr[i]=s.nextInt();

            //for( i=0;i<size;i++) {
            product=product*arr[i];
        }
        System.out.print(product);
    }

}
