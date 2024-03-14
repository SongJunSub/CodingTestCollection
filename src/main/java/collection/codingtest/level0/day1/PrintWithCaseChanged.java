package collection.codingtest.level0.day1;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class PrintWithCaseChanged {

    /*
     * 문제 설명 : 영어 알파벳으로 이루어진 문자열 str이 주어집니다. 각 알파벳을 대문자는 소문자로 소문자는 대문자로 변환해서 출력하는 코드를 작성해 보세요.
     * 제한 사항 :
     *  - 1 ≤ str의 길이 ≤ 20
     *  - str은 알파벳으로 이루어진 문자열입니다.
     * 입출력 예 :
     *  - 입력 #1 : aBcDeFg
     *  - 출력 #1 : AbCdEfG
     */

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        StringBuffer stringBuffer = new StringBuffer();

        for(int i=0; i<str.length(); i++){
            if(str.substring(i, i+1).equals(str.substring(i, i+1).toUpperCase())){
                stringBuffer.append(str.substring(i, i + 1).toLowerCase());
            }
            else{
                stringBuffer.append(str.substring(i, i + 1).toUpperCase());
            }
        }

        System.out.println(stringBuffer.toString());

    }

    public static void main2(String[] args){

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        StringBuffer stringBuffer = new StringBuffer();

        for(Character c : str.toCharArray()) {
            if(Character.isUpperCase(c)){
                stringBuffer.append(Character.toLowerCase(c));
            }
            else if(Character.isLowerCase(c)){
                stringBuffer.append(Character.toUpperCase(c));
            }
        }

        System.out.println(stringBuffer.toString());

    }

}