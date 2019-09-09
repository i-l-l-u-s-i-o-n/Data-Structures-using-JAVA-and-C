
/*
	Name: XOR Linked List
	Author: Shivam Shukla
	Date: 09-09-19 20:28
*/



#include<stdio.h>
#include<stdlib.h>
//#include <inttypes.h> 

typedef struct dl{
	int data;
	struct dl * npx;              // !!!!!!!!!!! Creating only one field to store the address of both(prev and next node).
} node;

node *head =NULL;


// performing XOR operation on the prev and next node address.
node * XOR(node *n1,node *n2){
	
	return (node *)((uintptr_t)n1 ^ (uintptr_t)n2);
}


// Inserting Nodes to XOR linked List
void insertAtStart(int item){
	
	node * ptr= (node *)malloc(sizeof(node));
	
	ptr->data=item;
	
	// Sice we are inserting the node at start, the npx will store the XOR of NULL(prev) and head(next).
	ptr->npx=XOR(head,NULL);
	
	// Now if list is not empty then ->
	if(head!=NULL){
		
		// We have to also make sure that the next node i.e. head also stores the address of new node as previous.
		// So we have to store the XOR of head->next and new node(it will be head->prev) to the head->npx.
		// Inorder to find the address of head->next, we have to XOR head->npx with NULL.
		// if C = A^B, then if we do C^A, we get B.
		// Same concept is used here also.
		
		node *nextNodeOfHead = XOR(head->npx,NULL);
		
		// Now we have the address of head->next and new node, so now we can perform XOR and store it in head->npx;
		head->npx=XOR(nextNodeOfHead,ptr);
	}
	
	// Now make head, the new inserted node!!!!!!!!
	head=ptr;
}


///// Traversing the XOR Linked List.

void traverse(){
	
	if(head==NULL){
		printf("List is EMPTY!!!!");
		return;
	}
	
	node *temp=head,*prev=NULL,*next;
	
	while(temp!=NULL){
		
		printf("%d\t",temp->data);
		
		// Finding address of next node!
		next= XOR(prev,temp->npx);
		
		// Setting prev to current node
		prev=temp;
		
		// Setting current pointer to next node;
		temp=next;
		
		// Now LOOP
	}
}


int main(){
	
	insertAtStart(78);
	insertAtStart(60);
	insertAtStart(76);
	insertAtStart(75);
	insertAtStart(71);
	
	traverse();  ///// 1      75      76      60      78
	
}




















