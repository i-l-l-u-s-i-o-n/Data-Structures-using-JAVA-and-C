package com.shivam.queue;

/**
 * created by Shivam on 19-02-2019.
 */
public class MyLinkedList<T> {

    Node head;
    int length=0;

    public MyLinkedList() {
        this.head = null;
    }

    public void insertAtLast(T item){

        Node node=new Node();
        node.item=item;
        node.next=null;

        if (head==null){
            length++;
            head=node;
            return;
        }

        Node temp=head;

        while(temp.next!=null){
            temp=temp.next;
        }

        temp.next=node;
        length++;
    }


    public void removeFromStart(){

        if (head==null){
            System.out.println("QUEUE is EMPTY !");
            return;
        }

        System.out.println("Successfully Deleted : "+head.item);

        head=head.next;
        length--;
    }

    public void show(){

        Node temp=head;

        int count=1;
        String index = null;
        System.out.println("=============================QUEUE ELEMENTS============================");
        while (temp!=null){



            index= count==1 ? "[FRONT]" : (count==getSize() ? "[REAR]" : "["+count+"]");

            System.out.println("\t"+index+"\t"+temp.item);
            temp=temp.next;
            count++;
        }
        System.out.println("========================================================================");

    }
    public int getSize(){
        return length;
    }
}
