package collection.codingtest.inflearn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class JumongsOrder {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());

        for(int i=0; i<N; i++){
            A[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        Arrays.sort(A);

        int count = 0;
        int i = 0; //Min
        int j = N - 1; //Max

        while(i < j){
            if(A[i] + A[j] < M) i++;
            else if(A[i] + A[j] > M) j--;
            else{
                count++;
                i++;
                j--;
            }
        }

        System.out.println(count);
    }

    public static void main(String[] args) throws IOException {
        solution();
    }

}