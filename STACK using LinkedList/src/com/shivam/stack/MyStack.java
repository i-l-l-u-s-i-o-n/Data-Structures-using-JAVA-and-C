package com.shivam.stack;

import com.shivam.stack.MyLinkedList;

/**
 * created by Shivam on 18-02-2019.
 */
public class MyStack<T> extends MyLinkedList{

    MyLinkedList<T> list=new MyLinkedList<>() ;



    public void push(Object item){
        list.insertAtStart(item);
        System.out.println("Inserted : "+item);
    }


    public void pop(){

        Object deleted=list.removeFromStart();

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
