import java.util.*;
public class Lab1_2//factorial(recursion)
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number=");
		int n = sc.nextInt();
		Rec re = new Rec();
		int fact=1;

		System.out.println("Factorial=" +re.fact(n));
	}
}
class Recursion
{
	fact(int n)
	{
		if(n<=1)
		{
			return 1;
		}
		else
		{
			return (n*fact(n-1));
		}
	}
}