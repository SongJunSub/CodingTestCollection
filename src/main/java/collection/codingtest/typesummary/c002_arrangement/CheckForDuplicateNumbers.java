package collection.codingtest.typesummary.c002_arrangement;

/*
    문제 설명
    숫자로 구성된 배열이 주어졌을 때 그 배열에 중복된 숫자가 있는지 확인하는 함수를 작성하세요.
    중복된 숫자가 있다면 true, 없다면 false를 return 하세요.

    예시 1
    1 2 3 4 5 6 => false

    예시 2
    1 2 3 1 => true
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class CheckForDuplicateNumbers {

    public boolean mySolution(int[] numbers) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int number : numbers) {
            map.put(number, map.getOrDefault(number, 0) + 1);
        }

        for(int number : numbers) {
            if(map.get(number) > 1) {
                System.out.println("true");
                return true;
            }
        }

        System.out.println("false");
        return false;
    }

    // 시간 복잡도 : O(n²)
    // 공간 복잡도 : O(1)
    public boolean solution1(int[] numbers) {
        // 시간 복잡도 O(n)
        for (int i=0; i<numbers.length; i++) {
            // 시간 복잡도 O(n)
            for(int j=i+1; j<numbers.length; j++) {
                if(numbers[i] == numbers[j]) {
                    System.out.println("true");
                    return true;
                }
            }
        }

        System.out.println("false");
        return false;
    }

    // 시간 복잡도 : O(NlogN)
    // 공간 복잡도 : O(logN)
    public boolean solution2(int[] numbers) {
        // 시간 복잡도 : O(NlogN)
        // 공간 복잡도 : O(logN)
        Arrays.sort(numbers);

        // 시간 복잡도 O(n)
        for(int i=0; i<numbers.length-1; i++) {
            if(numbers[i] == numbers[i + 1]) {
                System.out.println("true");
                return true;
            }
        }

        System.out.println("false");
        return false;
    }

    public boolean solution3(int[] numbers) {
        // 시간 복잡도 : O(1)
        Set<Integer> numberSet = new HashSet<>();

        for (int number : numbers) {
            if(numberSet.contains(number)) {
                System.out.println("true");
                return true;
            }
            else {
                numberSet.add(number);
            }
        }

        System.out.println("false");
        return false;
    }

    public static void main(String[] args) {
        CheckForDuplicateNumbers checkForDuplicateNumbers = new CheckForDuplicateNumbers();

        checkForDuplicateNumbers.mySolution(new int[]{1, 2, 3, 4, 5 ,6});
        checkForDuplicateNumbers.mySolution(new int[]{1, 2, 3, 1});

        checkForDuplicateNumbers.solution1(new int[]{1, 2, 3, 4, 5 ,6});
        checkForDuplicateNumbers.solution1(new int[]{1, 2, 3, 1});

        checkForDuplicateNumbers.solution2(new int[]{1, 2, 3, 4, 5 ,6});
        checkForDuplicateNumbers.solution2(new int[]{1, 2, 3, 1});

        checkForDuplicateNumbers.solution3(new int[]{1, 2, 3, 4, 5 ,6});
        checkForDuplicateNumbers.solution3(new int[]{1, 2, 3, 1});
    }

}