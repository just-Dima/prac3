package MovableCircle;
import Movable.Movable;
import MovablePoint.MovablePoint;
import MovablePoint.MovablePoint;
import Movable.Movable;
public class MovableCircle implements Movable {
    int radius;
    MovablePoint center;
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    public void moveUp() {
        this.center.y += 1;
    }
    public void moveDown() {
        this.center.y -= 1;
    }
    public void moveRight() {
        this.center.x += 1;
    }
    public void moveLeft() {
        this.center.x -= 1;
    }
    public @Override String toString() {
        return "Movable point at " + this.center.x + ":" + this.center.y + " speed " + this.center.xSpeed + ":" +this.center.ySpeed;
    }
}
