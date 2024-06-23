package collection.codingtest.programmers.level1;

import java.util.Arrays;

public class DartGame {

    public int solution(String dartResult) {
        int answer = 0;
        char[] chars = dartResult.toCharArray();
        int dartResultsLength = 0;
        int dartResultsIndex = 0;

        for (int i = 0; i < chars.length; i++) {
            if (Character.isDigit(chars[i]) && !Character.isDigit(chars[i + 1])) {
                dartResultsLength++;
            }
        }

        String[] dartResults = new String[dartResultsLength];

        for (int i = 0; i < chars.length; i++) {
            dartResults[dartResultsIndex] += String.valueOf(chars[i]);

            if (i < chars.length - 1) {
                if (Character.isDigit(chars[i + 1]) || (Character.isDigit(chars[i + 1]) && Character.isDigit(chars[i + 2]))) {
                    dartResultsIndex++;
                }
            }
        }

        for (String result : dartResults) {
            result = result.replaceAll("null", "");

            for (int i = 0; i < result.length(); i++) {
                switch (result.charAt(i)) {
                    //case "S" -> result.charAt(i - 1) * result.charAt(i - 1);

                }
            }
        }

        return answer;
    }

    public int betterSolution(String dartResult) {
        int answer = 0;
        int i = 0;

        while (i < dartResult.length()) {
            int result = 0;

            if (Character.isDigit(dartResult.charAt(i))) {
                // 정수 10 체크
                if (i + 1 < dartResult.length() && dartResult.charAt(i) == '1' && dartResult.charAt(i + 1) == '0') {
                    result = 10;
                    i += 2;
                }
                else {
                    result = dartResult.charAt(i) - '0';
                    i++;
                }
            }

            if (i < dartResult.length()) {
                char bonus = dartResult.charAt(i);
                if (bonus == 'S') {
                    result = (int) Math.pow(result, 1);
                } else if (bonus == 'D') {
                    result = (int) Math.pow(result, 2);
                } else if (bonus == 'T') {
                    result = (int) Math.pow(result, 3);
                }
                i++;
            }

            // Check for option
            if (i < dartResult.length()) {
                char option = dartResult.charAt(i);
                if (option == '*' || option == '#') {
                    if (option == '*') {
                        result *= 2;
                    } else if (option == '#') {
                        result *= -1;
                    }
                    i++;
                }
            }

            answer += result;
        }

        return answer;
    }

    public static void main(String[] args) {
//        System.out.println(new DartGame().solution("1S2D*3T"));
//        System.out.println(new DartGame().solution("1D2S#10S"));
//        System.out.println(new DartGame().solution("1D2S0T"));
//        System.out.println(new DartGame().solution("1S*2T*3S"));
//        System.out.println(new DartGame().solution("1D#2S*3S"));
//        System.out.println(new DartGame().solution("1T2D3D#"));
//        System.out.println(new DartGame().solution("1D2S3T*"));
        System.out.println("\n");
        System.out.println(new DartGame().betterSolution("1S2D*3T"));
        System.out.println(new DartGame().betterSolution("1D2S#10S"));
        System.out.println(new DartGame().betterSolution("1D2S0T"));
        System.out.println(new DartGame().betterSolution("1S*2T*3S"));
        System.out.println(new DartGame().betterSolution("1D#2S*3S"));
        System.out.println(new DartGame().betterSolution("1T2D3D#"));
        System.out.println(new DartGame().betterSolution("1D2S3T*"));
    }

}