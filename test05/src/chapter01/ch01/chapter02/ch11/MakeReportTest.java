package chapter01.ch01.chapter02.ch11;

public class MakeReportTest {
    public static void main(String[] args) {

        MakeReport bulider = new MakeReport();
        String report = bulider.getReport();

        System.out.println(report);
    }
}
