


/* author : Shivam Shukla */


#include<stdio.h>
#include<conio.h>

#define MAX 5

int queue[MAX];

int f=-1,r=-1;

void enqueue(int item){
	
	
	if((r+1)%MAX==f){
		printf("\nOVERFLOW\n");
		return;
	}
	
	if(r==-1){
		f=r=0;	
	}else{
		r=(r+1)%MAX;
	}
	
	queue[r]=item;
}

void dequeue(){
	
	if(f==-1){
		printf("UNDERFLOW");
		return;
	}
	
	int data=queue[f];
	
	if(f==r){
		f=r=-1;
	}else{
		f=(f+1)%MAX;
	}
	
	printf("\nDeleted Element : %d",data);
}

void show(){
	
	int i=f;
	printf("\n");
	
	do{
		printf("%d\t",queue[i]);
		i=(i+1)%MAX;
	}while(i!=r);
	

	printf("%d",queue[r]);
	
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
	
	enqueue(54);
	enqueue(332);
	show();
}
