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


        if (!isFull()){
            queue[rear]=item;
            rear=(rear+1)%5;
            size++;
            return;
        }
        System.out.println("Queue is FULL");

    }


    public void dequeue(){

        if(!isEmpty()){
            System.out.println("\nDeleted Element : "+queue[front]);
            queue[front]=null;
            front=(front+1)%5;
            size--;
            return;
        }
        System.out.println("QUEUE is EMPTY !!");


    }
//    public void show(){
//        for(Object item:queue){
//            if (item!=null)
//                System.out.print(item+"\t");
//        }
//
//    }
    public void show(){
//        System.out.println();
//        for (int i=front;i!=rear;i=(i+1)%5){
//            System.out.print("\t"+queue[i]);
//        }
        int i=front;

        // when the last element is inserted , front==rear,so we have to make the loop execute once,so we use do-while().

        do{
            System.out.print("\t"+queue[i]);
            i=(i+1)%5;
        }while (i!=rear);
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return getSize()==0;
    }

    public boolean isFull(){
        return getSize()==5;
    }

}
