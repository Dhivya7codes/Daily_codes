package apnacollege;
import java.util.*;
abstract class mark{
    abstract void getpercentage();

}
class child1 extends mark{
    int m1,m2,m3;
    child1(int m1,int m2,int m3){
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
    }

    void getpercentage() {
        float p = (((m1+m2+m3)/300.0f)*100);
        System.out.println(p);
    }}

class child2 extends mark{

    int m4,m5,m6,m7;
    child2(int m4,int m5,int m6,int m7){
        this.m4=m4;
        this.m5=m5;
        this.m6=m6;
        this.m7=m7;

    }

    void getpercentage() {
        float p = (((m4+m5+m6+m7)/400.0f)*100);
        System.out.println(p);
    }}


public class percentageabstract {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m1 = s.nextInt();
        int m2 = s.nextInt();
        int m3 = s.nextInt();
        int m4 = s.nextInt();
        int m5 = s.nextInt();
        int m6 = s.nextInt();
        int m7 = s.nextInt();
        mark ob;
        ob = new child1(m1, m2, m3);
        ob.getpercentage();
        ob = new child2(m4, m5, m6, m7);
        ob.getpercentage();

    }

}
