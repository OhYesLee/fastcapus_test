package ch03_re;

import ch03.Customer;

public class VIPCustomer extends Customer {
    private int agentID;
    double salesRatio;

    public VIPCustomer() {
        super(); //컴파일러가 자동으로 넣어준다.

        setCustomerGrade("VIP"); //오류 발생
        double bonusRatio = 0.05;
        salesRatio = 0.1;
        System.out.println("VIPCustomer() call");
    }

    public int getAgentID() {
        return agentID;
    }


}
