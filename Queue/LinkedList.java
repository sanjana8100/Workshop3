package com.bridgelabz.Queue;

public class LinkedList<T> {
    Node<T> head;
    Node<T> tail;

    public void add(T data){
        Node<T> newNode = new Node<>(data);
        if(head == null){
            head= newNode;
        } else {
            tail.next= newNode;
        }
        tail= newNode;
    }

    public T pop(){
        if(head == null)
            return null;
        T popData= head.data;
        head= head.next;
        return popData;
    }

    public void show(){
        Node<T> temp= head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp= temp.next;
        }
        System.out.println();
    }
}
