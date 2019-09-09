

/* author : Shivam Shukla */


#include<stdio.h>
#include<conio.h>

#define MAX 10

int queue[MAX];

int f=-1,r=-1;

void enqueue(int item){
	
	
	if(r==MAX-1){
		printf("\nOVERFLOW");
		return;
	}
	
	if(r==-1){
		f=r=0;	
	}else{
		r=r+1;
	}
	
	queue[r]=item;
}

void dequeue(){
	
	if(f==-1){
		printf("\nUNDERFLOW");
		return;
	}
	
	int data=queue[f];
	
	if(f==r){
		f=r=-1;
	}else{
		f+=1;
	}
	
	printf("\nDeleted Element : %d",data);
}

void show(){
	
	int i=f;
	printf("\n");
	for(i;i<=r;i++){
		printf("%d\t",queue[i]);
	}
	printf("\n");
	
}

int main(){
	
	enqueue(5);
	enqueue(78);
	enqueue(42);
	enqueue(65);
	enqueue(55);
	enqueue(43);
	enqueue(32);
	enqueue(4);
	show();
	dequeue();
	dequeue();
	show();
}
//
//OUTPUT->
//5       78      42      65      55      43      32      4
//
//Deleted Element : 5
//Deleted Element : 78
//42      65      55      43      32      4



