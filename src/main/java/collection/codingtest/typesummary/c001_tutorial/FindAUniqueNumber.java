package collection.codingtest.typesummary.c001_tutorial;

import java.util.ArrayList;
import java.util.List;

/*
    numbers라는 int형 배열이 있습니다.
    해당 배열에 들어있는 숫자들은 오직 한 숫자를 제외하고는 모드 두 번씩 들어있습니다.
    오직 한 번만 등장하는 숫자를 찾는 코드를 작성해 주세요.
 */

public class FindAUniqueNumber {

    /*
        문제 접근
        List를 만들고 배열에 있는 숫자를 순회하면서 해당 숫자가 List에 들어있는지 확인한다.
        List에 들어있으면 List에서 빼내고, 없으면 넣는다.
        그럼 결과적으로 List에는 유일한 숫자만 들어있으니 해당 숫자를 꺼내서 리턴한다.

        시간 복잡도 : O(n) * O(n) = O(n²)
        공간 복잡도 : O(n)
     */
    public int solutionWithList(int[] numbers) {
        List<Integer> list = new ArrayList<>();

        // 시간 복잡도 O(n)
        for(int number : numbers){
            // contains는 리스트를 전부 다 순회해야 하므로 시간 복잡도 O(n)
            if(list.contains(number)) list.remove((Integer) number);
            else list.add(number);
        }

        System.out.println(list.get(0));

        return list.get(0);
    }

    public static void main(String[] args) {
        FindAUniqueNumber findAUniqueNumber = new FindAUniqueNumber();

        findAUniqueNumber.solutionWithList(new int[]{2, 3, 1, 3, 2});
    }

}