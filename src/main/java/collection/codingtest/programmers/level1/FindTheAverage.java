package collection.codingtest.programmers.level1;

/*
    문제 설명
    정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.

    제한사항
    arr은 길이 1 이상, 100 이하인 배열입니다.
    arr의 원소는 -10,000 이상 10,000 이하인 정수입니다.

    입출력 예
    arr	        return
    [1,2,3,4]	2.5
    [5,5]	    5
 */

public class FindTheAverage {

    public double solution(int[] arr) {
        double answer = 0;

        double total = 0;

        for(int i : arr){
            total += i;
        }

        answer = total / arr.length;

        return answer;
    }

    public static void main(String[] args) {
        FindTheAverage findTheAverage = new FindTheAverage();

        findTheAverage.solution(new int[]{1, 2, 3, 4});
    }

}