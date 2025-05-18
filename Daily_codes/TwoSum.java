package apnacollege;
import java.util.Scanner;

public class TwoSum {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter size:");
        int size=s.nextInt();
        int arr[]=new int[size];
        int i=0;
        int max=0;
        for( i=0;i<size;i++) {
            System.out.print("Enter element:");
            arr[i]=s.nextInt();
        }
        for(i=0;i<size;i++) {
            if(max<arr[i])
                max=arr[i];
        }
        System.out.print("Maximum number:"+max);
    }
}

