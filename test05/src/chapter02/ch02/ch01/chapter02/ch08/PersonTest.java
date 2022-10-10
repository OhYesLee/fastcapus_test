package chapter02.ch02.ch01.chapter02.ch08;

public class PersonTest {
    public static void main(String[] args) {

        Person personLee = new Person();
        personLee.name = "이성욱";
        personLee.age = 31;
        personLee.height = 178;
        personLee.weight = 76;
        personLee.gender = "남성";

        personLee.showPersonInfo();
    }
}
