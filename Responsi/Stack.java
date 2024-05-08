package Responsi;

import java.util.ArrayList;

class Stack<T> {
    protected ArrayList<T> elements;
    
    public Stack() {
        elements = new ArrayList<>();
    }
    
    public void add(T e) {
        elements.add(e);
    }
    
    public void del() {
        if (!isEmpty()) {
            elements.remove(elements.size() - 1);
        }
    }
    
    public boolean isEmpty() {
        return elements.isEmpty();
    }
    
    public void cetak() {
        for (int i = elements.size() - 1; i >= 0; i--) {
            System.out.println(elements.get(i));
        }
    }
    
    public T getTop() {
        if (!isEmpty()) {
            return elements.get(elements.size() - 1);
        } else {
            return null;
        }
    }
}