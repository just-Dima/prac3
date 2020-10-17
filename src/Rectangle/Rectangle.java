package Rectangle;
import Shape.Shape;

import java.lang.*;
public class Rectangle extends Shape {
    protected double width;
    protected double length;
    public Rectangle() {
        this.filled = false;
        this.color = "blue";
        this.width = 11.5;
        this.length = 5.1;
    }
    public Rectangle(double width, double length) {
        this.filled = false;
        this.color = "blue";
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled) {
        this.filled = filled;
        this.color = color;
        this.width = width;
        this.length = length;
    }
    public double getWidth() {
        return this.width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return this.length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public @Override double getArea() {
        return this.width*this.length;
    }
    public @Override double getPerimeter() {
        return this.width*2 + this.length*2;
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
        return "Shape: Rectangle.Rectangle, width = " + this.width + " length = " + this.length;
    }
}
