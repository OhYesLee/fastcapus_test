package ch01.chapter02.ch09;

public class Student {

    int studentId;
    String studentName;

    Subject korea;
    Subject math;

    Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;

        korea = new Subject();
        math = new Subject();
    }

    public void setKoreaSubject(String name, int score) {

        korea.studentName = name;
        korea.score = score;

    }

    public void setMathSubject(String name, int score) {

        math.studentName = name;
        math.score = score;

    }

    public void showScoreInfo() {
        int total = korea.score + math.score;
        System.out.println(studentName + "학생의 총점은 " + total + "점 입니다. ");
        System.out.println("국어 점수는 " + korea.score + "이고, " + "수학 점수는 " + math.score + "입니다. ");
    }
}
