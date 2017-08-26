package com.luz.stacks;

/**
 * Created by ionut on 8/10/2017.
 */
public interface Stack<E> {
    int size();
    boolean isEmpty();
    void push(E e);
    E top();
    E pop();
}
