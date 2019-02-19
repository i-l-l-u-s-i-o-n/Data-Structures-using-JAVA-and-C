package com.shivam;

import com.shivam.queue.MyQueue;

public class Main {

    public static void main(String[] args) {

        MyQueue<String> queue=new MyQueue<>();

        queue.enqueue("working");
        queue.enqueue("QUEUE");
        queue.enqueue("Hello");
        queue.enqueue("There !");
        queue.enqueue("it is fully");
        queue.size();
        queue.dequeue();
        queue.show();
        System.out.println();
        queue.enqueue("working");
        queue.enqueue("QUEUE");
        queue.size();

        queue.dequeue();

        queue.size();

        queue.show();
        System.out.println();
        queue.show();


    }
}


// OUTPUT ->

/*

Size : 5
Successfully Deleted : working
=============================QUEUE ELEMENTS============================
	[FRONT]	QUEUE
	[2]	Hello
	[3]	There !
	[REAR]	it is fully
========================================================================

Size : 6
Successfully Deleted : QUEUE
Size : 5
=============================QUEUE ELEMENTS============================
	[FRONT]	Hello
	[2]	There !
	[3]	it is fully
	[4]	working
	[REAR]	QUEUE
========================================================================

=============================QUEUE ELEMENTS============================
	[FRONT]	Hello
	[2]	There !
	[3]	it is fully
	[4]	working
	[REAR]	QUEUE
========================================================================


 */