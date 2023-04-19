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

    public E remove(int index) {
        if(index >= data.length || index < 0)
            throw new IndexOutOfBoundsException();

        E previous = (E) data[index];

        Object[] newData = new Object[data.length - 1];
        for(int i = 0; i < index; i++) {
            newData[i] = data[i];
        }
        for(int i = index+1; i < data.length; i++) {
            newData[i - 1] = data[i];
        }

        data = newData;

        return previous;
    }

    public boolean contains(Object o) {
        for(Object value : data) {
            if(value.equals(o))
                return true;
        }

        return false;
    }

    public int indexOf(Object o) {
        for(int i = 0; i < data.length; i++) {
            if(data[i].equals(o))
                return i;
        }

        return -1;
    }

    public boolean isEmpty(){
        if(data == null || data.length == 0)
            return true;

        return false;
    }

    public void clear (){
        data = new Object[0];
    }
}
