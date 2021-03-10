package pl.sda.zdjavapol73.homework.oop.task3;

public class Circle extends Shape{
    int radius;

    public Circle() {
        super();
        this.radius = 1;
    }

    public Circle(String color, boolean isFilled, int radius) {
        super(color, isFilled);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(this.radius, 2);
    }

    public double getPerimeter(){
        return 2* Math.PI * this.radius;
    }

    @Override
    public String toString() {
        return "Circle with radius = " + this.radius + " which is a subclass off " + super.toString();
    }
}
