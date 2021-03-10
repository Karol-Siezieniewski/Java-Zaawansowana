package pl.sda.zdjavapol73.homework.oop.task6;

public class MovableCircle implements Movable{

    double radius;
    MovablePoint pointOfCircle;

    public MovableCircle(double radius, int x, int y, int xSpeed, int ySpeed) {
        this.radius = radius;
        this.pointOfCircle = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    @Override
    public void moveUp() {
        pointOfCircle.moveUp();
    }

    @Override
    public void moveDown() {
        pointOfCircle.moveDown();
    }

    @Override
    public void moveLeft() {
        pointOfCircle.moveLeft();
    }

    @Override
    public void moveRight() {
        pointOfCircle.moveRight();
    }
}
