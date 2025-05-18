package apnacollege;
import java.util.Scanner;

class Parent{
    int n;
    Parent(int n){
        this.n=n;
    }
    void fun(int n) {
        int sum=0;
        int k=0,n1=n;
        int digit=0;

        while(n>0){
            digit+=1;
            int a=n%10;
            n/=10;
        }
        int arr[]=new int[digit];
        while(n1>0){
            int a=n1%10;
            arr[k++]=a;
            n1/=10;
        }
        for(int i=0;i<digit;i++){
            for(int j=i+1;j<digit;j++){
                sum=sum+arr[i]+arr[j];
            }
        }
        System.out.print(sum);
    }

}
public class Problem_2 {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        Parent p=new Parent(n);
        p.fun(n);
    }

}
