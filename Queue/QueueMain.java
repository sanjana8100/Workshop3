package com.bridgelabz.Queue;

public class QueueMain {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();

        queue.enqueue(30);
        queue.enqueue(90);
        queue.enqueue(70);

        queue.display();

        Integer data= queue.dequeue();
        if(data != null)
            System.out.println("The dequeued element is: "+data);
        else
            System.out.println("The queue is EMPTY!");

        queue.display();
    }
}
