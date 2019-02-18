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
        queue=new Object[10];
    }

    public void enqueue(T item){

        queue[rear]=item;
        rear++;
        size++;
    }


    public void dequeue(){

        System.out.println("Deleted Element : "+queue[front]);
        queue[front]=null;
        front++;

    }
    public void show(){
        for(Object item:queue){
            if (item!=null)
                System.out.println(item);
        }
    }

}
