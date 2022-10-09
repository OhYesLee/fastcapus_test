package ch02.ch01.ch02.chapter02.ch18;

import java.util.Calendar;

public class CompanyTest {
    public static void main(String[] args) {

        Company company1 = Company.getInstance();
        Company company2 = Company.getInstance();

        System.out.println(company1);
        System.out.println(company2);

        Calendar calendar = Calendar.getInstance();
    }
}
