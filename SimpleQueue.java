import java.util.Scanner;
class Queue{
	int [] a =new int[10];
	int front=-1, rear=-1;

	public void enqueue(int n)
	{
		if(rear>=9)
		{
			System.out.println("Queue Overflow");
		}
		else
		{
			if(front==-1){
				front=0;
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
class SimpleQueue{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue q1=new Queue();
		System.out.println("1 for enqueue , 2 for dequeu , 3 for display");

		while(true)
		{
			System.out.println("Enter your Choice=");
			int ch=sc.nextInt();

			switch(ch)
			{
			case 1:
				System.out.println("Enter Value=");
				int n=sc.nextInt();

				q1.enqueue(n);
				break;

			case 2:
				q1.dequeue();
				break;

			case 3: 
				q1.display();
				break;

			default:
				return;
			}
		}
	}
}