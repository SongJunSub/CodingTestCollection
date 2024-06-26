package collection.codingtest.programmers.level1;

import java.util.Arrays;

/*
    비밀지도
    네오는 평소 프로도가 비상금을 숨겨놓는 장소를 알려줄 비밀지도를 손에 넣었다.
    그런데 이 비밀지도는 숫자로 암호화되어 있어 위치를 확인하기 위해서는 암호를 해독해야 한다.
    다행히 지도 암호를 해독할 방법을 적어놓은 메모도 함께 발견했다.
    1. 지도는 한 변의 길이가 n인 정사각형 배열 형태로, 각 칸은 "공백"(" ") 또는 "벽"("#") 두 종류로 이루어져 있다.
    2. 전체 지도는 두 장의 지도를 겹쳐서 얻을 수 있다. 각각 "지도 1"과 "지도 2"라고 하자. 지도 1 또는 지도 2 중 어느 하나라도 벽인 부분은 전체 지도에서도 벽이다.
    지도 1과 지도 2에서 모두 공백인 부분은 전체 지도에서도 공백이다.
    3. "지도 1"과 "지도 2"는 각각 정수 배열로 암호화되어 있다.
    4. 암호화된 배열은 지도의 각 가로줄에서 벽 부분을 1, 공백 부분을 0으로 부호화했을 때 얻어지는 이진수에 해당하는 값의 배열이다.
    네오가 프로도의 비상금을 손에 넣을 수 있도록, 비밀지도의 암호를 해독하는 작업을 도와줄 프로그램을 작성하라.

    입력 형식
    입력으로 지도의 한 변 크기 n 과 2개의 정수 배열 arr1, arr2가 들어온다.

    1 ≦ n ≦ 16
    arr1, arr2는 길이 n인 정수 배열로 주어진다.
    정수 배열의 각 원소 x를 이진수로 변환했을 때의 길이는 n 이하이다. 즉, 0 ≦ x ≦ 2n - 1을 만족한다.

    출력 형식
    원래의 비밀지도를 해독하여 '#', 공백으로 구성된 문자열 배열로 출력하라.

    입출력 예제
    예제 1
    매개변수	값
    n	    5
    arr1	[9, 20, 28, 18, 11]
    arr2	[30, 1, 21, 17, 28]
    출력	    ["#####","# # #", "### #", "# ##", "#####"]

    예제 2
    매개변수	값
    n	    6
    arr1	[46, 33, 33 ,22, 31, 50]
    arr2	[27 ,56, 19, 14, 14, 10]
    출력	["######", "### #", "## ##", " #### ", " #####", "### # "]
 */
public class SecretMap {

    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String[] ints = new String[n];

        StringBuilder stringArr1 = new StringBuilder();
        StringBuilder arrayBuilder1 = new StringBuilder();
        StringBuilder stringArr2 = new StringBuilder();
        StringBuilder arrayBuilder2 = new StringBuilder();

        for (int i = 0; i < arr1.length; i++) {
            while (arr1[i] != 0) {
                stringArr1.append(arr1[i] % 2);
                arr1[i] /= 2;
            }

            if(stringArr1.length() == n) {
                stringArr1.append(0);
            }

            arrayBuilder1.append(stringArr1).reverse();

            while (arr2[i] != 0) {
                stringArr2.append(arr2[i] % 2);
                arr2[i] /= 2;
            }

            if(stringArr2.length() == n) {
                stringArr2.append(0);
            }

            arrayBuilder2.append(stringArr2).reverse();

            ints[i] = String.valueOf(Integer.parseInt(arrayBuilder1.toString()) + Integer.parseInt(arrayBuilder2.toString()));

            stringArr1.delete(0, stringArr1.length());
            arrayBuilder1.delete(0, arrayBuilder1.length());
            stringArr2.delete(0, stringArr2.length());
            arrayBuilder2.delete(0, arrayBuilder2.length());
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length(); j++) {
                if(ints[i].charAt(j) != '0') {
                    result.append("#");
                }
                else {
                    result.append(" ");
                }
            }

            answer[i] = result.toString();

            result.delete(0, result.length());
        }

        return answer;
    }

    public String[] betterSolution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            // OR 연산을 통해 두 배열의 각 원소를 결합
            int orArr = arr1[i] | arr2[i];
            // 이진수 문자열로 변환
            String binaryString = Integer.toBinaryString(orArr);

            // 결과 문자열을 n 길이로 맞춤
            while (binaryString.length() < n) {
                binaryString = "0" + binaryString;
            }

            // 이진수 문자열을 비밀지도 형식으로 변환
            binaryString = binaryString.replace("1", "#").replace("0", " ");

            answer[i] = binaryString;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new SecretMap().solution(5, new int[]{9, 20, 28, 18, 11}, new int[]{30, 1, 21, 17, 28})));
        System.out.println(Arrays.toString(new SecretMap().solution(6, new int[]{46, 33, 33, 22, 31, 50}, new int[]{27, 56, 19, 14, 14, 10})));
        System.out.println(Arrays.toString(new SecretMap().betterSolution(5, new int[]{9, 20, 28, 18, 11}, new int[]{30, 1, 21, 17, 28})));
        System.out.println(Arrays.toString(new SecretMap().betterSolution(6, new int[]{46, 33, 33, 22, 31, 50}, new int[]{27, 56, 19, 14, 14, 10})));
    }

}