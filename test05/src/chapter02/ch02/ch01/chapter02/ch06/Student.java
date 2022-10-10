package chapter02.ch02.ch01.chapter02.ch06;

public class Student {

    public int studentNumber;
    public String studentName;
    public int grade;

    /*
    디폴트 생성자 클래스에는 반드시 적어도 하나 이상의 생성자가 존재
     */
    public Student() {

    }

    public Student(int studentNumber, String studentName, int grade) {
        System.out.println("student 성공");

//        studentNumber = studentNumber; ====>잘못된 방식이다. 가까운 곳을 찾기 떄문에 자기 자신에게 대입하면서 오류난다.

        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.grade = grade;
    }

    public String showStudentInfo() {

        return studentName + "학생의 학번은 " + studentNumber + "이고" + grade + "학년 입니다. ";
    }
}
