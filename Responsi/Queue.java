package Responsi;

import java.util.ArrayList;

class Queue<T> {
    protected ArrayList<T> elements;
    
    public Queue() {
        elements = new ArrayList<>();
    }
    
    public void add(T e) {
        elements.add(e);
    }
    
    public void del() {
        if (!isEmpty()) {
            elements.remove(0);
        }
    }
    
    public boolean isEmpty() {
        return elements.isEmpty();
    }
    
    public void cetak() {
        for (T element : elements) {
            System.out.println(element);
        }
    }
    
    public T getHead() {
        if (!isEmpty()) {
            return elements.get(0);
        } else {
            return null;
        }
    }
    
    public T getTail() {
        if (!isEmpty()) {
            return elements.get(elements.size() - 1);
        } else {
            return null;
        }
    }
}
