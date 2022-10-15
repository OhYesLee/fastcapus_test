package ch02_re;

import ch02.Customer;
import ch02.VIPCustomer;

public class CustomerTest {
    public static void main(String[] args) {
        ch02.Customer customerLee = new Customer();
        customerLee.setCustomerName("이순신");
        customerLee.setCustomerID(10010);
        customerLee.bonusPoint = 1000;
        System.out.println(customerLee.showCustomerInfo());
        System.out.println();

        ch02.VIPCustomer customerKim = new ch02.VIPCustomer();
        customerKim.setCustomerName("김유신");
        customerKim.setCustomerID(10020);
        customerKim.setBonusPoint(10000);
        System.out.println(customerKim.showCustomerInfo());

        System.out.println();
        ch02.VIPCustomer customerUk = new VIPCustomer();
        customerKim.setCustomerName("이성욱");
        customerKim.setCustomerID(10030);
        customerKim.bonusPoint = 100000;
        System.out.println(customerKim.showCustomerInfo());


    }
}
