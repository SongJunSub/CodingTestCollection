package collection.codingtest.inflearn;

import java.util.Scanner;

public class FindTheSumOfNumbers {

    public static void solution(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String sNum = sc.next();

        char[] charArray = sNum.toCharArray();
        int sum = 0;

        for(char c : charArray){
            sum += Integer.parseInt(Character.toString(c));
        }

        System.out.println(sum);

        sc.close();
    }

    public static void main(String[] args){
        FindTheSumOfNumbers findTheSumOfNumbers = new FindTheSumOfNumbers();

        FindTheSumOfNumbers.solution();
    }

}