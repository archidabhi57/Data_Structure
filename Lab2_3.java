import java.util.*;
public class Lab2_3//matrixmulti
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int a[][] = new int [3][2];
		int b[][] = new int [2][3];
		int c[][] = new int [3][3];

		System.out.println("Enter first matrix=");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				a[i][j]= sc.nextInt();
			}
		}
		System.out.println("Enter second matrix=");
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				b[i][j]= sc.nextInt();
			}
		}
		System.out.println("multi");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				c[i][j]=a[i][0]+b[0][j]+a[i][1]+b[1][j];
				
				System.out.println(c[i][j] + " ");

			}
			System.out.println();
		}
	}
}

