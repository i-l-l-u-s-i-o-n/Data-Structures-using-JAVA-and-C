package com.shivam;



// Stack - LIFO (Last in First out).

/*

Methods->

push() -> add element to the stack.

pop() -> returns and remove the top most element from the stack.

peek() -> returns the top most element ( doesn't delete element).


We can implement stack using Array (Fixed length or dynamic) OR LinkedList.

 */



import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        MyStack<String> stack=new MyStack<>(10);

        stack.push("Shivam");
        stack.push("Shukla");
        stack.peek();
    }
}
