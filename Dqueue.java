import java.util.Scanner;
public class Dqueue
{
	public static void main(String[] args)
	{
		int q[] = new int[10];
		int front,rear,n;
	}
	public void dQInsert()
	{
		if(front==0)
		{
			System.out.println("Empty");
		}
		else if(front==1)
		{
			System.out.println("Overflow");
		}
		else
		{
			front++;
			q[front]=n;
		}
	}
	public void dQDelete()
	{
		if(rear==0)
		{
			System.out.println("Underflow");
		}
		else
		{
			if(rear==front)
			{
				rear=front=0;	
			}
			else
			{
				rear--;
			}
			n=q[rear];
		}


	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Elements");
		int n= sc.nextInt();
	}

}