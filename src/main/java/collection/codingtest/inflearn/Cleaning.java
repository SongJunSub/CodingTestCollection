package collection.codingtest.inflearn;

import java.util.Arrays;

/*
    청소로봇이 방을 청소하려고 합니다. 방은 n*n 격자판 지도로 표현됩니다.
    방에는 장애물이 있고, 장애물이 있는 지점은 로봇이 지나갈 수 없습니다.
    로봇은 지도의 왼쪽 가장 위 격자에서 3시 방향(오른쪽)을 보고 있습니다.
    로봇이 한 격자를 이동하는데 걸리는 시간은 1초입니다.
    로봇은 매초 한 칸씩 보고 있는 방향으로 이동합니다.
    만약 지도 끝으로 이동해 더 이상 전진 할 수 없거나 또는 장애물을 만나면 제자리에서 시계방향으로 90도 회전합니다.
    회전하는데도 1초의 시간이 필요합니다.
    매개변수 board에 방의 지도정보가 주어지고, k에 초시간이 주어지면 로봇이 움직이기 시작해서 k초 후에 멈춥니다.
    k초 후 로봇의 위치를 반환하는 프로그램을 작성하세요.

    입출력 예:
    board                                                                                                                       k   answer
    [[0, 0, 0, 0, 0], [0, 1, 1, 0, 0], [0, 0, 0, 0,0], [1, 0, 1, 0, 1], [0, 0, 0, 0, 0]]                                        10  [2, 2]
    [[0, 0, 0, 1, 0, 1], [0, 0, 0, 0, 0, 0], [0, 0, 0, 0, 0, 1], [1, 1, 0, 0, 1, 0], [0, 0, 0, 0, 0, 0],[0, 0, 0, 0, 0, 0]]     20  [4, 5]
    [[0, 0, 1, 0, 0], [0, 1, 0, 0, 0], [0, 0, 0, 0, 0], [1, 0, 0, 0, 1], [0, 0, 0, 0, 0]]                                       25  [0, 1]

    제한사항:
    • board의 크기 (3 <= n <= 100)
    • board에서 0은 빈 공간이고, 1은 장애물이다.
    • board에서 로봇의 시작위치는 0행 0열(가장 왼쪽 가장 위)이다.
    • 변수 k는 1,000이하의 자연수이다.

    입력예제 1 설명 :
    로봇이 0행 0열에서 출발해 10초 후에 2행 2열에서 멈춥니다.
 */

public class Cleaning {

    public int[] solution(int[][] board, int k){
        int[] answer = new int[2];

        int n = board.length;
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        int x = 0, y = 0, d = 1, count = 0;

        while(count < k){
            count++;

            int nx = x + dx[d];
            int ny = y + dy[d];

            if(nx < 0 || nx >= n || ny < 0 || ny >= n || board[nx][ny] == 1){
                d = (d + 1) % 4;
                continue;
            }

            x = nx;
            y = ny;
        }

        answer[0] = x;
        answer[1] = y;

        return answer;
    }

    public static void main(String[] args){
        Cleaning T = new Cleaning();
        int[][] arr1 = {{0, 0, 0, 0, 0},
                {0, 1, 1, 0, 0},
                {0, 0, 0, 0, 0},
                {1, 0, 1, 0, 1},
                {0, 0, 0, 0, 0}};
        System.out.println(Arrays.toString(T.solution(arr1, 10)));
        int[][] arr2 = {{0, 0, 0, 1, 0, 1},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 1},
                {1, 1, 0, 0, 1, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0}};
        System.out.println(Arrays.toString(T.solution(arr2, 20)));
        int[][] arr3 = {{0, 0, 1, 0, 0},
                {0, 1, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {1, 0, 0, 0, 1},
                {0, 0, 0, 0, 0}};
        System.out.println(Arrays.toString(T.solution(arr3, 25)));

    }

}