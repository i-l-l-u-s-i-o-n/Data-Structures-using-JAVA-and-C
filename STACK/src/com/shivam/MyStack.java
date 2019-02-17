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
        for (int i = 0; i <data.length ; i++) {
            data[i]=0;
        }
    }

    // If the user do not specify the size, make stack of size 50!

    public MyStack(){
        data =new Object[50];
        for (int i = 0; i <data.length ; i++) {
            data[i]=0;
        }
    }


    public void push(T item){
        data[top]=item;
        top++;
    }

    public void peek(){
        for( Object item: data ){
            if (!item.equals(0))
            System.out.println(item);
        }
    }

}
