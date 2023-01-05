import java.util.Scanner;
public class Lab1_3//prime
{
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		boolean flag = false;

		for(int i=2;i=num/2;i++)
		{
			if(i%2==0)
			{
				flag = true;
				break;
			}
		}
		if(flag)
		{
			System.out.println("number is not prime");
		}
		else
		{
			System.out.println("number is prime");
		}
		

	}
}