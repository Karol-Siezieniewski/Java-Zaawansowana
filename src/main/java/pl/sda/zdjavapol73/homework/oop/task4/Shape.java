package pl.sda.zdjavapol73.homework.oop.task4;

public abstract class Shape {
    String color;
    boolean isFilled;

    public Shape() {
        this.color = "unknown";
        this.isFilled = false;
    }

    public Shape(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    @Override
    public String toString() {
        if(isFilled){
            return "Shape with color of " + this.color + " and filled";
        } else {
            return "Shape with color of " + this.color + " and not filled";
        }

        // String.format("Shape with color of %s and %s", color, isFilled ? "filled" : "NotFilled");
    }
}
