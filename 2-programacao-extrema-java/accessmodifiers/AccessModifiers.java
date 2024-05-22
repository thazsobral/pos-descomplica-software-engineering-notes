package accessmodifiers;

import accessmodifiers.students.HigthSchoolStudent;

public class AccessModifiers {
    public static void main(String[] args) {
        HigthSchoolStudent student = new HigthSchoolStudent("Teste");
        student.setExam(9);
        student.setTest(8);
        System.out.println(student.getMedia());
    }
}
