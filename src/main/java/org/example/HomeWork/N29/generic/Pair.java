package org.example.HomeWork.N29.generic;

public class Pair<T,V> {
    T key;
    V value;
    Pair(T key,V value){
        this.key = key;
        this.value = value;
    }

    public void setKey(T key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public T getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
