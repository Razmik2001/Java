package org.example.HomeWork.N29.generic;

public class ItemContainer<T> implements Container<T> {
    T item;
    ItemContainer(T item){
        this.item = item;
    }


    @Override
    public T getItem() {
        return item;
    }
}
