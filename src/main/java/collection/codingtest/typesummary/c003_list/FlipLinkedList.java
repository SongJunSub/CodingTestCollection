package collection.codingtest.typesummary.c003_list;

import com.fasterxml.jackson.databind.util.LinkedNode;

import java.util.Arrays;
import java.util.LinkedList;

/*
    문제 설명
    단일 연결 리스트를 뒤집는 함수를 구현해주세요.

    예시
    1 -> 2 -> 3 => 3 -> 2 -> 1

    출제 의도
    난이도 : 보통
    연결 리스트 데이터 구조를 이해하고 있는지
    재귀(recursion)와 순회(iteration)을 모두 활용할 수 있는지

    시간 복잡도 : O(n)
    공간 복잡도 : O(1)
 */
public class FlipLinkedList {

    private LinkedNode head;
    private LinkedNode tail;

    private void add(LinkedNode node) {
        if (head == null) {
            head = node;
            tail = node;
        }
        else if (tail != null) {
            tail.next = node;
            tail = tail.next;
        }
    }

    private void reverse() {
        LinkedNode current = this.head;
        LinkedNode previous = null;
        LinkedNode next = null;

        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        this.tail = this.head;
        this.head = previous;
    }

    public int[] solution(int[] numbers) {
        LinkedList list = new LinkedList();

        for (int number : numbers) {
            list.add(new LinkedNode(1));
        }

        return null;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(new FlipLinkedList().solution(new int[]{1, 2, 3})));
    }

}