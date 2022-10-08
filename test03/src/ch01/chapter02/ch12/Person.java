package ch01.chapter02.ch12;

public class Person {

    String name;
    int age;

    public Person() {
        //int num = 19;  이렇게 쓰면 안된다.
        //name = "test";
        this("no name", 1);
        //이렇게는 가능하다.
//         int num = 19;
//         name = "test";
    }

    public Person(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public void showPerson() {
        System.out.println(name + " , " + age);
    }

    public Person getPerson() {
        return this;
    }

    public static void main(String[] args) {

        Person person = new Person();
        person.showPerson();

        System.out.println(person);

        Person person2 = person.getPerson();
        System.out.println(person2);
    }
}
