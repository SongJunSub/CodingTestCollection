package collection.codingtest.level0.day1;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrintSpecialCharacters {

    /*
     * 문제 설명 : 다음과 같이 출력하도록 코드를 작성해 주세요.
     * 출력 예시 :
     *  - 출력 #1 : !@#$%^&*(\'"<>?:;
     */

    public static void main(String[] args){

        //'가 있을 땐 \\로 감싸줘야 함
        System.out.println("!@#$%^&*(\\'\"<>?:;");

    }

}