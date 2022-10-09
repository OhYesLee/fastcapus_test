package ch01.ch02.chapter02.ch08;

public class Person {
    public String name;
    public int age;
    public int height;
    public int weight;
    public String gender;

    public void showPersonInfo() {
        System.out.println("이름은 " + name + " 나이는 " + age + "살 입니다. ");
        System.out.println("키는 " + height + "cm 이고 " + "몸무게는 " + weight + "kg 입니다.");
        System.out.println("성별은 " + gender + " 입니다. ");
    }
}
