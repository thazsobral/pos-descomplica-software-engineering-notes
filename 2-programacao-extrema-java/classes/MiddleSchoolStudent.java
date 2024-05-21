package classes;

public class MiddleSchoolStudent extends Student implements IAverage {

    public MiddleSchoolStudent(String name, int age, int ra) {
        super(name, age, ra);
    }

    @Override
    public double getAverage() {
        double[] grades = this.getGrades();
        double sum = 0;
        for(double grade : grades) {
            sum += grade;
        }
        double media = sum/grades.length;
        return media;
    }
}
