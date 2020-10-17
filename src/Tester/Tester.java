package Tester;
import java.util.Scanner;

import Rectangle.Rectangle;
import Shape.Shape;
import Circle.Circle;
import Square.Square;
import MovableCircle.MovableCircle;
public class Tester {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Avaliable tasks: 3");
        System.out.println(" = 3 Shapes");
        System.out.println(" = 4 GUI");
        System.out.println(" = 5 Recursion (prime)");
        System.out.println("Enter a task number: ");
        int n = reader.nextInt();
        switch(n) {
            case 3:
                TestP3();
                break;
            default:
                System.out.println("Wrong task number!");
                break;
        }
    }
    static private void TestP3() {
        MovableCircle a = new MovableCircle(1, 4, 0, 0, 2);
        System.out.println(a);
        Shape s1 = new Circle(5.5, "RED", false);
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        // System.out.println(s1.getRadius());
        Circle c1 = (Circle)s1;   // Downcast back to Circle
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());
        Shape s3 = new Rectangle(1.0, 2.0, "RED", false);   // Upcast
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        // System.out.println(s3.getLength());
        Rectangle r1 = (Rectangle)s3;   // downcast
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());
        Shape s4 = new Square(6.6);     // Upcast
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        // System.out.println(s4.getSide());  // Take note that we downcast Shape s4 to Rectangle.Rectangle, //  which is a superclass of Square, instead of Square
        Rectangle r2 = (Rectangle)s4;
        System.out.println(r2);
        System.out.println(r2.getArea());
        System.out.println(r2.getColor());
        // System.out.println(r2.getSide());
        System.out.println(r2.getLength());// Downcast Rectangle.Rectangle r2 to Square
        Square sq1 = (Square)r2;
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());
    }
}
