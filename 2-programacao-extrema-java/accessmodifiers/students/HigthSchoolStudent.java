package accessmodifiers.students;

public class HigthSchoolStudent extends Student{

    public HigthSchoolStudent(String name) {
        super(name);
    }

    public double getMedia() {
        return (this.test + this.exam) / 2;
    }
}
