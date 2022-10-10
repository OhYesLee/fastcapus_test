package chapter02.ch02.ch01.ch02.chapter02.ch18;

public class Company {

    private static Company instance = new Company();
    private Company(){

    }

    public static Company getInstance(){
        if (instance == null){
            instance = new Company();
        }

        return instance;
    }


}
