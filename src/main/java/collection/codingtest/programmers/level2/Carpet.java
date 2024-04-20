package collection.codingtest.programmers.level2;

public class Carpet {

    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int A = brown + yellow;

        for(int i=1; i<A; i++){
            for(int j=1; j<A; j++){
                if(i >= j && i * j == A){
                    answer[0] = i;
                    answer[1] = j;

                    return answer;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Carpet carpet = new Carpet();

        carpet.solution(10, 2);
    }

}