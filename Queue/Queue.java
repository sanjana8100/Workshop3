package com.bridgelabz.Queue;

public class Queue<T> {
    LinkedList<T> linkedList = new LinkedList<>();

    public void enqueue(T data){
        linkedList.add(data);
    }

    public T dequeue(){
        return linkedList.pop();
    }

    public void display(){
        linkedList.show();
    }
}
