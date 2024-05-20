package collection.codingtest.programmers.level1;

public class FindTheAverage {

    public double solution(int[] arr) {
        double answer = 0;

        double total = 0;

        for(int i : arr){
            total += i;
        }

        answer = total / arr.length;

        return answer;
    }

    public static void main(String[] args) {
        FindTheAverage findTheAverage = new FindTheAverage();

        findTheAverage.solution(new int[]{1, 2, 3, 4});
    }

}