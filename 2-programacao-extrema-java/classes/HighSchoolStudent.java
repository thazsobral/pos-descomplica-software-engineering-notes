package classes;

public class HighSchoolStudent extends Student implements IAverage {
    public HighSchoolStudent(String name, int age, int ra) {
        super(name, age, ra);
    }

    @Override
    public double getAverage() {
        double[] grades = this.getGrades();
        double sum = 0;
        for(double grade : grades) {
            sum += grade;
        }
        double media = sum/grades.length+1;
        return media;
    }
}
