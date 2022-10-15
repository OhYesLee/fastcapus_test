package ch02_re;

import ch02.Customer;

public class VIPCustomer extends Customer {
    private int agentID;
    double salesRatio;

    public VIPCustomer() {
        setCustomerGrade("VIP"); //오류 발생
        double bonusRatio = 0.05;
        salesRatio = 0.1;
    }

    public int getAgentID() {
        return agentID;
    }


}
