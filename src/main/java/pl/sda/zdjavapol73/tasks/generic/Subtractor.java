package pl.sda.zdjavapol73.tasks.generic;

public class Subtractor {

    public static <T extends Number> double subtract(T num1, T num2) {
        return num1.doubleValue() - num2.doubleValue();
    }
}
