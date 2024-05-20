package collection.codingtest.programmers.level1;

/*
    문제 설명
    자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.

    제한 조건
    n은 10,000,000,000이하인 자연수입니다.

    입출력 예
    n	    return
    12345	[5,4,3,2,1]
 */

public class FlipNaturalNumbersIntoArray {

    public int[] solution(long n) {
        char[] charArray = String.valueOf(n).toCharArray();
        int[] answer = new int[charArray.length];

        for(int i=charArray.length - 1; i>=0; i--) {
            answer[i] = Integer.parseInt(String.valueOf(charArray[i]));
        }

        int left = 0;
        int right = answer.length - 1;

        while (left < right) {
            int temp = answer[left];

            answer[left] = answer[right];
            answer[right] = temp;

            left++;
            right--;
        }

        System.out.println(answer[0]);

        return answer;
    }

    public static void main(String[] args) {
        FlipNaturalNumbersIntoArray flipNaturalNumbersIntoArray = new FlipNaturalNumbersIntoArray();

        flipNaturalNumbersIntoArray.solution(12345);
    }

}