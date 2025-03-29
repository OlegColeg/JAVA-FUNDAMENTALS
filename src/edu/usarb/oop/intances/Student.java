package edu.usarb.oop.intances;

public class Student extends Person {
    String group;
    double avg;

    @Override
    public String toString() {
        return "Student [group=" + group + ", avg=" + avg + "]";
    }
}
