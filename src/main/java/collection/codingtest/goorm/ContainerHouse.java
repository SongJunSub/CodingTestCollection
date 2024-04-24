package collection.codingtest.goorm;

/*
    어떤 회사는 컨테이너를 보관하기 위한 하우스를 갖고 있습니다. 이 하우스에는 여러 개의 서랍이 있고, 각 서랍은 정해진 크기의 컨테이너를 보관할 수 있습니다.
    각 컨테이너는 크기를 가지고 있으며, 이 크기는 양의 정수로 표현됩니다. 또한, 각 서랍에는 정해진 크기의 컨테이너를 보관할 수 있는 무게 제한이 있습니다.
    이 회사는 최대한 많은 컨테이너를 보관하기 위해 가능한 많은 서랍을 사용하려고 합니다.
    각 서랍에는 정확히 하나의 컨테이너만 보관할 수 있으며, 한 서랍에 보관된 컨테이너의 크기는 해당 서랍의 무게 제한보다 작거나 같아야 합니다.
    이 회사는 보관할 수 있는 최대 컨테이너 수를 구하는 프로그램을 작성하려고 합니다.
    입력으로는 서랍의 수(N), 각 서랍의 무게 제한, 컨테이너의 수(M), 각 컨테이너의 크기가 주어집니다.
    프로그램은 보관할 수 있는 최대 컨테이너 수를 출력해야 합니다.

    예시:
    입력:
    4
    25 30 35 20
    5
    20 25 30 35 40
    출력:
    3

    해당 문제를 해결하기 위해서는 각 서랍의 무게 제한과 컨테이너의 크기를 비교하여 가능한 최대한 많은 컨테이너를 보관할 수 있는 서랍을 찾아야 합니다.
    선택된 서랍에 보관할 수 있는 컨테이너의 수를 출력합니다.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ContainerHouse {

    public static void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int drawerCount = Integer.parseInt(br.readLine());
        String[] drawerSplit = br.readLine().split(" ");
        int[] weightLimit = new int[drawerCount];

        for(int i=0; i<drawerCount; i++){
            weightLimit[i] = Integer.parseInt(drawerSplit[i]);
        }

        int containerCount = Integer.parseInt(br.readLine());
        String[] containerSplit = br.readLine().split(" ");
        int[] containerSize = new int[containerCount];

        for(int i=0; i<containerCount; i++){
            containerSize[i] = Integer.parseInt(containerSplit[i]);
        }

        Arrays.sort(weightLimit);
        Arrays.sort(containerSize);

        int result = 0;
        int index = 0;

        for(int i=0; i<drawerCount; i++){
            while(index < containerCount && containerSize[index] <= weightLimit[i]){
                result++;
                index++;
            }
        }

        System.out.println(result);
    }

    public static void main(String[] args) throws IOException {
        solution();
    }

}