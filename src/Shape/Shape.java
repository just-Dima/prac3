package Shape;
import java.lang.*;
public abstract class Shape {
    protected String color;
    protected boolean filled;
    public Shape() {

    }
    public Shape(String Color, boolean Filled) {

    }
    public abstract String getColor();
    public abstract void setColor(String Color);
    public abstract boolean isFilled();
    public abstract void setFilled(boolean Filled);
    public abstract double getArea();
    public abstract double getPerimeter();
    public abstract String toString();
}