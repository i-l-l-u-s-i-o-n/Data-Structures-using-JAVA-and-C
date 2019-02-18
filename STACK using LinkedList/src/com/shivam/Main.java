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


        stack.push("This");
        stack.push("is working");
        stack.push("STACK");
        stack.size();
        stack.size();

        stack.show();
    }
}
