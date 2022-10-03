package ch16;

public class Employee {

    private static int serialNum = 1000; //기준이 되는 변수이므로 외부에서 함부로 변경하면 안된다. 그러니 private

    private int employeeId;
    private String employeeName;
    private String department;

    public Employee() {
        serialNum++;
        employeeId = serialNum;
    }

    public static int getSerialNum() {
        int i = 0; // 지역변수

//        employee = "Lee"; // 인스턴스 변수

        return serialNum; // static 변수
    }

    public int getEmployeeId() {
        serialNum = 1000;
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }


}
