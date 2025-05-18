package apnacollege;
import java.util.Scanner;

public class CountOfNumber {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter size:");
        int size=s.nextInt();
        int arr[]=new int[size];
        int i=0;
        System.out.println("Enter Element:");
        for(i=0;i<size;i++) {
            arr[i]=s.nextInt();
        }
        boolean visited[]=new boolean[size];
        for(i=0;i<size;i++) {
            if(visited[i]==true)
                continue;
            //System.out.print(arr[i]);
            int count=1;
            for(int j=i+1;j<size;j++) {
                if(arr[i]==arr[j]) {
                    visited[j]=true;
                    count++;
                }

            }
            System.out.println(arr[i]+" "+count);
        }
    }

}
