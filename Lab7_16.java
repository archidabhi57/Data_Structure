import java.util.*;
class CQueue{
	int [] a=new int[10];
	int front=-1,rear=-1,temp_rear=0,front_temp=0;

	public void CQInsert(int n){
		if(front==rear){
			System.out.println("Overflow");
			rear--;
		}
		else
		{
			if(front==-1)
			{
				front++;
			}
			else if(rear==n)
			{
				rear=1;
			}
			rear++;
			a[rear]=n;
		}
	}

	public void CQDelete(){
		if(front==-1){
			System.out.println("Underflow");
		}
		else{
			if(front==rear){
				front=0;
				rear=0;
			}
			else if(front==9){
				front=0;
			}
			front++;
			 int n=a[front];
		}
		
	}

	public void Display(){
		if(rear==a.length){
			for(int i=front_temp;i<=temp_rear;i++){
				System.out.println(a[i]);
			}
		}
		else if(rear!=a.length && rear>front){
			for(int i=front_temp;i<=temp_rear;i++){
				System.out.println(a[i]);
			}
		}
		else{
			for(int i=front_temp;i<=a.length;i++){
				System.out.println(a[i]);
			}
			for(int i=1;i<=rear;i++){
				System.out.println(a[i]);
			}
		}
	}
}
class Lab7_16
{
	public static void main(String[] args)
	{
		CQueue q1=new CQueue();
		q1.CQInsert(5);
		q1.CQInsert(6);
		q1.CQInsert(7);
		q1.CQInsert(8);
		q1.Display();
		q1.CQDelete();
		q1.CQDelete();
		q1.Display();
	}
}
