package pl.sda.zdjavapol73.homework.oop.task3;

public class Shape {
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

    @Override
    public String toString() {
        if(isFilled){
            return "Shape with color of " + this.color + " and filled";
        } else {
            return "Shape with color of " + this.color + " and not filled";
        }
    }
}
