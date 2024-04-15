package collection.codingtest.goorm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SelectAProblem {

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int problemCount = Integer.parseInt(br.readLine());
        String[] problemList = br.readLine().split(" ");

        Arrays.sort(problemList);

        int count = 0;
        int init = Integer.parseInt(problemList[0]);

        for(int i=0; i<problemCount; i++){
            if(init != Integer.parseInt(problemList[i])) count++;
            else if(count == 2) break;

            init = Integer.parseInt(problemList[i]);
        }

        if(count < 2) System.out.print("NO");
        else System.out.print("YES");

        br.close();
    }

}
