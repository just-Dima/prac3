package Square;
import java.lang.*;
import Rectangle.Rectangle;
public class Square extends Rectangle {
    protected double side;
    public Square() {
        this.filled = false;
        this.color = "blue";
        this.side = 11.5;
        this.width = this.side;
        this.length = this.side;
    }
    public Square(double side) {
        this.filled = false;
        this.color = "blue";
        this.side = side;
        this.width = this.side;
        this.length = this.side;
    }
    public Square(boolean filled, String color, double side) {
        this.filled = filled;
        this.color = color;
        this.side = side;
        this.width = this.side;
        this.length = this.side;
    }
    public double getSide() {
        return this.side;
    }
    public void setSide(double side) {
        this.side = side;
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
        return "Shape: Square, width = " + this.width + " length = " + this.length;
    }
}
