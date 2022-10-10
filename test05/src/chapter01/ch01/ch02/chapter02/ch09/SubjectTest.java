package chapter01.ch01.ch02.chapter02.ch09;

public class SubjectTest {
    public static void main(String[] args) {

        Student studentLeeSungUk = new Student(100, "SungUk");
        studentLeeSungUk.setKoreaSubject("국어", 100);
        studentLeeSungUk.setMathSubject("수학", 100);

        Student studentLee = new Student(100, "Lee");
        studentLee.setKoreaSubject("국어", 100);
        studentLee.setMathSubject("수학", 100);

        studentLeeSungUk.showScoreInfo();
        studentLee.showScoreInfo();

    }
}
