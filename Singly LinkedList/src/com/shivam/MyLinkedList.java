package com.shivam;

/**
 * created by Shivam on 17-02-2019.
 */

// Here we are making a generic class so that our linked list can store objects of different data types.!!!!!!!


public class MyLinkedList<T> {

    private Node head;

    public MyLinkedList() {
        this.head = null;
    }

    public void insert(T item){

        // Creating a new node .
        Node node=createNewNode(item);

        if (head == null){

            // Setting as first element.
            head=node;
            return;
        }

        Node temp=head;

        while(temp.next!=null){
            temp=temp.next;
        }

        temp.next=node;
    }



    public void insertAtStart(T item){

        // Creating a new node .
        Node node = createNewNode(item);

        if (head==null){

            // If empty list the,
            node.next=null;
            head=node;
            return;
        }

        // Making the newly inserted node, the HEAD.
        node.next=head;
        head=node;

    }


    public void insertAtIndex(int index, T item){

        Node node=createNewNode(item);


        if (index==0){
            insertAtStart(item);
            return;
        }

        int count=1;

        Node temp=head;

        while(count<index && temp!=null ){

            count++;
            temp=temp.next;

        }

        if (count==index){
            node.next=temp.next;
            temp.next=node;
        }
        else{
            insert(item);
            System.out.println("Index exceeded the no. of elements, so item is inserted at last !");
        }

    }


    public void deleteAtIndex(int index){

        if (index==0){
            head=head.next;
            return;
        }

        Node temp=head;

        for(int i=0;(i<index-1 && temp!=null);i++){
            temp=temp.next;
        }

        if (temp!=null){
            temp.next=temp.next.next;
        }else {
            System.out.println("Invalid Index : (");
        }

    }


    // To delete objects of user defined class, we need to override .equals() to match the item.

    public void delete(T item){

        if (item.equals(head.item)){
            head=head.next;
            return;
        }

        Node temp=head.next;

        while (temp.item!=item && temp.next!=null){
            temp=temp.next;
        }

        if (temp.item.equals(item)){
            temp.next=temp.next.next;
        }
        else{
            System.out.println("Item not found");
        }

    }



    private Node createNewNode(T item){

        Node node=new Node();
        node.item=item;
        node.next=null;
        return node;

    }

    public void show(){
        Node temp=head;
        while (temp!=null){
            System.out.println(temp.item);
            temp=temp.next;
        }
    }

}
