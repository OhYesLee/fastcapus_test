package chapter01.ch01.ch02.chapter02.ch20;

public class ArrayTest {
    public static void main(String[] args) {

        int[] arr = new int[10];
        int total = 0;

        for (int i = 0, num = 1; i < arr.length; i++) {
            arr[i] = num++;
//            System.out.println(arr[i]);
        }
        // 향상된 for문
        for (int num : arr) {
            total += num;
        }
        System.out.println(total);

    }
}
