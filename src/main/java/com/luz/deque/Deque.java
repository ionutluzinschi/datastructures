package com.luz.deque;

/**
 * Created by ionut on 8/11/2017.
 */
public interface Deque<E> {
    int size();
    boolean isEmpty();
    E first();
    E last();
    void addFirst(E e);
    void addLast(E e);
    E removeFirst();
    E removeLast();
}
