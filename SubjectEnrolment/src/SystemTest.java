import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class SystemTest {

    public static EnrolmentSystem es;

    public static void main(String[] args) {

        Student s1 = new Student("ititiu19252", "Nguyen Qui Vinh Quang");
        Student s2 = new Student("ititiu19046", "Bui The Sang");
        Student s3 = new Student("ititiu17012", "Chung Minh Nhat");
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);

        Unit u1 = new Unit("1", "Object-Oriented Analysis and Design", UnitType.core);
        Unit u2 = new Unit("2", "Software Engineering", UnitType.core);
        Unit u3 = new Unit("3", "Digital Image Processing", UnitType.elective);
        ArrayList<Unit> unitList = new ArrayList<>();
        unitList.add(u1);
        unitList.add(u2);
        unitList.add(u3);

        Enrolment e1 = new Enrolment(s1, u1, "9");
        Enrolment e2 = new Enrolment(s1, u2, "9.8");
        Enrolment e3 = new Enrolment(s2, u3, "9.5");
        ArrayList<Enrolment> enrolmentList = new ArrayList<>();
        enrolmentList.add(e1);
        enrolmentList.add(e2);
        enrolmentList.add(e3);

        es = new EnrolmentSystem(studentList, unitList, enrolmentList);
        test01();
    }

    public static void test01() {
//        System.out.println(es);
        try {
            String codes[] = {"3", "1", "2"};
            es.enroll("ititiu17012", Arrays.asList(codes));
            System.out.println(es);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
