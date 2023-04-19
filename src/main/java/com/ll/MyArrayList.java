package com.ll;

import java.util.ArrayList;

public class MyArrayList<E> {

    private Object[] data;

    public MyArrayList() {
        data = new Object[0];
    }

    public boolean add(E e) {
        Object[] newData = new Object[data.length + 1];
        for(int i = 0; i < data.length; i++)
            newData[i] = data[i];
        newData[newData.length - 1] = e;
        data = newData;

        return true;
    }

    public int size() {
        return data.length;
    }

    public E get(int index) {
        if(index >= data.length || index < 0)
            throw new IndexOutOfBoundsException();
        return (E) data[index];
    }
}
