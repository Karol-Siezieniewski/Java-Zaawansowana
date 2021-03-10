package pl.sda.zdjavapol73.homework.oop.task3;

public class Square extends Rectangle{

    public Square(String color, boolean isFilled, double side) {
        super(color, isFilled, side, side);
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width);
        super.setLength(width);
    }

    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public String toString() {
        return "Square with sides = " + this.width + " which is a subclass off " + super.toString();
    }
}
