package ch01.ch02.chapter01.ch21;

public class BreakTest {
    public static void main(String[] args) {
        int sum = 0;
        int num;
//  실제로 15가 아닌 14에서 100이 넘는데 15로 출력됨
//        for (num = 1; sum <= 100; num++) {
//
//            sum += num;
//        }
//        System.out.println(sum);
//        System.out.println(num);

        //이렇게 써야함
        for (num = 1; ; num++) {

            sum += num;
            if (sum >= 100)
                break;
        }
        System.out.println(sum);
        System.out.println(num);

    }
}
