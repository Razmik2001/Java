package org.example.HomeWork.N28;

public class Box<T>{
    T ob;

    Box(T ob){
        this.ob = ob;
    }

    public T getOb() {
        return ob;
    }

    public void setOb(T ob) {
        this.ob = ob;
    }
}
