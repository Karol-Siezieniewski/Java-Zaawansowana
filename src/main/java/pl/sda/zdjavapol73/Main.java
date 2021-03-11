package pl.sda.zdjavapol73;

import pl.sda.zdjavapol73.api.Task;
import pl.sda.zdjavapol73.homework.exceptions.task1.CannotDivideBy0Exception;
import pl.sda.zdjavapol73.homework.exceptions.task1.MathematicalDivide;
import pl.sda.zdjavapol73.homework.oop.task1.Point2D;
import pl.sda.zdjavapol73.homework.oop.task1.Point3D;
import pl.sda.zdjavapol73.homework.oop.task2.Student;
import pl.sda.zdjavapol73.homework.oop.task3.Rectangle;
import pl.sda.zdjavapol73.homework.oop.task3.Shape;
import pl.sda.zdjavapol73.homework.oop.task3.Square;
import pl.sda.zdjavapol73.homework.oop.task5.Line;
import pl.sda.zdjavapol73.homework.oop.task6.MovablePoint;
import pl.sda.zdjavapol73.homework.oop.task7.Circle;
import pl.sda.zdjavapol73.homework.oop.task7.ResizableCircle;
import pl.sda.zdjavapol73.tasks.EnumTask;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) throws CannotDivideBy0Exception {
/*        System.out.println();
        Collection<Task> tasks = new ArrayList<>();
        //                tasks.add(new DateAndTime());
        //        tasks.add(new RegularExpressions());
        //        tasks.add(new DateTimeIndividual());
        //        tasks.add(new RegularExpressions());
        //        tasks.add(new FileReader());
        //        tasks.add(new FileReaderIndividual());
        //        tasks.add(new FileWriter());
        //        tasks.add(new ReadWrite());
        //        tasks.add(new FunctionalTask());
//        tasks.add(new FunctionalTask2());
//        tasks.add(new GenericTaskIndividual());
//        tasks.add(new CollectionTask());
//        tasks.add(new StreamsTask());
//        tasks.add(new OptionalTask());
//        tasks.add(new ParallelStreamTask());
        tasks.add(new EnumTask());

        for (Task task : tasks) {
            task.run();
        }*/

/*        Point2D point = new Point2D();
        System.out.println(point.getX());
        point.setX(3.14f);
        point.setY(1.23f);
        System.out.println(point.getY());
        System.out.println(point.toString());
        System.out.println(point.getXY().length);*/

       /* Point3D point = new Point3D(3.11f, 2.11f, 3.15f);
        System.out.println(point.toString());
        point.SetXYZ(3.00f, 2.00f, 5.00f);
        System.out.println(point.toString());

        Student test = new Student("law", "IV", 1000);
        System.out.println(test.toString());*/

        /*Shape test = new Shape("red", true);
        System.out.println(test.toString());
        Circle test1 = new Circle("red", false, 5);
        System.out.println(test1.getArea());
        System.out.println(test1.getPerimeter());
        System.out.println(test1.toString());

        Rectangle test2 = new Rectangle("red", false, 5, 10);
        System.out.println(test2.getArea());
        System.out.println(test2.getPerimeter());
        System.out.println(test2.toString());

        Square test3 = new Square("red", true, 10);
        test3.setWidth(5);
        System.out.println(test3.getArea());
        System.out.println(test3.getPerimeter());
        System.out.println(test3.toString());

        pl.sda.zdjavapol73.homework.oop.task4.Square test4 = new pl.sda.zdjavapol73.homework.oop.task4.Square("blue", true, 20);
        System.out.println(test4.getArea());
        System.out.println(test4.getPerimeter());
        System.out.println(test4.toString());*/

       /* Line test5 = new Line(new Point2D(2,5), new Point2D(10, 9));
        System.out.println(test5.getStart());
        System.out.println(test5.getMiddle());
        System.out.println(test5.getLength());

        MovablePoint point = new MovablePoint(0, 0, 3, 2);
        point.moveUp();
        point.moveUp();
        point.moveUp();
        point.moveDown();
        point.moveLeft();
        point.getPosition();

        ResizableCircle test6 = new ResizableCircle(4.0);
        System.out.println(test6.getArea());
        test6.resize(75);
        System.out.println(test6.getRadius());
        System.out.println(test6.getArea());*/

        System.out.println(MathematicalDivide.divide(4.0, 1));
        System.out.println(MathematicalDivide.divide(4.0, 0));


        //        System.out.println(new Random().nextInt(18) + 1);

        //        final String[] strings = {"To", "jest", "przykład"};

        /*for (String string : strings) {
            System.out.println(string);
        }*/
    }
}
