package com.luz;

import java.util.Comparator;

/**
 * Created by ionut on 8/23/2017.
 */
public class DefaultComparator<E> implements Comparator<E> {
    public int compare(E a, E b) throws ClassCastException {
        return((Comparable<E>)a).compareTo(b);
    }
}
