package com.shivam.stack;


/**
 * created by Shivam on 18-02-2019.
 */
public class MyLinkedList<T> {

    private Node<T> head;

    protected static int length=0;

    protected MyLinkedList() {
        head=null;
    }

    protected void insertAtStart(T item){

        Node node=new Node();
        node.item =item;
        node.next=null;

        if (head==null){
            head=node;
            length++;
            return;
        }

        node.next=head;
        head=node;
        length++;

    }


    protected T removeFromStart(){

        if (head==null){
            return null;
        }

        T temp=head.item;

        head=head.next;
        length--;
        return temp;

    }


    protected void show(){

        Node<T> temp=head;

        if (temp==null){
            System.out.println("STACK is EMPTY !!");
            return;
        }

        System.out.println("\n======================STACK ELEMENTS====================\n");

        int index=length;

        while (temp!=null){
            System.out.println("\t["+(index--)+"]   "+temp.item);
            temp=temp.next;
        }


        System.out.println("\n=======================================================\n");

    }
    protected Node<T> getHead(){
        return head;
    }

}
