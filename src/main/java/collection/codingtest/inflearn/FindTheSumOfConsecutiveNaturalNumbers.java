package collection.codingtest.inflearn;


import java.util.Scanner;

public class FindTheSumOfConsecutiveNaturalNumbers {

    public static void solution() {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int count = 1;
        int startIndex = 1;
        int endIndex = 1;
        int sum = 1;

        while(endIndex != N){
            if(sum == N){
                count++;
                endIndex++;
                sum = sum + endIndex;
            }
            else if(sum > N){
                sum = sum - startIndex;
                startIndex++;
            }
            else if(sum < N){
                endIndex++;
                sum = sum + endIndex;
            }
        }

        System.out.println(count);
    }

    public static void main(String[] args) {
        solution();
    }

}