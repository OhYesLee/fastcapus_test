package ch01.chapter02.ch04;

public class StudentTest {
    public static void main(String[] args) {

        Student studentLee = new Student();

        studentLee.studentID = 12345;
        studentLee.setStudentName("Lee");
        studentLee.address = "서울시 강남구";

        studentLee.showStudentInfo();


        Student studentKim = new Student();

        studentLee.studentID = 2442;
        studentLee.setStudentName("Kim");
        studentLee.address = "서울시 송파구";

        studentLee.showStudentInfo();

        System.out.println(studentLee);
        System.out.println(studentKim);


//        Student studentLee = new Student();
//        studentLee.studentName = "이순신";
//        studentLee.address = "서울";
//
//
//        studentLee.showStudentInfo();
//
//        Student studentKim = new Student();
//        studentKim.studentName = "김유신";
//        studentKim.address = "경주";
//
//        studentKim.showStudentInfo();
//
//        System.out.println(studentLee);
//        System.out.println(studentKim);

    }
}
