package pl.sda.zdjavapol73.homework.exceptions.task1;

public class MathematicalDivide {

    public static double divide(double a, double b) throws CannotDivideBy0Exception {
        if (b == 0)
            throw new CannotDivideBy0Exception();

        return a / b;
    }

    ;
}
