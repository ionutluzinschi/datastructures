package com.luz.stacks.LinkedStack;

import com.luz.lists.singlyLinkedList.SinglyLinkedList;
import com.luz.stacks.Stack;

/**
 * Created by ionut on 8/10/2017.
 */
public class LinkedStack<E> implements Stack<E> {
    private SinglyLinkedList<E> list = new SinglyLinkedList<>();
    public LinkedStack() {}
    public int size() { return list.size();}
    public boolean isEmpty() { return list.isEmpty(); }
    public void push(E element) {list.addFirst(element); }
    public E top() {return list.first(); }
    public E pop() { return list.removeFirst(); }
}
