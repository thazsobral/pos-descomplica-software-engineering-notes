package classes;

public abstract class Student extends Person {

    private int ra;
    private double grades[];

    public Student(String name, int age, int ra) {
        super(name, age);
        this.ra = ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public int getRa() {
        return this.ra;
    }

    public void setGrades(double[] grades) {
        this.grades = grades;
    }

    public double[] getGrades() {
        return grades;
    }

    abstract double getAverage();
}
