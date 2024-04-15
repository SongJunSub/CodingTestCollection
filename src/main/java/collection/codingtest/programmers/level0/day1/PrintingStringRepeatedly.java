package collection.codingtest.programmers.level0.day1;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class PrintingStringRepeatedly {

    /*
     * 문제 설명 : 문자열 str과 정수 n이 주어집니다. str이 n번 반복된 문자열을 만들어 출력하는 코드를 작성해 보세요.
     * 제한 사항 :
     *  - 1 ≤ str의 길이 ≤ 10
     *  - 1 ≤ n ≤ 5
     * 입출력 예 :
     *  - 입력 #1 : string 5
     *  - 출력 #1 : stringstringstringstringstring
     */

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int n = sc.nextInt();
        String result = "";

        for(int i=0; i<n; i++){
            result += str;
        }

        System.out.println(result);

    }

    public static void main2(String[] args){

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        StringBuffer stringBuffer = new StringBuffer();

        for(int i=0; i<n; i++){
            stringBuffer.append(str);
        }

        System.out.println(stringBuffer.toString());

    }

    public static void main3(String[] args){

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        String result = "";

        System.out.println(str.repeat(n));

    }

}