import java.util.*;
class Node
{
	int info;
	Node link;
}

class Lab9_21
{
	static Scanner sc = new Scanner(System.in);
	static Node FIRST = null;
	static Node LAST = null;
	public static void main(String args[])
	{
		System.out.println("1. Insert \n 2.Display");
		int ch = sc.nextInt();

		while(true)
		{
			switch(ch)
			{
			case 1:
				FIRST = insert(sc.nextInt(),FIRST);
				break;

			case 2:
				display(FIRST);
				break;
			}
		System.out.println("1. Insert \n 2.Display");
		ch = sc.nextInt();
		}
	}

	public static Node insert(int x, Node FIRST, Node LAST)
	{
		Node newNode = new Node();
		newNode.info=x;

		if(FIRST == null)
		{
			newNode.link = newNode;
			FIRST=LAST=newNode;
		}
		else 
		{
			newNode.link = FIRST;
			LAST.link = newNode;
			FIRST = newNode;	
		}
		
	}

	public static void display(Node FIRST)
	{
		Node SAVE = FIRST;
		while(SAVE.link != null)
		{
			System.out.println(SAVE.info+"\t"+SAVE.link);
			SAVE = SAVE.link;
		}
		System.out.println(SAVE.info+"\t"+SAVE.link);
	}
}