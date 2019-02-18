package com.shivam;

import com.shivam.stack.MyStack;

public class Main {

    public static void main(String[] args) {

        MyStack<String> stack=new MyStack<>();

        stack.push("Hey ");
        stack.push("There !");
        stack.peek();

        stack.show();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.push("Hey ");
        stack.push("There !");
        stack.show();
        stack.size();

//        stack.push(22);        It won't work as We declared Type of Stack to be String and passing a integer.

        stack.push("This");
        stack.push("is working");
        stack.push("STACK");
        stack.size();

        stack.show();
    }


}


// OUTPUT ->
/*
Successfully Inserted : Hey
Successfully Inserted : There !
Top element : There !

======================STACK ELEMENTS====================

	[2]   There !
	[1]   Hey

=======================================================

Successfully deleted : There !
Successfully deleted : Hey
STACK is EMPTY !!
STACK is EMPTY !!
STACK is EMPTY !!
Successfully Inserted : Hey
Successfully Inserted : There !

======================STACK ELEMENTS====================

	[2]   There !
	[1]   Hey

=======================================================

Top is : 2
Successfully Inserted : This
Successfully Inserted : is working
Successfully Inserted : STACK
Top is : 5

======================STACK ELEMENTS====================

	[5]   STACK
	[4]   is working
	[3]   This
	[2]   There !
	[1]   Hey

=======================================================
 */
