package pl.sda.zdjavapol73.homework.oop.task2;

public abstract class Person {
    String name;
    String adress;

    public Person() {
        this.name = "";
        this.adress = "";
    }

    public Person(String name, String adress) {
        this.name = name;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return this.name + " -> " + this.adress;
    }
}
