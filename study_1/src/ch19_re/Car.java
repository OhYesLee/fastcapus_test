package ch19_re;

public class Car {
    private static int serialNum = 10;
    private int carNum;

    public Car() {
        serialNum++;
        carNum = serialNum;
    }

    public int getCarNum() {
        return carNum;
    }

    public void setCarNum(int carNum) {

        this.carNum = carNum;
    }
}
