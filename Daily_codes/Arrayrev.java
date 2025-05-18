package apnacollege;
import java.util.Scanner;
import java.util.Arrays;

public class Arrayrev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int arr[] = new int [length];
        for(int i=0;i<arr.length;i++) {
            arr[i]=sc.nextInt();
        }
        int left =0;
        int right=arr.length-1;
        while(left<right) {
            int temp = arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
            System.out.println(Arrays.toString(arr));
        }

    }
}
