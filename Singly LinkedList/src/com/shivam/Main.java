package com.shivam;

/**
 * created by Shivam on 17-02-2019.
 */


/*

 Advantages of Linked list ->
---------------------------------------

 We can dynamically add a new element because of no fixed size as in array.
 we can also add element at front or in between two elements without shifting elements as in arrays.



 Disadvantage of linked list ->
----------------------------------------

 Slow in accessing elements ,  and we can't access any no. randomly but in array, random access of number is possible by using INDEX.
 */





public class Main {

    public static void main(String[] args) {

        MyLinkedList<String> list =new MyLinkedList<>();


        list.insert("Hello ");
        list.insertAtStart("============");
        list.insert("This is");
        list.insert("a");
        list.insert("Oops! Wrong Entry. Delete me ......");
        list.insertAtIndex(4,"working");
        list.insert("singly");
        list.insert("LinkedList .");
        list.deleteAtIndex(5);


        list.show();

    }


    // OUTPUT ->

    /*
    ============
    Hello
    This is
    a
    working
    singly
    LinkedList .
     */
}
