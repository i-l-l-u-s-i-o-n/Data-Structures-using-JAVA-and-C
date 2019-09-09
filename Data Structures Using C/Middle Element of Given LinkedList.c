

/*
	Name: Finding Midle Element of LinkedList
	Author: Shivam Shukla
	Date: 09-09-19 19:00
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


void insertAtLast(int item){
	
	node * temp = head;
	node *ptr = (node *)malloc(sizeof(node));
	ptr->data=item;
	ptr->next=NULL;
	if(head==NULL){
		head = ptr;
		return;
	}
	
	while(temp->next!=NULL){
		temp=temp->next;
	}
	
	temp->next=ptr;	
}
void show(){
	
	node *temp = head;
	
	while(temp!=NULL){
		printf("%d\t",temp->data);
		temp=temp->next;
	}
	printf("\n");
}


// Finding Middle Element.
void findMiddleElement(){
	if(head==NULL){
		printf("LinkedList is EMPTY!!");
		return;
	}
	
	node *slow,*fast;
	slow=head;
	fast=head;
	
	
	// slow will move 1 step and fast will move 2 steps.
	// So when fast will reach the end, slow will reach the middle !!!!!!!
	while( fast!=NULL && fast->next!=NULL ){
		slow=slow->next;
		fast=fast->next->next;
	}
	printf("\nMiddle Element : %d",slow->data);
}

int main(){
	
	insertAtBeg(10);
	insertAtLast(9);
	insertAtLast(8);
	insertAtLast(7);
	insertAtLast(6);
	insertAtLast(5);
	insertAtLast(4);
	insertAtLast(3);
	insertAtLast(2);
	insertAtLast(1);
	
	show();
	
	
	findMiddleElement();
}


/* 

OUTPUT ->

10      9       8       7       6       5       4       3       2       1

Middle Element : 5

*/
