package collection.codingtest.inflearn.simulation;

import java.util.Arrays;

/*
    현수네 반에는 n명의 학생이 있습니다. 선생님은 n명의 학생이 모두 사다리타기를 한 다음 당첨된 학생을 이 번주 학급회장으로 선출하려고 합니다.
    각 학생은 알파벳 대문자로 표시됩니다.
    만약 n=5 이고 아래와 같은 사다리라면 위에 사다리는 세로 라인이 1부터 5까지로 표현는 5개의 세로줄과 3개의 가로줄을 가지고 있습니다.
    첫 번째 가로줄은 1번 세로줄과 2번 세로줄을 연결한 가로막대와 3번 세로줄과 4번 세로줄을 연결한 가로막대 2개가 있는데 이를 표현하는 방법은 [1, 3]으로 표현합니다.
    즉 가로막대가 연결하고 있는 세로줄 중 왼쪽 세로줄 번호만 알려주는 형식입니다.
    예를 들어 어떤 가로줄의 입력정보가 [1, 3, 5]로 표현된다면 이 가로줄에는 1번 세로줄과 2번 세로줄은 연결한 가로막대,
    3번 세로줄과 4번 세로줄은 연결한 가로막대, 5번 세로줄과 6번 세로줄은 연결한 가로막대 이렇게 3개의 가로막대가 존재한다는 것입니다.
    아래 그림처럼 가로줄의 정보는 [1, 2]와 같이 두 가로막대가 직접연결되는 경우는 입력되지 않습니다.
    위에 사다리의 정보는 [[1, 3], [2, 4], [1, 4]]와 같이 첫 번째 가로줄부터 순서대로 입력정보가 2차원 배열로 주어집니다.
    사다리를 타는 학생은 알파벳순으로 1번 세로줄부터 순서대로 사다리를 탑니다.
    매개변수 n에 학생수, ladder에 사다리의 정보가 주어지면, 모든 학생이 사다리를 탄 결과를 담은 배열을 반환하는 프로그램을 작성하세요.

    입출력 예:
    n   ladder                                                                      answer
    5   [[1, 3], [2, 4], [1, 4]]                                                    ['D', 'B', 'A', 'C', 'E']
    7   [[1, 3, 5], [1, 3, 6], [2, 4]]                                              ['A', 'C', 'B', 'F', 'D', 'G', 'E']
    8   [[1, 5], [2, 4, 7], [1, 5, 7], [2, 5, 7]]                                   ['C', 'A', 'B', 'F', 'D', 'E', 'H', 'G']
    12  [[1, 5, 8, 10], [2, 4, 7], [1, 5, 7, 9, 11], [2, 5, 7, 10], [3, 6, 8, 11]]  ['C', 'A', 'F', 'B', 'D', 'I', 'E', 'K', 'G', 'L', 'J', 'H']

    제한사항:
    • 3 ≤ n ≤ 25입니다.
    • 매개변수 ladder의 길이(사다리 가로줄의 개수)는 1,000을 넘지 않습니다.
    • 매개변수 ladder[i]의 길이는 10을 넘지 않습니다.
 */

public class ClimbTheLadder {

    public char[] solution(int n, int[][] ladder){
        char[] answer = new char[n];

        //A, B, C, D, E ~
        for(int i=0; i<n; i++){
            answer[i] = (char) (i + 65);
        }

        for(int[] line : ladder){
            for(int x : line){
                char temp = answer[x];

                answer[x] = answer[x - 1];
                answer[x - 1] = temp;
            }
        }

        return answer;
    }

    public static void main(String[] args){
        ClimbTheLadder T = new ClimbTheLadder();

        System.out.println(Arrays.toString(T.solution(5, new int[][]{{1, 3}, {2, 4}, {1, 4}})));
        System.out.println(Arrays.toString(T.solution(7, new int[][]{{1, 3, 5}, {1, 3, 6}, {2, 4}})));
        System.out.println(Arrays.toString(T.solution(8, new int[][]{{1, 5}, {2, 4, 7}, {1, 5, 7}, {2, 5, 7}})));
        System.out.println(Arrays.toString(T.solution(12, new int[][]{{1, 5, 8, 10}, {2, 4, 7}, {1, 5, 7, 9, 11}, {2, 5, 7, 10}, {3, 6, 8, 11}})));
    }

}