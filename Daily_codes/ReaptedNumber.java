package apnacollege;
import java.util.Scanner;

public class ReaptedNumber {

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
        int rn=0;
        for(i=0;i<size;i++) {
            for(int j=i+1;j<size;j++) {
                if(arr[i]==arr[j]) {
                    rn=arr[i];
                    break;
                }
            }
            if(rn!=0)
                break;
        }
        if(rn!=0)
            System.out.print("Repeating number:"+rn);
        else
            System.out.print("No Repeating number:");
    }
}
