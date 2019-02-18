/**
 * created by Shivam on 18-02-2019.
 */

// QUEUE -> FIFO (First IN First OUT)

/*
METHODS ->

enqueue(data) -> insert elements.

dequeue() -> remove elements.
 */
public class Main {

    public static void main(String[] args) {

        MyQueue<String> queue=new MyQueue<>();

        queue.enqueue("Hello ");
        queue.enqueue("There ! ");
        queue.enqueue("It's");
        queue.enqueue("in");
        queue.enqueue("Progress");

        queue.show();


        queue.dequeue();

        queue.show();


    }

}
