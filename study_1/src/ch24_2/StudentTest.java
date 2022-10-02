package ch24_2;

public class StudentTest {
    public static void main(String[] args) {
        Student2 studentLee = new Student2(1001, "Lee");

        studentLee.addSubject2("국어", 100);
        studentLee.addSubject2("수학", 50);

        Student2 studentKim = new Student2(1002, "Kim");

        studentKim.addSubject2("국어", 70);
        studentKim.addSubject2("수학", 85);
        studentKim.addSubject2("영어", 100);

        studentLee.showStudentInfo();
        System.out.println("======================================");
        studentKim.showStudentInfo();
    }
}
