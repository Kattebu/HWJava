package sem4;

import java.util.LinkedList;
import java.util.Scanner;

public class task1 {
    //https://leetcode.com/problems/reverse-linked-list/
    public static void main(String[] args) {
        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            integerLinkedList.add(scanner.nextInt());
        }
        scanner.close();
        System.out.println("1 " + integerLinkedList.peek());
        System.out.println("integerLinkedList = " + integerLinkedList);
        System.out.println("2 " + integerLinkedList.pop());
        System.out.println("integerLinkedList = " + integerLinkedList);
        integerLinkedList.addFirst((3));
        System.out.println("integerLinkedList = " + integerLinkedList);
        integerLinkedList.addLast((5));
        System.out.println("integerLinkedList = " + integerLinkedList);
        integerLinkedList.add(integerLinkedList.size()/2, 10);
        System.out.println("integerLinkedList = " + integerLinkedList);
        integerLinkedList.remove((Integer) 10);
        System.out.println("integerLinkedList = " + integerLinkedList);
        System.out.println("integerLinkedList.contains(5) = " + integerLinkedList.contains(5));
        integerLinkedList.poll();
        System.out.println("integerLinkedList = " + integerLinkedList);
        if (integerLinkedList.get(0) instanceof Integer){
            System.out.println("точно число");
        }
        System.out.println("integerLinkedList.get(0).getClass().getName() = " + integerLinkedList.get(0).getClass().getName());
    }
}
