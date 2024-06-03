package collection.codingtest.typesummary.c002_arrangement;

/*
    문제 설명
    주어진 문자열을 거꾸로 뒤집은 문자열을 만드는 함수를 작성해주세요.

    예시 1
    hello => olleh

    예시 2
    happy new year => raey wen yppah

    출제 기준
    난이도 : 쉬움
    확인할 내용
     - 배열 조회, 순회, 반복문 등 기본적인 프로그래밍 경험이 있는지
     - 간단한 swap 기능을 구현할 수 있는지
     - Java의 StringBuilder API를 알고 있는지
 */

import java.util.Arrays;

public class FlipString {

    public String mySolution(String str) {
        StringBuilder answer = new StringBuilder();
        char[] chars = str.toCharArray();

        for (int i = chars.length - 1; i >= 0; i--) {
            answer.append(chars[i]);
        }

        return answer.toString();
    }

    // 시간 복잡도 O(n)
    // 공간 복잡도 O(n)
    public String solution1(String str) {
        char[] chars = str.toCharArray();
        // 공간 복잡도 O(n)
        char[] reversedChars = new char[chars.length];
        String answer = "";

        // 4 - 4 -> 0
        // 4 - 3 -> 1
        // 4 - 2 -> 2
        // 4 - 1 -> 3
        // 4 - 0 -> 4
        // 시간 복잡도 O(n)
        for (int i = chars.length - 1; i >= 0; i--) {
            reversedChars[chars.length - 1 - i] = chars[i];
            answer += reversedChars[chars.length - 1 - i] ;
        }

        return answer;
    }

    public static void main(String[] args) {
        FlipString flipString = new FlipString();

        System.out.println(flipString.mySolution("happy new year"));
        System.out.println(flipString.solution1("happy new year"));
    }

}