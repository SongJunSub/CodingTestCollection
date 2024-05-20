package collection.codingtest.programmers.level1;

import java.util.Arrays;

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