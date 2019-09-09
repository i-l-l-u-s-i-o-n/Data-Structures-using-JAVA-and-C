

/*
	Name: Reverse Singly LinkedList
	Author: Shivam Shukla
	Date: 09-09-19 15:10
*/


#include<stdio.h>
#include<stdlib.h>


typedef struct linkedList{
	int data;
	struct linkedList * next;
} node;

node * head;


void insertAtBeg(int item){
	
	node *ptr = (node *)malloc(sizeof(node));
	ptr->data=item;
	ptr->next= head;
	head = ptr;
	
}

void reverse(){	
	node *prev,*curr,*next;
	
	curr=head;
	prev=next=NULL;
	
	while(curr!=NULL){
		
		// Store next before removing the link to next node;
		next=curr->next;
		
		// Now set next of current to link to previous.
		curr->next=prev;
		
		// Now move curr and prev one step forward.
		prev=curr;
		curr=next;
		
	}
	
	head=prev;
	// It's done!!
}


void show(){
	
	node *temp = head;
	
	while(temp!=NULL){
		printf("%d\t",temp->data);
		temp=temp->next;
	}
	printf("\n");
}

int main(){
	
	insertAtBeg(4);
	insertAtBeg(46);
	insertAtBeg(7);
	insertAtBeg(67);
	insertAtBeg(1);
	insertAtBeg(22);
	insertAtBeg(3);
	
	show();
	
	reverse();
	
	show();
}

/*

OUTPUT ->

3       22      1       67      7       46      4
4       46      7       67      1       22      3


*/

