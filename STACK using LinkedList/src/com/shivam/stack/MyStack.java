package com.shivam.stack;


/**
 * created by Shivam on 18-02-2019.
 */
public class MyStack<T>{

    MyLinkedList<T>  list;

    public MyStack(){
        list=new MyLinkedList<T>();
    }

    public void push(T item){
        list.insertAtStart(item);
        System.out.println("Successfully Inserted : "+item);
    }


    public void pop(){

        T deleted=list.removeFromStart();

        if (deleted==null){
            System.out.println("STACK is EMPTY !!");
            return;
        }
        System.out.println("Successfully deleted : "+deleted);
    }


    public void peek(){
        System.out.println("Top element : "+list.getHead().item);
    }

    public void size(){
        System.out.println("Top is : "+list.length);
    }

    public void show(){
        list.show();
    }


}
