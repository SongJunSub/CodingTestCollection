package collection.codingtest.typesummary.c001_tutorial;

import java.util.ArrayList;
import java.util.HashMap;
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

    /*
        문제 접근
        HashMap을 사용해서 배열에 들어있는 숫자를 키, 숫자의 등장 횟수를 값으로 저장한다.
        숫자의 등장 횟수가 1인 키값을 찾아서 리턴한다.

        시간 복잡도 : O(n) + O(n) => O(2n) => O(n)
        공간 복잡도 : O(n)
         - HashMap 사이즈가 배열의 크기만큼 늘어날 수 있기 때문에 O(n)이다.
     */
    public int solutionWithHashMap(int[] numbers) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // 시간 복잡도 O(n)
        for(int number : numbers){
            // HashMap은 해시 코드를 사용해서 get하기 때문에 전부 다 순회하지 않으므로 시간 복잡도는 O(1)
            map.put(number, map.getOrDefault(number, 0) + 1);
        }

        // 시간 복잡도 O(n)
        for(int number : numbers) {
            if(map.get(number) == 1) {
                System.out.println(number);

                return number;
            }
        }

        return 0;
    }

    /*
        문제 접근
        XOR 비트 연산자 (^)를 사용하는 방법이다.
        XOR 비트 연산자 : 두 비트가 서로 다를 때 1

        5 ^ 0 = 5
        101
        000
        ---
        101 => 5

        5 ^ 5 = 0
        101
        101
        ---
        000 => 0

        1 ^ 5 ^ 1 = (1 ^ 1) ^ 5 = 0 ^ 5 = 5

        시간 복잡도 : O(n)
        공간 복잡도 : O(1)
     */

    public int solutionWithXOR(int[] numbers) {
        int uniqueNumber = 0;

        for(int number : numbers) {
            uniqueNumber ^= number;
        }

        return uniqueNumber;
    }

    public static void main(String[] args) {
        FindAUniqueNumber findAUniqueNumber = new FindAUniqueNumber();

        findAUniqueNumber.solutionWithList(new int[]{2, 3, 1, 3, 2});
        findAUniqueNumber.solutionWithHashMap(new int[]{2, 3, 1, 3, 2});
        findAUniqueNumber.solutionWithXOR(new int[]{2, 3, 1, 3, 2});
    }

}