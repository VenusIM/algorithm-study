package Algorithms.자료구조.LinkedList;

import java.util.NoSuchElementException;
import java.util.Objects;

public class SimpleLinkedList<T> {

    private Node<T> head = null;

    private static class Node<T> {

        private T data;
        private Node<T> next = null;

        public Node(T data) {
            this.data = data;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node<?> node = (Node<?>) o;
            return Objects.equals(data, node.data) && Objects.equals(next, node.next);
        }

        @Override
        public int hashCode() {
            return Objects.hash(data, next);
        }

        @Override
        public String toString() {
            return data.toString();
        }
    }

    // Node 추가 메서드
    public void add(T data) {
        // 첫번째 일 경우
        if(head == null) head = new Node<>(data);
        else {
            Node<T> node = this.head;
            while (node.next != null) node = node.next;
            // 마지막 노드를 탐색하여 인스턴스 생성
            node.next = new Node<>(data);
        }
    }

    // 노드 중간 삽입 메서드
    public void add(int index, T data) {
        if(index < 0) throw new IndexOutOfBoundsException("index can't smaller then 0");
        // 0번쨰 index라면 head 변경과 동일
        if(index == 0) {
            addFirst(data);
            return;
        }
        Node<T> temp = search(index);
        Node<T> node = new Node<>(data);
        node.next = temp.next;
        temp.next = node;
    }

    // 노드삭제
    public void remove(int index) {
        if(this.head == null) {
            if(0 < index) throw new IndexOutOfBoundsException("Index bigger then size");
            throw new NoSuchElementException("First Node is Empty");
        }
        // 첫번째 요소라면 헤드를 변경
        if(index == 0) {
            head = head.next;
            return;
        }
        int n = 1;
        Node<T> node = this.head;
        while (n < index) {
            if(node == null) {
                throw new IndexOutOfBoundsException("index bigger then size");
            }
            node = node.next;
            n++;
        }
        node.next = node.next == null ? null : node.next.next;
    }

    public void addFirst(T data) {
        if(this.head == null) throw new IndexOutOfBoundsException("index bigger then size");
        Node<T> node = new Node<>(data);
        node.next = this.head;
        this.head = node;
    }

    public void addLast(T data) {
        add(data);
    }

    public Integer indexOf(T data) {
        if(this.head == null) return null;
        int n = 0;
        Node<T> node = this.head;
        while (node != null) {
            // 노드의 요소와 찾는 요소가 같다면 return
            if (node.data == data) return n;
            node = node.next;
            n++;
        }
        return null;
    }

    // 노드 순회
    private Node<T> search(int index) {
        if(this.head == null) throw new IndexOutOfBoundsException("index bigger then size");
        int n = 1;
        Node<T> node = this.head;
        while (n < index) {
            node = node.next;
            if (node == null) throw new IndexOutOfBoundsException("index bigger then size");
            n++;
        }
        return node;

    }

    @Override
    public String toString() {
        /*
        배열의 형식 구성
        ex) [1, 2, 3, ... , n]
        */
        StringBuilder stringBuilder = new StringBuilder("[");
        Node<T> node = this.head;
        stringBuilder.append(node);
        while (node.next != null) {
            //모든 노드 탐색
            node = node.next;
            stringBuilder.append(", ").append(node);
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}