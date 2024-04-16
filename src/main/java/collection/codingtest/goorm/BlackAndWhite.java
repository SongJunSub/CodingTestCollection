package collection.codingtest.goorm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BlackAndWhite {

    public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] firstInput = br.readLine().split(" ");
        String[] secondInput = br.readLine().split(" ");
        int[] tempArray = new int[Integer.parseInt(firstInput[1])];
        int count = 0;

        Arrays.sort(secondInput);

        for(int i=0; i<Integer.parseInt(firstInput[1]); i++){
            tempArray[i] = Integer.parseInt(secondInput[i]);
            tempArray[i] = Integer.parseInt(secondInput[0]);
            count++;

            int tempLength = Integer.parseInt(firstInput[0]) - tempArray.length - 1;
            System.out.println(tempArray.length);
        }
        //System.out.println();
    }

}