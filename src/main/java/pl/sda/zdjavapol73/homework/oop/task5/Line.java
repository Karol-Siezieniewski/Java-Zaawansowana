package pl.sda.zdjavapol73.homework.oop.task5;

import pl.sda.zdjavapol73.homework.oop.task1.Point2D;

public class Line {
    Point2D start;
    Point2D end;

    public Line(Point2D start, Point2D end) {
        this.start = start;
        this.end = end;
    }

    public Line(float xOfStartPoint, float yOfStartPoint, float xOfEndPoint, float yOfEndPoint) {
        this.start = new Point2D(xOfStartPoint, yOfStartPoint);
        this.end = new Point2D(xOfEndPoint, yOfEndPoint);
    }

    public Point2D getStart() {
        return start;
    }

    public void setStart(Point2D start) {
        this.start = start;
    }

    public Point2D getEnd() {
        return end;
    }

    public void setEnd(Point2D end) {
        this.end = end;
    }

    public float getLength() {
        return (float) Math.sqrt((Math.pow(end.getX() - start.getX(), 2) +
                Math.pow(end.getY() - start.getY(), 2)));
    }



    public Point2D getMiddle(){
        float midX = (this.start.getX() + this.end.getX())/2;
        float midY = (this.start.getY() + this.end.getY())/2;
        return new Point2D(midX, midY);
    }
}
