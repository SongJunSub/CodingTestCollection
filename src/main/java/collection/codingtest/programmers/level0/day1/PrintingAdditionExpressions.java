package collection.codingtest.programmers.level0.day1;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class PrintingAdditionExpressions {

    /*
     * 문제 설명 : 두 정수 a, b가 주어질 때 다음과 같은 형태의 계산식을 출력하는 코드를 작성해 보세요.
     *  - a + b = c
     * 제한 사항 : 1 ≤ a, b ≤ 100
     * 입출력 예 :
     *  - 입력 #1 : 4 5
     *  - 출력 #1 : 4 + 5 = 9
     */

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a + " + " + b + " = " + (a + b));

    }

    public static void main2(String[] args){

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(String.format("%d + %d = %d", a, b, a + b));

    }

}