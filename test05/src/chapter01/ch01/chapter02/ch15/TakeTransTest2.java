package chapter01.ch01.chapter02.ch15;

public class TakeTransTest2 {

    public static void main(String[] args) {
        Student studentE = new Student("Edward", 20000);
        Taxi wellTaxi = new Taxi("잘 간다 운수");
        studentE.takeTaxi(wellTaxi);

        studentE.showInfo();
        wellTaxi.showTaxInfo();
    }
}

