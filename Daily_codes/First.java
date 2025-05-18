package apnacollege;
import java.util.Scanner;
abstract class AbstractClass{
    abstract void getValue();
    abstract void divisorSum(int n );
}
class Calculator extends  AbstractClass {
     void getValue() {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         divisorSum(n);
     }
         void divisorSum(int n) {
              int sum=0;
              for(int i =1 ; i<=n;i++){
                  if(n%i ==0){
                      sum+=i;
                  }
              }
System.out.println(sum);
         }
     }
public class First {
    public static void main(String[] args) {
        AbstractClass ab = new Calculator();
        ab.getValue();
    }
}
