package com.luz.lists.doublyLinkedList;

/**
 * Created by ionut on 8/9/2017.
 */
public class DoublyLinkedList<E> {
    private class Node<E> {
        private E element;
        private Node<E> next;
        private Node<E> previous;
        public Node(E e, Node<E> n, Node<E> p){
            element = e;
            next = n;
            previous = p;
        }
        public void setNext(Node<E> n) {
            next = n;
        }
        public void setPrevious(Node<E> p) {
            previous = p;
        }
        public E getElement(){
            return element;
        }
        public Node<E> getNext(){
            return next;
        }
        public Node<E> getPrevious() {
            return previous;
        }
    }

    private Node<E> header;
    private Node<E> trailer;
    private int size = 0;
    public DoublyLinkedList() {
        header = new Node<E>(null, null, null);
        trailer = new Node<>(null, header, null);
        header.setNext(trailer);
    }
    public int size(){
        return size;
    }
    public boolean isEmpty() { return 0 == size; }
    public E first() {
        if(isEmpty()) return null;
        return header.getNext().getElement();
    }
    public E last() {
        if(isEmpty()) return null;
        return trailer.getPrevious().getElement();
    }
    private void addBetween(E e, Node<E> predecessor, Node<E> successor){
        Node<E> newest = new Node<>(e, predecessor, successor);
        predecessor.setNext(newest);
        successor.setPrevious(newest);
        size++;
    }
    public void addFirst(E e) {
        addBetween(e, header, header.getNext());
    }
    public void addLast(E e) {
        addBetween(e, trailer.getPrevious(), trailer);
    }
    private E remove(Node<E> node){
        Node<E> predecessor = node.getPrevious();
        Node<E> successor = node.getNext();
        predecessor.setNext(successor);
        successor.setPrevious(predecessor);
        size--;
        return node.getElement();
    }
    public E removeFirst(){
        if(isEmpty()) return null;
        return remove(header.getNext());
    }
    public E removeLast() {
        if(isEmpty()) return null;
        return remove(trailer.getPrevious());
    }
}
