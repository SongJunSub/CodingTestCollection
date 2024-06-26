package collection.codingtest.inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FindSumOfIntervals {

    public static void solution() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int suNo = Integer.parseInt(stringTokenizer.nextToken());
        int quizNo = Integer.parseInt(stringTokenizer.nextToken());
        long[] sum = new long[suNo + 1];

        stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        for(int i=1; i<=suNo; i++){
            sum[i] = sum[i - 1] + Integer.parseInt(stringTokenizer.nextToken());
        }

        for(int q=0; q<quizNo; q++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int i = Integer.parseInt(stringTokenizer.nextToken());
            int j = Integer.parseInt(stringTokenizer.nextToken());

            System.out.println(sum[j] - sum[i - 1]);
        }

        bufferedReader.close();
    }

    public static void main(String[] args) throws IOException {
        solution();
    }

}