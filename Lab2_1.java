import java.util.*;
public class Lab2_1//MatrixIndex
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size =");

		int n = sc.nextInt();
		int a[] = new int[n];

		System.out.println("Enter element=");

		for(int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}

		System.out.println("Enter find number=");

		int x = sc.nextInt();

		System.out.println("Enter replace number=");
		int y = sc.nextInt();

		for(int i=0;i<n;i++)
		{
			if(x==a[i])
			{
				a[i] = y;
				System.out.println("Index ="+i);
			}
		
		}
		System.out.println("Updated array");
		for(int i =0;i<n;i++)
		{
			System.out.println(a[i]+"");
		}
	}
}