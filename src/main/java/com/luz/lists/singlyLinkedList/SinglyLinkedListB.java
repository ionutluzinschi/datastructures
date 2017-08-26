package com.luz.lists.singlyLinkedList;

/**
 * Created by ionut on 8/9/2017.
 */
public class SinglyLinkedListB<E> {
    private class Node<E>{
        private E element;
        private Node<E> next;
        public Node(E e, Node<E> n){
            element = e;
            next = n;
        }
        public E getElement() { return element; }
        public Node<E> getNext() { return next; }
        public void setNext(Node<E> n) { next = n; }
    }

    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;
    public SinglyLinkedListB() {}
    public int size() {return size;}
    public boolean isEmpty() {return 0 == size;}
    public E first() {
        if(isEmpty()) return null;
        return head.getElement();
    }
    public E last() {
        if(isEmpty()) return null;
        return tail.getElement();
    }
    public void addFirst(E e){
        Node<E> newest = new Node<>(e, head);
        newest.setNext(head);
        head = newest;
        if(size == 0){
            tail = head;
        }
        size++;
    }
    public void addLast(E e) {
        Node<E> last = new Node<>(e, null);
        if(isEmpty()){
            head = last;
        } else {
            tail.setNext(last);
        }
        tail = last;
        size++;
    }
    public E removeFirst() {
        if(isEmpty()) return null;
        E answer = head.getElement();
        head = head.getNext();
        size--;
        if(size == 0){
            tail = null;
        }
        return answer;
    }
}
