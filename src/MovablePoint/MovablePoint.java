package MovablePoint;
import java.lang.*;
import Movable.Movable;
public class MovablePoint implements Movable {
    public int x;
    public int y;
    public int xSpeed;
    public int ySpeed;
    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public void moveUp() {
        this.y += 1;
    }
    public void moveDown() {
        this.y -= 1;
    }
    public void moveRight() {
        this.x += 1;
    }
    public void moveLeft() {
        this.x -= 1;
    }
    public @Override String toString() {
        return "Movable point at " + this.x + ":" + this.y + " speed " + this.xSpeed + ":" +this.ySpeed;
    }
}
