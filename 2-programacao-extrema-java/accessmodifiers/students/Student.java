package accessmodifiers.students;

public class Student {
    private String name;
    protected double test, exam;  
    
    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getExam() {
        return exam;
    }

    public void setExam(double exam) {
        this.exam = exam;
    }

    public double getTest() {
        return test;
    }

    public void setTest(double test) {
        this.test = test;
    }
}
