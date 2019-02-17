package com.shivam;

/**
 * created by Shivam on 17-02-2019.
 */
public class MyStack<T> {

    private Object [] data;
    int top=0;


    // Giving user, the ability to specify the SIZE of stack at time of creating Object of MyStack!!

    public MyStack(int size) {
        data=new Object[size];
    }

    // If the user do not specify the size, make stack of size 50!

    public MyStack(){
        data =new Object[50];
    }


    public void push(T item){

        //Checking OVERFLOW condition ->
        if (top>= data.length){
            System.out.println("Stack is FULL.");
            return;
        }


        data[top]=item;
        top++;
    }


    public void pop(){


        // Checking UNDERFLOW condition ->
        if (isEmpty()){
            System.out.println("Stack is EMPTY");
            return;
        }


        top--;
        System.out.println("Deleted Element : \t"+data[top]);
        data[top]=null;


    }

    public void peek(){
        System.out.println("Top Element : \t\t"+data[top-1]);
    }

    public void show(){
        for( Object item: data ){
            if (item !=null){
                System.out.println("\t"+item);
            }
        }
    }

    public boolean isEmpty(){
        return top<=0;
    }

}
