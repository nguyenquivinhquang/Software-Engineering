public class Enrolment {
    private Student student;
    private Unit unit;
    private String grade;

    public Enrolment(Student student, Unit unit, String grade) {
        this.student = student;
        this.unit = unit;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "\nEnrolment{" +
                "student=" + student.getName() +
                ", unit=" + unit.getTitle() +
                ", grade='" + grade + '\'' +
                '}';
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
