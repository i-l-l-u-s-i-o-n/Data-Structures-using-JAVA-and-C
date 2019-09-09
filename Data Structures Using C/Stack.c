

/* author : Shivam Shukla */

#include<stdio.h>
#include<stdlib.h>

#define MAX 10

int stack[MAX];
int top=-1;


void push(int item){
	
	if(top==MAX-1){
		printf("\nOVERFLOW");
		return;
	}
	stack[++top]=item;
}

void pop(){
	
	if(top==-1){
		printf("\nUNDERFLOW");
		return;
	}
	
	printf("\nDeleted Element : %d",stack[top--]);
}

void show(){
	
	int i=0;
	printf("\n");
	for(i;i<=top;i++){
		printf("%d\t",stack[i]);
	}
	printf("\n");
}

int main(){
	
	push(5);
	push(18);
	push(22);
	push(45);
	push(3);
	push(55);
	show();
	pop();
	pop();
	show();
}

/*

OUTPUT->


5       18      22      45      3       55

Deleted Element : 55
Deleted Element : 3
5       18      22      45

*/
