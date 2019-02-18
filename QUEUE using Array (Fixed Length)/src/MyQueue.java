/**
 * created by Shivam on 18-02-2019.
 */
public class MyQueue<T> {

    Object queue[];

    int front;
    int rear;
    int size;

    public MyQueue() {
        this.size = 0;
        front=0;
        rear=0;
        queue=new Object[5];
    }

    public void enqueue(T item){


        if (queue[rear]==null){
            queue[rear]=item;
            rear=(rear+1)%5;
            size++;
            return;
        }
        System.out.println("Queue is FULL");

    }


    public void dequeue(){

        System.out.println("\nDeleted Element : "+queue[front]);
        queue[front]=null;
        front=(front+1)%5;
        size--;

    }
    public void show(){
        for(Object item:queue){
            if (item!=null)
                System.out.print(item+"\t");
        }

    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }

}
