import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class EnrolmentSystem {
//    private HashSet<Student> studentList;
    private HashMap<String, Student> studentList = new HashMap<>();
    private HashMap<String, Unit> unitList = new HashMap<>();
    private HashMap<String ,Enrolment> enrolmentList = new HashMap<>();

    public EnrolmentSystem(ArrayList<Student> studentList, ArrayList<Unit> unitList, ArrayList<Enrolment> enrolmentList) {
        for (Student student: studentList) {
            this.studentList.put(student.getId(), student);
        }
        for (Unit unit: unitList) {
            this.unitList.put(unit.getCode(), unit);
        }
        for (Enrolment enrolment: enrolmentList) {
            this.enrolmentList.put(this.hash_enrollment(enrolment.getStudent().getId(), enrolment.getUnit().getCode()),enrolment);
        }
    }

    public Student searchStudent(String id) {
        if (this.studentList.containsKey(id) == true)
            return  this.studentList.get(id);
        return null;
    }

    public Unit searchUnit(String code) {
        if (this.unitList.containsKey(code) == true)
            return  this.unitList.get(code);
        return null;
    }

    public void enroll(String id, List<String> unitCodes) throws Exception {
        Student student = searchStudent(id);
        if (student == null) {
            String msg = "No student with the id exists!";
            throw new Exception(msg);
        }

        for (String unitCode : unitCodes) {
            if (this.enrolmentList.containsKey(this.hash_enrollment(id, unitCode)) == true ) {
                String msg = "The student have already enrolled " + this.searchUnit(unitCode).getTitle();
                throw new Exception(msg);
            }
        }

        HashSet<String> unitCodesChecker = new HashSet<>(unitCodes);
        if (unitCodesChecker.size() != unitCodes.size()) {
            String msg = "The input unit codes are not distinct!";
            throw new Exception(msg);
        }

        int countCore = 0;
        for (String code : unitCodes) {
            Unit u = searchUnit(code);
            if (u == null) {
                String msg = "No unit with the code " + code + " exists!";
                throw new Exception(msg);
            }
            if (u.getType() == UnitType.core) {
                countCore++;
            }
        }

        if (countCore < 2) {
            String msg = "Must enroll at least 2 core subjects!";
            throw new Exception(msg);
        }

        for (String code : unitCodes) {
            Unit u = searchUnit(code);
            Enrolment e = new Enrolment(student, u, "");
            enrolmentList.put(this.hash_enrollment(student.getId(), u.getCode()), e);
        }
    }
    private  String hash_enrollment(String studentId, String courseId) {
        return studentId + "###" + courseId;
    }
    @Override
    public String toString() {
        return "EnrolmentSystem{" +
                "\nstudentList=" + studentList +
                ", \nunitList=" + unitList +
                ", \nenrolmentList=" + enrolmentList +
                '}';
    }
}
