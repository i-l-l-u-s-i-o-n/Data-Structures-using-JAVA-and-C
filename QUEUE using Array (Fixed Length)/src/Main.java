/**
 * created by Shivam on 18-02-2019.
 */

// QUEUE -> FIFO (First IN First OUT)

/*
METHODS ->

enqueue(data) -> insert elements.

dequeue() -> remove elements.

isEmpty()

isFull()
 */
public class Main {

    public static void main(String[] args) {

        MyQueue<String> queue=new MyQueue<>();


        queue.enqueue("working");
        queue.enqueue("QUEUE");
        queue.enqueue("Hello");
        queue.enqueue("There !");
        queue.enqueue("it is fully");
        System.out.println("SIZE is : "+queue.getSize());
        queue.dequeue();
        queue.show();
        System.out.println();
        queue.enqueue("working");
        queue.enqueue("QUEUE");

        queue.dequeue();

        System.out.println("\nSIZE is : "+queue.getSize()+"\n");

        queue.show();
        System.out.println();
        queue.enqueue("QUEUE");
        queue.show();


    }

}

// OUTPUT ->

/*
SIZE is : 5

Deleted Element : working
	QUEUE	Hello	There !	it is fully
Queue is FULL

Deleted Element : QUEUE

SIZE is : 4

	Hello	There !	it is fully	working
	Hello	There !	it is fully	working	QUEUE
 */
