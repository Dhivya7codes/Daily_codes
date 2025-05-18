package apnacollege;
import java.util.Scanner;

interface A2{
    abstract void diagonalsMinMax(int a[][]);
}
class Interface implements A2{
    int n;
    Interface(int n){
        this.n=n;
    }
    public void diagonalsMinMax(int a[][]) {
        int min=0,max=0;
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {

                min=a[0][0];
                max=a[0][0];

                if(i==j) {
                    if(a[i][j]<min) {
                        min=a[i][j];
                    }
                    if(a[i][j]>max) {
                        max=a[i][j];
                    }
                }

            }
        }

        int min2=a[0][n-1];
        int max2=a[0][n-1];
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                if(i+j==n-1) {
                    if(a[i][j]<min2) {
                        min2=a[i][j];
                    }
                    if(a[i][j]>max2) {
                        max2=a[i][j];
                    }
                }
            }
        }
        System.out.println("Minimum:"+min);
        System.out.println("Maximum:"+max);
        System.out.println("Minimum:"+min2);
        System.out.println("Maximum:"+max2);
    }
}
public class InterfaceProblem_1 {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[][]=new int[n][n];
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                a[i][j]=s.nextInt();
            }
        }
        A2 m=new Interface(n);
        m.diagonalsMinMax(a);

    }

}
