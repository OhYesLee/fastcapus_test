package chapter01.ch01.chapter01.ch14;

import java.util.Scanner;

public class IfElseTest {
    public static void main(String[] args) {
        int age = 7;

        Scanner scanner = new Scanner(System.in);
        age = scanner.nextInt();

        if (age >= 8) {
            System.out.println("학교에 다닙니다");
        } else {
            System.out.println("학교에 다니지 않습니다.");
        }

    }
}
