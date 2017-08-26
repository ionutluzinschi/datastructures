package com.luz.queues;

/**
 * Created by ionut on 8/10/2017.
 */
public interface Queue<E> {
    int size();
    boolean isEmpty();
    void enqueue(E e);
    E first();
    E dequeue();
}
