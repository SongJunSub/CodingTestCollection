package collection.codingtest.typesummary.c002_arrangement;

/*
    문제 설명
    숫자로 구성된 배열 numbers와 target 숫자 하나가 주어졌을 때, numbers 배열에 들어있는 두 수를 더해 target 숫자를 만들 수 있는 인덱스 두 개를 찾는 함수를 작성해주세요.

    예시 1
    numbers = [2, 3, 5, 7], target = 8
    8을 만들 수 있는 3과 5의 인덱스인 1, 2를 리턴해야 합니다.

    예시 2
    numbers = [1, 2, 6, 8], target = 9
    9를 만들 수 있는 1과 8의 인덱스인 0, 3을 리턴해야 합니다.

    numbers 배열에 중복되는 숫자는 없으며, target 숫자를 만들 수 있는 조합은 하나 뿐이라고 가정해도 좋습니다.

    출제 의도
    난이도 : 보통
    확인할 내용
     - 배열 순회 및 출력
     - HashMap의 오퍼레이션을 이해하고 있는지
     - 2Sum 문제를 3Sum 문제로 바꿔도 해결할 수 있는지
 */

import java.util.Arrays;

public class SumOfTwoNumbers {

    public int[] mySolution(int[] numbers, int target) {
        int[] answer = new int[2];

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    answer[0] = i;
                    answer[1] = j;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {

        System.out.println(Arrays.toString(new SumOfTwoNumbers().mySolution(new int[]{2, 3, 5, 7}, 8)));
        System.out.println(Arrays.toString(new SumOfTwoNumbers().mySolution(new int[]{1, 2, 6, 8}, 9)));
    }

}