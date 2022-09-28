package ch02;

import java.util.ArrayList;
import java.util.List;

public class ListExercise {
    public static void main(String[] args) {
        //String 타입을 저장할 List를 준비
        List<String> names = new ArrayList<>();

        //String 타입의 데이터 넣기
        names.add("홍길동");
        names.add("이성욱");
        names.add("James");

        //for문으로 데이터를 하나씩 출력
        for (String name : names) {
            System.out.println(name);

        }
    }
}
