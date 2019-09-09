

/*
	Name: Queue using LinkedList
	Author: Shivam Shukla
	Date: 09-09-19 14:48
*/



#include<stdio.h>
#include<stdlib.h>



// In LinkedList Implementation of QUEUE, we have to INSERT elements at LAST and DELETE element from BEGENING of LinkedList.(FIFO - First IN First OUT)
// For this we can use 2 pointers REAR nad FRONT which will point the LAST and BEGENING of the LinkedList respectively!

// Creating structure of NODE
typedef struct cq{
	
	int data;
	struct cq *next;
} node ;

node *front =NULL, *rear=NULL;


// Insertion Operation
void enqueue(int item){
	
	node *ptr = (node *)malloc(sizeof(node));
	
	ptr->data=item;
	ptr->next=NULL;
	
	if(rear==NULL){
		front=rear=ptr;
	}else{
		rear->next=ptr;
		rear=ptr;
	}
  
}


// Deletion Operation
void dequeue(){
	if(front==NULL){
		printf("\nQueue is EMPTY !!");
		return;
	}
	
	int data=front->data;
	node *temp=front;
	front=front->next;
	free(temp);
	
	//printf("\nDeleted Element : %d",data);
}

// Displaying elements
void display(){
	node *temp= front;
	
	if(front==NULL){
		printf("\nQueue is EMPTY !");
		return;
	}
	
	printf("\n");
	while(temp!=NULL){
		printf("%d\t",temp->data);
		temp=temp->next;
	}
	printf("\n");
}


// main function
int main(){
	
	
	display();
	
	enqueue(100);
	enqueue(101);
	enqueue(78);
	enqueue(71);
	enqueue(75);
	enqueue(76);
	enqueue(60);
	enqueue(63);


	display();
	
	dequeue();
	dequeue();
	
	display();
	return 0;	
}

/*

OUTPUT ->

Queue is EMPTY !
100     101     78      71      75      76      60      63

78      71      75      76      60      63

*/


