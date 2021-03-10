package pl.sda.zdjavapol73.homework.oop.task2;

public class Student extends Person{
    String typeOfStudies;
    String yearOfStudies;
    int priceOfStudies;

    public Student(String typeOfStudies, String yearOfStudies, int priceOfStudies) {
        this.typeOfStudies = typeOfStudies;
        this.yearOfStudies = yearOfStudies;
        this.priceOfStudies = priceOfStudies;
    }

    public String getTypeOfStudies() {
        return typeOfStudies;
    }

    public String getYearOfStudies() {
        return yearOfStudies;
    }

    public int getPriceOfStudies() {
        return priceOfStudies;
    }

    public void setTypeOfStudies(String typeOfStudies) {
        this.typeOfStudies = typeOfStudies;
    }

    public void setYearOfStudies(String yearOfStudies) {
        this.yearOfStudies = yearOfStudies;
    }

    public void setPriceOfStudies(int priceOfStudies) {
        this.priceOfStudies = priceOfStudies;
    }

    @Override
    public String toString() {
        return "Student{" +
                "typeOfStudies='" + typeOfStudies + '\'' +
                ", yearOfStudies='" + yearOfStudies + '\'' +
                ", priceOfStudies=" + priceOfStudies +
                '}';
    }
}
