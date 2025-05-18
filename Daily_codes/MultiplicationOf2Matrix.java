package apnacollege;
import java.util.Scanner;

public class MultiplicationOf2Matrix {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter row:");
        int row=s.nextInt();
        System.out.print("Enter column:");
        int col=s.nextInt();
        int arr[][]=new int[row][col];
        System.out.println("Enter "+(row*col)+"elements:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=s.nextInt();
            }
        }
        System.out.println("Matrix1:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        //second matrix
        System.out.print("Enter row2:");
        int row2=s.nextInt();
        System.out.print("Enter column2:");
        int col2=s.nextInt();
        int arr2[][]=new int[row2][col2];
        System.out.println("Enter "+(row2*col2)+"elements:");
        for(int i=0;i<row2;i++){
            for(int j=0;j<col2;j++){
                arr2[i][j]=s.nextInt();
            }
        }
        System.out.println("Matrix2:");
        for(int i=0;i<row2;i++){
            for(int j=0;j<col2;j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
        if(row==row2 && col==col2) {

            for(int i=0;i<row;i++) {
                for(int j=0;j<col2;j++) {
                    if(i==j) {
                        System.out.print(arr[i][j]*arr2[i][j]+" ");
                    }
                    else if(i!=j) {
                        System.out.print(arr[i][j]*arr2[i][j]+" ");
                    }

                }
                System.out.println();
            }
        }
        else
            System.out.println("Multiplication can't possible");
    }

}
