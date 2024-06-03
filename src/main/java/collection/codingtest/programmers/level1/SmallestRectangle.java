package collection.codingtest.programmers.level1;

/*
    문제 설명
    명함 지갑을 만드는 회사에서 지갑의 크기를 정하려고 합니다.
    다양한 모양과 크기의 명함들을 모두 수납할 수 있으면서, 작아서 들고 다니기 편한 지갑을 만들어야 합니다.
    이러한 요건을 만족하는 지갑을 만들기 위해 디자인팀은 모든 명함의 가로 길이와 세로 길이를 조사했습니다.
    아래 표는 4가지 명함의 가로 길이와 세로 길이를 나타냅니다.

    명함 번호	가로 길이	세로 길이
    1	    60	    50
    2	    30	    70
    3	    60	    30
    4	    80	    40

    가장 긴 가로 길이와 세로 길이가 각각 80, 70이기 때문에 80(가로) x 70(세로) 크기의 지갑을 만들면 모든 명함들을 수납할 수 있습니다.
    하지만 2번 명함을 가로로 눕혀 수납한다면 80(가로) x 50(세로) 크기의 지갑으로 모든 명함들을 수납할 수 있습니다. 이때의 지갑 크기는 4000(=80 x 50)입니다.
    모든 명함의 가로 길이와 세로 길이를 나타내는 2차원 배열 sizes가 매개변수로 주어집니다.
    모든 명함을 수납할 수 있는 가장 작은 지갑을 만들 때, 지갑의 크기를 return 하도록 solution 함수를 완성해주세요.

    제한사항
    sizes의 길이는 1 이상 10,000 이하입니다.
    sizes의 원소는 [w, h] 형식입니다.
    w는 명함의 가로 길이를 나타냅니다.
    h는 명함의 세로 길이를 나타냅니다.
    w와 h는 1 이상 1,000 이하인 자연수입니다.

    입출력 예
    sizes	                                        result
    [[60, 50], [30, 70], [60, 30], [80, 40]]	    4000
    [[10, 7], [12, 3], [8, 15], [14, 7], [5, 15]]	120
    [[14, 4], [19, 6], [6, 16], [18, 7], [7, 11]]	133

    입출력 예 설명
    입출력 예 #1
    문제 예시와 같습니다.

    입출력 예 #2
    명함들을 적절히 회전시켜 겹쳤을 때, 3번째 명함(가로: 8, 세로: 15)이 다른 모든 명함보다 크기가 큽니다. 따라서 지갑의 크기는 3번째 명함의 크기와 같으며, 120(=8 x 15)을 return 합니다.

    입출력 예 #3
    명함들을 적절히 회전시켜 겹쳤을 때, 모든 명함을 포함하는 가장 작은 지갑의 크기는 133(=19 x 7)입니다.
 */

public class SmallestRectangle {

    public int solution(int[][] sizes) {
        int answer = 0;

        int maxX = 0;
        int maxY = 0;

        for(int[] size : sizes) {
            int x = Math.max(size[0], size[1]);
            int y = Math.min(size[0], size[1]);

            maxX = Math.max(maxX, x);
            maxY = Math.max(maxY, y);
        }

        answer = maxX * maxY;

        return answer;
    }

    public static void main(String[] args) {
        SmallestRectangle smallestRectangle = new SmallestRectangle();

        smallestRectangle.solution(new int[][]{{60, 50}, {30, 70}, {60, 30}, {80, 40}});
    }

}