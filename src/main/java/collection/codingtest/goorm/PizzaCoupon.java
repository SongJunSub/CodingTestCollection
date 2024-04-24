package collection.codingtest.goorm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    문제 설명
    구름이는 학급 행사에 자신이 모아둔 피자 쿠폰을 기증하여 좋은 시간을 보내고 싶어합니다.
    구름이는 지금 가지고 있는 쿠폰으로 피자 n판을 주문할 수 있는데, (남는 쿠폰은 없다고 가정합니다.)
    이 피자집은 한 판을 시킬 때마다 추가로 쿠폰을 1장씩 준다고 합니다.
    m장의 쿠폰으로 피자 한 판을 교환할 수 있다고 할 때, 구름이가 공급할 수 있는 피자의 최대 판 수를 구해보세요.

    입력
    n과 m

    출력
    구름이가 공급할 수 있는 피자의 최대 판 수

    예시1
    입력
    100 5
    출력
    124

    예시2
    입력
    10 3
    출력 14
 */

public class PizzaCoupon {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] splitInput = br.readLine().split(" ");
        int myCoupon = Integer.parseInt(splitInput[0]);
        int couponNeeded = Integer.parseInt(splitInput[1]);
        int pizza = myCoupon;

        while(myCoupon >= couponNeeded){
            pizza = pizza + (myCoupon / couponNeeded);
            myCoupon = (myCoupon / couponNeeded) + (myCoupon % couponNeeded);
        }

        System.out.println(pizza);
    }

    public static void main(String[] args) throws IOException {
        solution();
    }

}