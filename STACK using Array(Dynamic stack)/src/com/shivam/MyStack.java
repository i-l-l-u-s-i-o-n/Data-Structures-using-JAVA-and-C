package com.shivam;

/**
 * created by Shivam on 17-02-2019.
 */
public class MyStack<T> {

    private Object [] data;
    int top=0;


    // The user do not need to specify the size!
    // The size will keep increasing 2 times when the stack is full.

    public MyStack(){
        data =new Object[2];
    }


    public void push(T item){

        //Increasing size when OVERFLOW.
        if (top>=data.length){
            expand();           // Increase the size 2 time.
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

        // Halving the size if half of the array space is unused.
        if (top<(data.length/2)){
            shrink();
        }


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




    private void expand(){
        Object [] moreData=new Object[data.length*2];    // Creating the new array of size,twice the size of old array.

        // We can manually copy each element to new array but we have predefined method for this.
        System.arraycopy(data,0,moreData,0,top);

        // Setting reference to newly created array !!!!
        data=moreData;

    }

    private void shrink(){

        // Halving the size of array .

        Object[] lessData=new Object[data.length/2];


//        If we use top as the last parameter, It will specify the length, So array elements will be copied till length-1.
//        So the last element will not be copied as we first decreasing top value then calling shrink().

//        System.arraycopy(data,0,lessData,0,top);

        System.arraycopy(data,0,lessData,0,lessData.length);

        // Setting reference to newly created array !!!!
        data=lessData;
    }

    public int size(){
        return data.length;
    }

}
