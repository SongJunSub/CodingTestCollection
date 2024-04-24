package collection.codingtest.goorm;

/*
    문제 설명
    어느 날, 직장 동료들은 점심에 햄버거를 먹기로 했습니다. 그들은 모두 햄버거를 좋아하므로 햄버거 가게에 가서 햄버거를 주문했습니다.
    이 햄버거 가게는 여러 종류의 햄버거를 판매하고 있으며, 각 햄버거는 가격과 맛에 따라 등급이 매겨집니다.
    여러 종류의 햄버거 중에서 최대한 맛있고 가격이 싼 햄버거를 골라 먹고 싶어합니다.
    햄버거는 두 종류의 재료로 이루어져 있으며, 각 재료에 대한 맛의 점수와 가격이 주어집니다. 각 햄버거는 두 종류의 재료를 하나씩 선택하여 만들어집니다.
    당신은 직장 동료들을 도와 최대한 맛있고 가격이 싼 햄버거를 고르는 프로그램을 작성해야 합니다. 당신은 각 햄버거의 맛과 가격을 고려하여 최적의 햄버거를 선택해야 합니다.
    입력으로는 햄버거 가게에서 판매하는 햄버거의 종류 수(N)와 각 햄버거의 맛과 가격을 나타내는 N개의 행이 주어집니다.
    각 행은 두 개의 정수로 이루어져 있으며, 첫 번째 정수는 해당 햄버거의 맛 점수를 나타내고, 두 번째 정수는 해당 햄버거의 가격을 나타냅니다.
    프로그램은 선택한 햄버거의 맛 점수와 가격을 공백으로 구분하여 출력해야 합니다. 선택한 햄버거가 여러 개인 경우에는 가장 먼저 입력된 햄버거를 선택합니다.

    예시:
    입력:
    3
    5 50
    4 40
    6 60

    출력:
    4 40

    이 문제를 해결하기 위해서는 입력으로부터 각 햄버거의 맛과 가격을 비교하여 최적의 햄버거를 선택하는 알고리즘이 필요합니다. 선택된 햄버거의 맛 점수와 가격을 출력해야 합니다.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LunchIsAHamburger {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int finalGrade = Integer.MAX_VALUE;
        int finalPrice = Integer.MAX_VALUE;

        for(int i=0; i<count; i++){
            String[] A = br.readLine().split(" ");
            int grade = Integer.parseInt(A[0]);
            int price = Integer.parseInt(A[1]);

            if(grade < finalGrade || (grade == finalGrade && price < finalPrice)){
                finalGrade = grade;
                finalPrice = price;
            }
        }

        System.out.println(finalGrade + " " + finalPrice);
    }

    public static void main(String[] args) throws IOException{
        solution();
    }

}