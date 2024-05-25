package collection.codingtest.programmers.level1;

/*
    문제 설명
    숫자로 이루어진 문자열 t와 p가 주어질 때, t에서 p와 길이가 같은 부분문자열 중에서,
    이 부분문자열이 나타내는 수가 p가 나타내는 수보다 작거나 같은 것이 나오는 횟수를 return하는 함수 solution을 완성하세요.
    예를 들어, t="3141592"이고 p="271" 인 경우, t의 길이가 3인 부분 문자열은 314, 141, 415, 159, 592입니다.
    이 문자열이 나타내는 수 중 271보다 작거나 같은 수는 141, 159 2개 입니다.

    제한사항
    1 ≤ p의 길이 ≤ 18
    p의 길이 ≤ t의 길이 ≤ 10,000
    t와 p는 숫자로만 이루어진 문자열이며, 0으로 시작하지 않습니다.

    입출력 예
    t	            p	    result
    "3141592"	    "271"	2
    "500220839878"	"7"	    8
    "10203"	        "15"	3

    입출력 예 설명
    입출력 예 #1
    본문과 같습니다.

    입출력 예 #2
    p의 길이가 1이므로 t의 부분문자열은 "5", "0", 0", "2", "2", "0", "8", "3", "9", "8", "7", "8"이며
    이중 7보다 작거나 같은 숫자는 "5", "0", "0", "2", "2", "0", "3", "7" 이렇게 8개가 있습니다.

    입출력 예 #3
    p의 길이가 2이므로 t의 부분문자열은 "10", "02", "20", "03"이며, 이중 15보다 작거나 같은 숫자는 "10", "02", "03" 이렇게 3개입니다.
    "02"와 "03"은 각각 2, 3에 해당한다는 점에 주의하세요
 */

public class SmallSubstring {

    public int solution(String t, String p) {
        int answer = 0;

        for(int i=0; i<=t.length() - p.length(); i++) {
            String sub = t.substring(i, p.length() + i);

            if(Long.parseLong(sub) <= Long.parseLong(p)) answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        SmallSubstring smallSubstring = new SmallSubstring();

        smallSubstring.solution("3141592", "271");
        smallSubstring.solution("500220839878", "7");
    }


}