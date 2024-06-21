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

    public static void main(String[] args) {
        System.out.println(new DartGame().solution("1S2D*3T"));
//        System.out.println(new DartGame().solution("1D2S#10S"));
//        System.out.println(new DartGame().solution("1D2S0T"));
//        System.out.println(new DartGame().solution("1S*2T*3S"));
//        System.out.println(new DartGame().solution("1D#2S*3S"));
//        System.out.println(new DartGame().solution("1T2D3D#"));
//        System.out.println(new DartGame().solution("1D2S3T*"));
    }

}