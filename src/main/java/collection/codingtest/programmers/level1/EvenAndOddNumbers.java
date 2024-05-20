package collection.codingtest.programmers.level1;

public class EvenAndOddNumbers {

    public String solution(int num) {
        String answer = "";

        if(num % 2 == 0) answer = "Even";
        else answer = "Odd";

        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {
        EvenAndOddNumbers evenAndOddNumbers = new EvenAndOddNumbers();

        evenAndOddNumbers.solution(3);
    }

}