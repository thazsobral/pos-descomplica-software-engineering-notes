package classes;

public class UseClass {
    public static void main(String[] args) {

        MiddleSchoolStudent middleSchoolStudent = new MiddleSchoolStudent("Lucas", 11, 123);
        HighSchoolStudent highSchoolStudent = new HighSchoolStudent("Valeria", 16, 456);
        double[] grades = {1,2,3,4,5};
        middleSchoolStudent.setGrades(grades);
        highSchoolStudent.setGrades(grades);
        System.out.println("aluno(a) "+middleSchoolStudent.getName()+" têm média "+middleSchoolStudent.getAverage());
        System.out.println("aluno(a) "+highSchoolStudent.getName()+"têm média "+highSchoolStudent.getAverage());
    }
}
