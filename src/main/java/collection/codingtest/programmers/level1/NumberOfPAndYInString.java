package collection.codingtest.programmers.level1;

public class NumberOfPAndYInString {

    public boolean solution(String s) {
        boolean answer = true;

        int count = 0;
        char[] charArray = s.toCharArray();

        for(char c : charArray){
            if(c == 'P' || c == 'p') count++;
            if(c == 'Y' || c == 'y') count--;
        }

        if(count == 0) answer = true;
        else answer = false;

        return answer;
    }

    public static void main(String[] args) {
        NumberOfPAndYInString numberOfPAndYInString = new NumberOfPAndYInString();

        numberOfPAndYInString.solution("pPoooyY");
    }

}