

/*
	Name: Insert in sorted order and remove duplicate
	Author: Shivam Shukla
	Date: 09-09-19 15:28 
*/


#include<stdio.h>
#include<stdlib.h>

typedef struct ll{
	int data;
	struct ll *next;
} node;

node * head;

void insertInSortedOrder(int item){
	
	
	node *ptr =(node *)malloc(sizeof(node));
	ptr->data=item;
	ptr->next=NULL;
	
	if(head==NULL || item <= head->data){
		ptr->next=head;
		head=ptr;
		return;	
	}
	
	node * temp =head;
	
	
	while(temp->next !=NULL && temp->next->data < item ){
		temp=temp->next;
	}
	

	ptr->next=temp->next;
	temp->next=ptr;
	
	
}


// Removing duplicate elements
void removeDuplicateFromSortedLinkedList(){
	
	if(head==NULL){
		printf("Linked List is Empty!!");
		return;
	}
	node * temp =head;
	
	while(temp->next!=NULL ){
		
		if(temp->data== temp->next->data){
	
			node *ptr= temp->next;
			temp->next=temp->next->next;
			printf("\nRemoved duplicate element : %d",ptr->data);
			free(ptr);
		
		}else{
			temp=temp->next;
		}
	}
	

	
	}

void show(){
	
	node *temp = head;
	printf("\n");
	while(temp!=NULL){
		printf("%d\t",temp->data);
		temp=temp->next;
	}
	printf("\n");
}

int main(){
	
	insertInSortedOrder(5);
	insertInSortedOrder(9);
	insertInSortedOrder(32);
	insertInSortedOrder(32);
	insertInSortedOrder(35);
	insertInSortedOrder(4);
	insertInSortedOrder(4);
	insertInSortedOrder(32);
	insertInSortedOrder(17);
	
	show();
	
	removeDuplicateFromSortedLinkedList();
	show();
}


/*

OUTPUT ->

4       4       5       9       17      32      32      32      35

Removed duplicate element : 4
Removed duplicate element : 32
Removed duplicate element : 32
4       5       9       17      32      35

*/
