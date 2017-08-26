package com.luz.priority;

import com.luz.DefaultComparator;

import java.util.Comparator;

/**
 * Created by ionut on 8/23/2017.
 */
public abstract class AbstractPriorityQueue<K,V> implements PriorityQueue<K,V> {

    protected static class PQEntry<K, V> implements Entry<K, V> {
        private K k;
        private V v;
        public PQEntry(K key, V value){
            k = key;
            v = value;
        }
        public K getKey() { return k;}
        public V getValue() { return v;}
        protected void setKey(K key) { k = key;}
        protected void setValue(V value) { v = value;}
    }

    private Comparator<K> comp;
    protected AbstractPriorityQueue(Comparator<K> c) { comp = c;}
    protected AbstractPriorityQueue() { this(new DefaultComparator<K>());}
    protected int compare(Entry<K,V> a, Entry<K,V> b){
        return comp.compare(a.getKey(),b.getKey());
    }
    protected boolean checkKey(K key) throws IllegalArgumentException {
        try {
            return (comp.compare(key, key) == 0);
        } catch (ClassCastException e) {
            throw new IllegalArgumentException("incompatible key");
        }
    }
    public boolean isEmpty() { return size() == 0;}
}