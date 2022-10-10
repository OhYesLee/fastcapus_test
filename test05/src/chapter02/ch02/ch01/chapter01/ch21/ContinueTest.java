package chapter02.ch02.ch01.chapter01.ch21;

public class ContinueTest {
    public static void main(String[] args) {

        int num;

        for (num = 1; num <= 100; num++) {
            if ((num % 3) != 0) continue;

            System.out.println(num);
        }
    }
}
