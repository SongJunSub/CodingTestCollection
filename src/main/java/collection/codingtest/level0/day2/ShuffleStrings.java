package collection.codingtest.level0.day2;

public class ShuffleStrings {

    /*
     * 문제 설명 : 길이가 같은 두 문자열 str1과 str2가 주어집니다.
     *           두 문자열의 각 문자가 앞에서부터 서로 번갈아가면서 한 번씩 등장하는 문자열을 만들어 return 하는 solution 함수를 완성해 주세요.
     * 제한 사항
     *  - 1 ≤ str1의 길이 = str2의 길이 ≤ 10
     *  - str1과 str2는 알파벳 소문자로 이루어진 문자열입니다.
     * 입출력 예 :
     *  str1    str2    result
     *  "aaaaa" "bbbbb" "ababababab"
     */

    public String solution(String str1, String str2){

        StringBuffer stringBuffer = new StringBuffer();

        for(int i=0; i<str1.length(); i++){
            stringBuffer.append(str1.substring(i, i + 1) + str2.substring(i, i + 1));
        }

        return stringBuffer.toString();

    }

    public String solution2(String str1, String str2){

        String answer = "";

        for(int i=0; i<str1.length(); i++){
            answer += str1.charAt(i);
            answer += str2.charAt(i);
        }

        return answer;

    }

}