package com.luz.queues;

/**
 * Created by ionut on 8/11/2017.
 */
public interface CircularQueue<E> extends Queue<E> {
    void rotate();
}
