package chapter02.ch02.ch01.ch02.chapter01.ch5;

public class LocalVariableType {
    public static void main(String[] args) {
        var i = 10;
        var j = 10.0;
        var str = "hello";

        System.out.println(i);
        System.out.println(j);
        System.out.println(str);

        str = "test";
        //str = 3;
        System.out.println(str);
    }
}
