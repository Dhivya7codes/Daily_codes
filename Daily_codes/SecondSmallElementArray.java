package apnacollege;
import java.util.Scanner;

public class SecondSmallElementArray {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter size:");
        int size=s.nextInt();
        int temp=0;
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter elements:");
            arr[i]=s.nextInt();
        }
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Sorted array:");
        for(int i=0;i<size;i++)
            System.out.print(arr[i]+" ");
        System.out.println();
        System.out.println("Second smallest element:"+arr[1]);
    }
}
