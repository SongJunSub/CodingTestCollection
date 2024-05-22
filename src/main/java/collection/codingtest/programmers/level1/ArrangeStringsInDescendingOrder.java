package collection.codingtest.programmers.level1;

/*
    문제 설명
    문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, solution을 완성해주세요.
    s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.

    제한 사항
    str은 길이 1 이상인 문자열입니다.
    입출력 예
    s	return
    "Zbcdefg"	"gfedcbZ"
 */

import java.util.ArrayList;
import java.util.List;

public class ArrangeStringsInDescendingOrder {

    public String solution(String s) {
        StringBuilder answer = new StringBuilder();

        char[] charArray = s.toCharArray();

        List<String> arrayList = new ArrayList<>();

        for(char c : charArray) {
            arrayList.add(String.valueOf(c));
        }

        arrayList.sort(String::compareTo);

        for(int i=arrayList.size() - 1; i>=0; i--) {
            answer.append(arrayList.get(i));
        }

        System.out.println(answer);

        return answer.toString();
    }

    public static void main(String[] args) {
        ArrangeStringsInDescendingOrder arrangeStringsInDescendingOrder = new ArrangeStringsInDescendingOrder();

        arrangeStringsInDescendingOrder.solution("Zbcdefg");
    }

}