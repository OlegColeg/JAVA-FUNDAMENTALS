package edu.usarb.oop.intances;

public class HumanResource {
    public static void main(String[] args) {
        Student student = new Student();
        Person person;
        person = new Person();
        System.out.println("Student's name is " + student.name);

        String name = "Petrescu";
        System.out.println(name);

        person.name = "Ionescu Marin";
        person.age = 23;
        person.adress = "Floresti, Istr. Ion reanga, 3ap.24";

        student.name = "Tocana Marian";
        student.age = 24;
        student.adress = "Soldanesti, Istr. Ion reanga, 3ap.24";

        System.out.println(student);
    }
}