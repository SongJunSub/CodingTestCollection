package collection.codingtest.goorm;

/*
    "3n+1" 문제는 콜라츠 추측(Conjecture) 또는 우박수(Ulam's Problem)라고도 알려진 수학적인 문제입니다. 이 문제는 다음과 같은 규칙을 가지는 수열을 고려합니다.

    양의 정수 n을 시작으로 합니다.
    n이 홀수이면, 다음 수는 3n+1이 됩니다.
    n이 짝수이면, 다음 수는 n/2가 됩니다.
    이 과정을 n이 1이 될 때까지 반복합니다.
    이 문제의 주된 관심사는 어떤 정수 n에서 출발하여 이 규칙을 적용했을 때, 결과적으로 항상 1에 도달하는지 여부입니다.
    이를 콜라츠 추측이라고 합니다. 즉, 어떤 정수 n이 주어졌을 때, 위의 규칙을 적용하여 항상 1에 도달하는지 확인하는 것이 목표입니다.

    예를 들어, n이 6이라면:

    첫 번째 단계에서는 6/2 = 3이 됩니다.
    두 번째 단계에서는 3*3 + 1 = 10이 됩니다.
    세 번째 단계에서는 10/2 = 5가 됩니다.
    네 번째 단계에서는 5*3 + 1 = 16이 됩니다.
    다섯 번째 단계에서는 16/2 = 8이 됩니다.
    여섯 번째 단계에서는 8/2 = 4가 됩니다.
    일곱 번째 단계에서는 4/2 = 2가 됩니다.
    여덟 번째 단계에서는 2/2 = 1이 됩니다.
    따라서 6에서 시작했을 때, 1에 도달했음을 알 수 있습니다.

    콜라츠 추측에 따르면 어떤 정수 n에서 시작하더라도 위의 과정을 반복하면 결국 1에 도달하게 됩니다. 하지만 이것이 정말인지 아직 증명되지 않은 문제입니다.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UlarmsProblem {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int count = 0;

        while(N != 1){
            if(N % 2 == 0) N = N / 2;
            else if(N % 2 != 0) N = 3 * N + 1;

            count++;
        }

        System.out.println(count);
    }

    public static void main(String[] args) throws IOException {
        solution();
    }

}