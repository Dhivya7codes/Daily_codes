package apnacollege;
import java.util.Scanner;

public class TwoDArray {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int row=s.nextInt();
        int col=s.nextInt();
        int arr[][]=new int[row][col];
        int i=0,j=0;
        for(i=0;i<row;i++) {
            for(j=0;j<col;j++) {
                arr[i][j]=s.nextInt();
            }
        }
        for(i=0;i<row;i++) {
            for(j=0;j<col;j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}

