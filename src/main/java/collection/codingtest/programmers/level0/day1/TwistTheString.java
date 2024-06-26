package collection.codingtest.programmers.level0.day1;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class TwistTheString {

    /*
     * 문제 설명 : 문자열 str이 주어집니다. 문자열을 시계방향으로 90도 돌려서 아래 입출력 예와 같이 출력하는 코드를 작성해 보세요.
     * 제한 사항
     *  - 1 ≤ str의 길이 ≤ 10
     * 입출력 예 :
     *  - 입력 #1 : abcde
     *  - 출력 #1 : a
     *             b
     *             c
     *             d
     *             e
     */

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        StringBuffer stringBuffer = new StringBuffer();

        for(int i=0; i<a.length(); i++){
            System.out.println(a.substring(i, i + 1));
        }

    }

    public static void main2(String[] args){

        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        StringBuffer stringBuffer = new StringBuffer();

        for(int i=0; i<a.length(); i++){
            System.out.println(a.charAt(i));
        }

    }

}