package com.luz.maps;

import com.luz.priority.Entry;

/**
 * Created by ionut on 8/26/2017.
 */
public interface Map<K,V> {
    int size();
    boolean isEmpty();
    V get(K key);
    V put(K key, V value);
    V remove(K key);
    Iterable<K> keySet();
    Iterable<V> values();
    Iterable<Entry<K,V>> entrySet();
}
