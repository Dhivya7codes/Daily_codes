package apnacollege;
import java.util.Arrays;
import java.util.Scanner;

public class MissingSeriesArray {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter size:");
        int size=s.nextInt();
        int arr[]=new int[size];
        int i=0;
        for(i=0;i<size;i++) {
            System.out.print("Enter number:");
            arr[i]=s.nextInt();
        }
        Arrays.sort(arr);
        int mn=0;
        for(i=0;i<size;i++) {
            if(arr[i]+1 != arr[i+1]) {
                mn=arr[i]+1;
                break;
            }
        }
        System.out.print("Missing number:"+mn);
    }
}

