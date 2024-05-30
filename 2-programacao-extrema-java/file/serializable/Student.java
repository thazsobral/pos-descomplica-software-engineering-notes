package serializable;

import java.io.Serializable;

public class Student implements Serializable{
    
    private static final long serialVersionUID = 1L;
    private String name;
    private int falls;
    private double grade;

    Student() {};

    Student(String name, int falls, double grade) {
        this.name = name;
        this.falls = falls;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Nome:"+this.name+"\nFaltas:"+this.falls+"\nNota:"+this.grade;
    }
}
