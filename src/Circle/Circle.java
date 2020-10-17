package Circle;
import java.lang.*;
import Shape.Shape;
public class Circle extends Shape {
    protected double radius;
    public Circle() {
        this.filled = false;
        this.color = "blue";
        radius = 1;
    }
    public Circle(double radius) {
        this.filled = false;
        this.color = "blue";
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius= radius;
    }
    public @Override double getArea() {
        return Math.PI*radius*radius;
    }
    public @Override double getPerimeter() {
        return 2*Math.PI*radius;
    }
    public @Override void setFilled(boolean Filled) {
        this.filled = Filled;
    }
    public @Override boolean isFilled() {
        return this.filled;
    }
    public @Override void setColor(String Color) {
        this.color = Color;
    }
    public @Override String getColor() {
        return this.color;
    }
    public @Override String toString() {
        return "Shape: circle, radius: "+this.radius+", color: "+this.color;
    }
}
