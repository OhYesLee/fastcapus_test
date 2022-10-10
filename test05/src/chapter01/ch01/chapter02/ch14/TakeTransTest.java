package chapter01.ch01.chapter02.ch14;

public class TakeTransTest {
    public static void main(String[] args) {

        Student studentJ = new Student("James", 5000);
        Student studentT = new Student("Tomas", 10000);

        Bus bus100 = new Bus(100);
        Bus bus500 = new Bus(500);

        studentJ.takeBus(bus100);

        Subway greenSubway = new Subway(2);
        studentT.takeSubway(greenSubway);

        studentJ.showInfo();
        studentT.showInfo();

        bus100.showBusinfo();
        greenSubway.showSubwayinfo();

        bus500.showBusinfo();

        System.out.println("커밋이 잘된건가?");
    }
}
