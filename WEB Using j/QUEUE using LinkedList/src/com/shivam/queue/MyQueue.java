package com.shivam.queue;

/**
 * created by Shivam on 19-02-2019.
 */
public class MyQueue<T> {

    MyLinkedList<T> queue;

    public MyQueue() {
        this.queue = new MyLinkedList<>();
    }

    public void enqueue(T item){

        queue.insertAtLast(item);

    }

    public void dequeue(){

        queue.removeFromStart();
    }

    public boolean isEmpty(){
        return queue.getSize()==0;
    }

    public void size(){
        System.out.println("Size : "+queue.length);
    }

    public void show(){
        queue.show();
    }
}
