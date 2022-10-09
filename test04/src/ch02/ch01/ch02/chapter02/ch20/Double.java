package ch02.ch01.ch02.chapter02.ch20;

public class Double {
    public static void main(String[] args) {
        /*
        count를 사용해서 곱하기 답을 구한다.
         */
        double[] dArr = new double[5];
        int count = 0;
        dArr[0] = 1.1;
        count++;
        dArr[1] = 2.1;
        count++;
        dArr[2] = 3.1;
        count++;

        double mtotal = 1;
        for (int i = 0; i < count; i++) {
            mtotal *= dArr[i];
        }

        System.out.println(mtotal);


        /*
        length 로 돌리면 0.0이 나온다. 0을 곱하니까
         */
//        double[] dArr = new double[5];
//
//        dArr[0] = 1.1;
//        dArr[1] = 2.1;
//        dArr[2] = 3.1;
//
//        double mtotal = 1;
//        for (int i = 0; i < dArr.length; i++) {
//            mtotal *= dArr[i];
//        }
//
//        System.out.println(mtotal);


    }
}
