package pl.sda.zdjavapol73.homework.oop.task4;

public class Rectangle extends Shape {
    double width;
    double length;

    public Rectangle() {
        super();
        this.width = 1;
        this.length = 1;
    }

    public Rectangle(String color, boolean isFilled, double width, double length) {
        super(color, isFilled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea(){
        return width * length;
    }

    @Override
    public double getPerimeter(){
        return (width + length) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle with width = " + this.width + " and length = " + this.length + " which is a subclass off " + super.toString();
    }
}
