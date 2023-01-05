import java.util.Scanner;
public class Lab2_2//matrixAddition
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a[][] = new int[2][2];
		int b[][] = new int[2][2];
		int sum[][] = new int[2][2];

		System.out.println("Enter first matrix");
		for(int i =0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}

		System.out.println("Enter second matrix");
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println("sum of two matrix");
		{
			for(int i=0;i<sum.length;i++)
			{
				for(int j=0;j<sum.length;j++)
				{
					sum[i][j]=a[i][j]+b[i][j];
				}
			}
			for(int i=0;i<sum.length;i++)
			{
				for(int j=0;j<sum.length;j++)
				{
					System.out.println(sum[i][j] +" ");
				}
			}
		}
	}
}