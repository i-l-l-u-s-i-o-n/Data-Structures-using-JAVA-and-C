package com.shivam;
/**
 * created by Shivam on 17-02-2019.
 */

// Stack - LIFO (Last in First out).

/*
Methods->
push() -> add element to the stack.
pop() -> returns and remove the top most element from the stack.
peek() -> returns the top most element ( doesn't delete element).
We can implement stack using Array (Fixed length or dynamic) OR LinkedList.
 */


public class Main {

    public static void main(String[] args) {

        MyStack<S> stack=new MyStack<>(5);

        stack.pop();
        stack.push(new S(101,"Shivam"));
        stack.push(new S(102,"Shivam"));
        stack.push(new S(103,"Tim"));
        stack.push(new S(104,"Steele"));
        stack.push(new S(104,"Robert"));
        stack.push(new S(104,"Colt"));

        stack.show();
        stack.peek();


        stack.pop();

        stack.show();
        stack.peek();
    }
    private static class S{

        int rollNo;
        String name;

        public S(int rollNo, String name) {
            this.rollNo = rollNo;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Roll No : "+ rollNo +"     "+"Name : "+name;
        }
    }
}

// OUTPUT ->

/*
Stack is EMPTY
Stack is FULL.
	Roll No : 101     Name : Shivam
	Roll No : 102     Name : Shivam
	Roll No : 103     Name : Tim
	Roll No : 104     Name : Steele
	Roll No : 104     Name : Robert
Top Element : 		Roll No : 104     Name : Robert
Deleted Element : 	Roll No : 104     Name : Robert
	Roll No : 101     Name : Shivam
	Roll No : 102     Name : Shivam
	Roll No : 103     Name : Tim
	Roll No : 104     Name : Steele
Top Element : 		Roll No : 104     Name : Steele
*/