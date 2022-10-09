package ch02.ch01.ch02.chapter02.ch24_2;

import java.util.ArrayList;

public class Student2 {

    int studentID;
    String studentName;
    ArrayList<Subject_2> subjectList;

    public Student2(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;

        subjectList = new ArrayList<Subject_2>();
//        subjectList = new ArrayList<>();  위와 같다
    }

    public void addSubject2(String name, int score) {
        Subject_2 subject = new Subject_2();

        subject.setName(name);
        subject.setScorePoint(score);
        subjectList.add(subject);
    }

    public void showStudentInfo() {
        int total = 0;

        for (Subject_2 s : subjectList) {

            total += s.getScorePoint();
            System.out.println("학생 " + studentName + "의 " + s.getName() + " 과목 성적은 " +
                    s.getScorePoint() + "입니다.");
        }

        System.out.println("학생 " + studentName + "의 총점은 " + total + " 입니다.");
    }

}
