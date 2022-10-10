package chapter02.ch02.ch01.ch02.chapter01.ch20;

public class NestedLoopTest {
    public static void main(String[] args) {

        int dan = 2;
        int count = 1;

//        for (; dan <= 9; dan++) {
//            for (count = 1; count <= 9; count++) {
//                System.out.println(dan + "X" + count + "=" + dan * count);
//            }
//            System.out.println();
//        }

        dan = 2;
        count = 2;
        while (dan <= 9) {
            count = 1;
            while (count <= 9) {
                System.out.println(dan + "X" + count + "=" + dan * count);
                count++;
            }
            dan++;
            System.out.println();
        }
    }
}
