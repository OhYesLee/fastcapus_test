package chapter02.ch02.chapter01.ch10;

public class OperatorTest {
    public static void main(String[] args) {
        int gameScore = 150;
        int lastScore = gameScore--; // gameScore +=1; >> gameScore = gameScore +1;

        System.out.println(lastScore);
        System.out.println(gameScore);
    }
}
