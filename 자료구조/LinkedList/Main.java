package Algorithms.자료구조.LinkedList;

public class Main {
    public static void main(String[] args) {

        SimpleLinkedList<Integer> simpleLinkedList = new SimpleLinkedList<>();
        simpleLinkedList.add(4);
        simpleLinkedList.add(0,2);
        simpleLinkedList.add(1,3);
        simpleLinkedList.add(0,3);
        System.out.println(simpleLinkedList);
        simpleLinkedList.addFirst(1);
        simpleLinkedList.addLast(5);
        System.out.println(simpleLinkedList);

        simpleLinkedList.remove(simpleLinkedList.indexOf(3));
        System.out.println(simpleLinkedList);
    }
}
