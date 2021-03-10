package pl.sda.zdjavapol73;

import pl.sda.zdjavapol73.api.Task;
import pl.sda.zdjavapol73.homework.oop.task1.Point3D;
import pl.sda.zdjavapol73.homework.oop.task2.Student;
import pl.sda.zdjavapol73.tasks.EnumTask;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        System.out.println();
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
        }

/*        Point2D point = new Point2D();
        System.out.println(point.getX());
        point.setX(3.14f);
        point.setY(1.23f);
        System.out.println(point.getY());
        System.out.println(point.toString());
        System.out.println(point.getXY().length);*/

        Point3D point = new Point3D(3.11f, 2.11f, 3.15f);
        System.out.println(point.toString());
        point.SetXYZ(3.00f, 2.00f, 5.00f);
        System.out.println(point.toString());

        Student test = new Student("law", "IV", 1000);
        System.out.println(test.toString());


        //        System.out.println(new Random().nextInt(18) + 1);

        //        final String[] strings = {"To", "jest", "przykład"};

        /*for (String string : strings) {
            System.out.println(string);
        }*/
    }
}
