import java.util.Scanner;
class Queue{
	int [] a =new int[10];
	int front=-1, rear=-1;

	public void enqueue(int n){
		if(rear==9){
			System.out.println("Queue Overflow");
		}
		else{
			if(front==-1){
				front++;
			}
			rear++;
			a[rear]=n;
		}
	}
	public void dequeue(){
		if(front==-1){
			System.out.println("Queue Underflow");
		}
		else{
			front++;
		}
	}
	public void display(){
		System.out.print("content of Queue: ");
		if(front==-1){
			System.out.println("Queue Underflow");
		}
		else{
			for(int i=front ; i<=rear;i++){
				System.out.print(a[i]+" ");
			}
			System.out.println();
		}
	}
}
class Prog_15{
	public static void main(String[] args) {
		Queue q1=new Queue();
	q1.enqueue(5);
	q1.enqueue(6);
	q1.enqueue(7);
	q1.enqueue(8);
	q1.enqueue(9);
	q1.display();
	q1.dequeue();
	q1.dequeue();
	q1.display();
	}
}