package apnacollege;
import java.util.Scanner;
abstract class Shape {
    abstract void rectanglearea(float l,float b);
    abstract void squarearea(float side);
    abstract void circlearea(float radius);
}
class Area extends Shape {
    void rectanglearea(float l , float b) {
        System.out.println(l*b);
    }
    void squarearea(float side) {
        System.out.println(side*side);
    }
    void  circlearea(float radius) {
        System.out.println(Math.PI*Math.pow(radius, 2));
    }
}

public class rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        float l = sc.nextFloat();
        float b = sc.nextFloat();
        float side = sc.nextFloat();
        float radius = sc.nextFloat();
        Shape s = new Area();
        s.rectanglearea(l,b);
        s.squarearea(side);
        s.circlearea(radius);
    }
}
