package collection.codingtest.typesummary.c002_arrangement;

/*
    문제 설명
    1부터 100까지의 숫자 중에 50개의 랜덤한 숫자가 들어있는 배열이 있습니다.
    이 배열을 O(n)의 시간 복잡도로 정렬해주세요.

    출제 의도
    난이도 : 보통
    배열의 인덱스를 활용하는 방법
    자바 배열의 최대 크기
 */

import java.util.Arrays;

public class RandomNumberSorting {

    public int[] solution(int[] numbers) {
        boolean[] booleans = new boolean[100];

        for (int number : numbers) {
            booleans[number] = true;
        }

        int index = 0;

        for (int i = 0; i < booleans.length; i++) {
            if (booleans[i]) {
                numbers[index++] = i;
            }
        }

        return numbers;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new RandomNumberSorting().solution(new int[]{2, 4, 1, 5, 6, 9})));
    }

}