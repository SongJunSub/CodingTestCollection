package collection.codingtest.programmers.level1;

import java.util.Arrays;

/*
    문제 설명
    함수 solution은 정수 n을 매개변수로 입력받습니다. n의 각 자릿수를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요. 예를들어 n이 118372면 873211을 리턴하면 됩니다.

    제한 조건
    n은 1이상 8000000000 이하인 자연수입니다.

    입출력 예
    n	    return
    118372	873211
 */

public class ArrangeIntegerInDescendingOrder {

    public long solution(long n) {
        long answer = 0;

        char[] charArray = String.valueOf(n).toCharArray();

        Arrays.sort(charArray);

        StringBuilder stringBuilder = new StringBuilder();

        for(int i=charArray.length - 1; i>=0; i--) {
            stringBuilder.append(charArray[i]);
        }

        answer = Long.parseLong(stringBuilder.toString());

        return answer;
    }

    public static void main(String[] args) {
        ArrangeIntegerInDescendingOrder arrangeIntegerInDescendingOrder = new ArrangeIntegerInDescendingOrder();

        arrangeIntegerInDescendingOrder.solution(118372);
    }

}