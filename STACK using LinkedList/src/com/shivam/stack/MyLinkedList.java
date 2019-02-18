package com.shivam.stack;


/**
 * created by Shivam on 18-02-2019.
 */
public class MyLinkedList<T> {

    private Node head;

    protected static int length=0;

    protected MyLinkedList() {
        head=null;
    }

    protected void insertAtStart(Object item){

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


    protected Object removeFromStart(){

        if (head==null){
            return null;
        }

        Object temp=head.item;

        head=head.next;
        length--;
        return temp;

    }


    protected void show(){

        Node temp=head;


        while (temp!=null){
            System.out.println(temp.item);
            temp=temp.next;
        }

    }
    protected Node getHead(){
        return head;
    }

}
