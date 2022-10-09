package ch02.ch01.ch02.chapter02.ch11;

public class MakeReportTest {
    public static void main(String[] args) {

        MakeReport bulider = new MakeReport();
        String report = bulider.getReport();

        System.out.println(report);
    }
}
