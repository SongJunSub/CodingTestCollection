package collection.codingtest.programmers.level2;

public class NLeastCommonMultiples {

    public int solution(int[] arr) {
        int answer = 0;

        answer = findLCM(arr);

        return answer;
    }

    // 최대 공약수(GCD)를 계산하는 메서드
    public static int gcd(int a, int b){
        if(b == 0) return a;

        return gcd(b, a % b);
    }

    // 최소 공배수(LCM)를 계산하는 메서드
    public static int lcm(int a, int b){
        return (a * b) / gcd(a, b);
    }

    // 여러 수의 최소 공배수를 계산하는 메서드
    public static int findLCM(int[] arr){
        int result = arr[0];

        for (int i = 1; i < arr.length; i++){
            result = lcm(result, arr[i]);
        }

        return result;
    }

    public static void main(String[] args){
        NLeastCommonMultiples nLeastCommonMultiples = new NLeastCommonMultiples();

        nLeastCommonMultiples.solution(new int[]{2, 6, 8, 14});
    }

}