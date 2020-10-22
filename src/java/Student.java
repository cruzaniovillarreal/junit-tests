package java.java;

import java.util.ArrayList;

public class Student {
    private ArrayList<String> grades;
    private String name;
    private long id;

    public Student(String name, long id) {
        this.name = name;
        this.id=id;
        this.grades = new ArrayList<>();
    }
}
