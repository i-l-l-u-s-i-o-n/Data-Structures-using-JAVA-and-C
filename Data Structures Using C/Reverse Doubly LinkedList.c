

/*
	Name: Doubly Linked List
	Author: Shivam Shukla
	Date: 09-09-19 19:50
*/


#include<stdio.h>
#include<stdlib.h>

typedef struct dl{
	struct dl * prev;
	int data;
	struct dl * next;
} node;

node *head =NULL;

void insertAtBeg(int item){
	
	node *ptr =(node *)malloc(sizeof(node));
	
	ptr->data=item;
	ptr->prev=NULL;
	
	if(head==NULL){
		ptr->next=NULL;
		head=ptr;
	}else{
		ptr->next=head;
		head->prev=ptr;
		head=ptr;
	}
}


void deleteFromLast(){
	
	if(head==NULL){
		printf("EMPTY!!");
		return;
	}
	
	node *temp=head;
	while(temp->next!=NULL){
		temp=temp->next;
	}
	node * ptr = temp;
	temp->prev->next=NULL;
	temp->prev=NULL;
	
	free(ptr);
}

// REVERSE LOGIC

void reverse(){
	
	// We just have to swap the prev and next pointers!!!!!
	node * temp =head;
	node * ptr =NULL;
	while(temp!=NULL){
		ptr = temp->prev;
		temp->prev=temp->next;
		temp->next=ptr;
		
		// As now temp->prev holds the address of the next node ->
		temp=temp->prev;
	}
	
	// Now if there is only one node or no node then we need not to change the head.
	// But if it is a list of several Nodes, then we have to make last node as HEAD.
	if(head!=NULL || head->next!=NULL){
		head=ptr->prev;   // As ptr->prev holds the address of last node.
	}
}

void display(){
	if(head==NULL){
		printf("EMPTY!!");
		return;
	}
	
	printf("\n");
	node *temp=head;
	while(temp!=NULL){
		printf("%d\t",temp->data);
		temp=temp->next;
	}
	
}



int main(){
	
	insertAtBeg(700);
	insertAtBeg(78);
	insertAtBeg(60);
	insertAtBeg(71);
	insertAtBeg(75);
	insertAtBeg(76);
	
	display();				// 76      75      71      60      78      700

	
	deleteFromLast();
	
	display();				// 76      75      71      60      78
	
	reverse();
	
	display(); 			   // 78      60      71      75      76
}


